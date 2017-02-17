package com.vogonjeltz.archie.runtime

import com.vogonjeltz.archie.AST.tree._
import com.vogonjeltz.archie.AST.TreeWalk.ASTVisitor
import com.vogonjeltz.archie.runtime.state.{ConcreteScope, ProgramContext, Scope}
import com.vogonjeltz.archie.runtime.types._
import com.vogonjeltz.archie.utils.Log

/**
  * Created by Freddie on 04/01/2017.
  */
class Interpreter(val logLevel: Int = 0) extends ASTVisitor[Option[ArchieInstance]] {

  //TODO:Return Statements

  val context: ProgramContext = ProgramContext.instance(this)
  context.loadCoreLib()

  Log.setLevel(logLevel)

  override def default(e: Line) = ???

  override def visitAST(ast: AST) = super.visitAST(ast)

  //Lines
  override def visitClassDef(classDef: ClassDef) = {
    Log.info("Entering classdef")
    Log.info(classDef.params)
    val typ = new ArchieType(classDef.name, classDef.params, (s: Scope) => {
      classDef.body.map(_.accept(this))
    })
    Log.info(typ.name)
    Log.info(typ.paramNames)
    context.scopeStack.set(classDef.name, typ.wrapper)
    None
  }

  //Elements

  override def visitAssignment(assignment: Assignment) = {
    val value = assignment.value.accept(this)
    if(value.isEmpty) throw new Exception("Cannot assign to None")
    val assignmentContext = getIdentifierContext(assignment.id)
    if (assignmentContext._1.isEmpty)
      context.scopeStack.set(assignmentContext._2, value.get)
    else
      assignmentContext._1.get.scope.set(assignmentContext._2, value.get)
    None
  }

  override def visitCodeBlock(codeBlock: CodeBlock) = {
    val results = codeBlock.lines.map(_.accept(this))
    if (results.length < 1) None
    else results.last
  }

  override def visitComment(comment: Comment) = None

  //TODO: Know when the funciton is a member
  override def visitFunctionCall(functionCall: FunctionCall) = {
    val functionOption = functionCall.element.accept(this)
    Log.info(functionCall)

    functionOption match {
      case None => throw new Exception("Can't call a function on None")
      case Some(f: ArchieFunction) => runFunction(f, functionCall)
      case Some(other: FullArchieInstance) => {
        val args = functionCall.arguments.map(_.accept(this))
        if (args.contains(None)) throw new Exception(s"One or more argument for function $other is None")
        other.runMember("apply", functionCall.arguments.map(_.accept(this).get))
      }
    }
  }

  def runFunction(function: ArchieFunction, functionCall: FunctionCall): Option[ArchieInstance] = {
    val arguments = functionCall.arguments.map(_.accept(this))

    if (function.paramNames.length != functionCall.arguments.length)
      throw new Exception(s"Wrong number of arguments for function $function")
    if (arguments.contains(None))
      throw new Exception(s"One or more argument for function $function is None")

    val scope: Scope = new ConcreteScope()
    arguments.map(_.get).zip(function.paramNames).foreach(Z => scope.set(Z._2, Z._1))

    function match {
      case f: ArchieFunctionAdapter =>
        context.scopeStack.push(scope)(f.f)
      case f: ArchieElementFunction =>
        context.scopeStack.push[Option[ArchieInstance]](scope)((S: Scope) => f.e.accept(this))
    }
  }

  override def visitIdentifier(identifier: Identifier): Option[ArchieInstance] = identifier match {
    case compositeID: CompositeID =>
      val elementOption = compositeID.element.accept(this)
      if (elementOption.isEmpty)
        throw new Exception(s"Cannot resolve composite id on None ($compositeID)")
      var scope = elementOption.get
      for (name <- compositeID.textID.resolvePath) {
        val newScope = scope.scope.get(name)
        if (newScope.isEmpty)
          throw new Exception(s"Cannot find $name ($compositeID)")
        scope = newScope.get
      }
      Some(scope)

    case textID: TextID =>
      val scopeOption = context.scopeStack.get(textID.resolvePath.head)
      if (scopeOption.isEmpty)
        throw new Exception(s"Cannot find ${textID.resolvePath.head} ($textID)")
      var scope = scopeOption.get
      for (name <- textID.resolvePath.tail) {
        val newScope = scope.scope.get(name)
        if (newScope.isEmpty)
          throw new Exception(s"Cannot find $name ($textID)")
        scope = newScope.get
      }
      Some(scope)

  }

  def getIdentifierContext(identifier: Identifier):(Option[ArchieInstance], String) = identifier match {
    case compositeID: CompositeID =>
      (visitIdentifier(CompositeID(compositeID.element, compositeID.textID.contextPath)), compositeID.textID.resolvePath.last)
    case textID: TextID =>
      if (textID.resolvePath.isEmpty) throw new Exception(s"Too few elements in textID for context ($textID)")
      else if(textID.resolvePath.length == 1) (None, textID.resolvePath.last)
      else (visitIdentifier(textID.contextPath), textID.resolvePath.last)
  }

  override def visitLiteral(literal: Literal) = literal match {
    case s: StringLiteral => Some(new StringLiteralInstance(s.text))
    case b: BooleanLiteral => Some(new BooleanLiteralInstance(b.value))
    case i: IntegerLiteral => Some(new IntLiteralInstance(i.value))
    case f: FloatLiteral => Some(new FloatLiteralInstance(f.value))
  }

  override def visitOperatorResolver(operatorResolver: OperatorResolver) = {
    val element = operatorResolver.element.accept(this)
    if (element.isEmpty)
      throw new Exception(s"Cannot find resolve operator (${operatorResolver.name}) on None element ${operatorResolver.element}")
    val operator = element.get.scope.get(operatorResolver.name)
    if (operator.isEmpty) throw new Exception(s"Operator ${operatorResolver.name} not found on element ${element.get}")
    operator
  }

  override def visitFunctionLiteral(functionLiteral: FunctionLiteral) = {
    Some(new ArchieElementFunction(functionLiteral.paramNames, functionLiteral.element, Some(context.scopeStack.top)))
  }

  override def visitInstantiation(instantiation: Instantiation) = {
    Log.info(instantiation)
    Log.info(context.scopeStack.baseScope)
    val archieType = context.scopeStack.get(instantiation.name)
    if (archieType.isEmpty) throw new Exception(s"Cannot find type ${instantiation.name} ($instantiation)")
    val arguments = instantiation.constructorParams.map(_.accept(this))
    if (arguments.contains(None))
      throw new Exception(s"One or more argument for instantiation of ${instantiation.name} is None")

    archieType.get match {
      case archieTypeWrapper: ArchieTypeWrapper =>
        Some(new FullArchieInstance(archieTypeWrapper.wrappedArchieType, arguments.map(_.get)))
      case _ => throw new Exception(s"Tried to instantiate non-type (${archieType.get})")
    }
  }

}
