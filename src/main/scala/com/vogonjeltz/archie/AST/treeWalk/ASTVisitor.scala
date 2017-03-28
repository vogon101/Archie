package com.vogonjeltz.archie.AST.TreeWalk

import com.vogonjeltz.archie.AST.tree._

/**
  * Created by Freddie on 03/01/2017.
  */
abstract class ASTVisitor[T] {

  def default(e: Line): T

  def visitAST(ast:AST): Any = {
    ast.lines.foreach(_.accept(this))
  }


  def visitCodeBlock(codeBlock: CodeBlock) = default(codeBlock)

  def visitFunctionCall(functionCall: FunctionCall) = default(functionCall)

  def visitOperatorResolver(operatorResolver: OperatorResolver) = default(operatorResolver)

  def visitFunctionLiteral(functionLiteral: FunctionLiteral) = default(functionLiteral)

  def visitIdentifier(identifier: Identifier) = default(identifier)

  def visitLiteral(literal: Literal) = default(literal)

  def visitComment(comment: Comment) = default(comment)

  def visitAssignment(assignment: Assignment) = default(assignment)

  def visitInstantiation(instantiation: Instantiation) = default(instantiation)

  def visitClassDef(classDef: ClassDef) = default(classDef)

  def visitConditional(ifStatement:Conditional) = default(ifStatement)

  def visitWhile(whileLoop: WhileLoop) = default(whileLoop)

  def visitReturn(returnElement: ReturnElement) = default(returnElement)

}

abstract class ASTTransformVisitor[R <: Line] extends ASTVisitor[Line] {

  override def visitAST(ast: AST): AST = {
    new AST(ast.lines.map(_.accept(this)))
  }

  override def visitCodeBlock(codeBlock: CodeBlock): CodeBlock = {
    CodeBlock(
      codeBlock.lines.map(_.accept(this))
    )(codeBlock.sourceReference)
  }

  def visitElement(e: Element) = e.accept(this)
  def visitLine(l: Line) = l.accept(this)

}
