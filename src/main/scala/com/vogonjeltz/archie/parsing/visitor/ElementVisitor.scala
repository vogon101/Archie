package com.vogonjeltz.archie.parsing.visitor

import com.vogonjeltz.archie.AST.tree._
import com.vogonjeltz.archie.parsing.antlr.archieParser._

import scala.collection.JavaConversions._

/**
  * Created by Freddie on 03/01/2017.
  */
class ElementVisitor extends ArchieVisitor[Element]{

  lazy val elementListVisitor = new ElementListVisitor(this)
  lazy val nameListVisitor = new NameListVisitor()
  lazy val literalVisitor = new LiteralVisitor()

  override def visitBracketedElement(ctx: BracketedElementContext): Element = {
    ctx.element().accept(this)
  }

  override def visitFunctionCall(ctx: FunctionCallContext):FunctionCall = {
    implicit val sc = SourceReference(ctx.start.getLine,ctx.getText)
    FunctionCall(
      ctx.element().accept(this),
      ctx.elementList().accept(elementListVisitor)
    )
  }

  override def visitFunctionLiteral(ctx: FunctionLiteralContext):FunctionLiteral = {
    implicit val sc = SourceReference(ctx.start.getLine,ctx.getText)
    FunctionLiteral(
      ctx.nameList().accept(nameListVisitor),
      ctx.element().accept(this)
    )
  }

  override def visitTextID(ctx: TextIDContext): TextID = {
    implicit val sc = SourceReference(ctx.start.getLine,ctx.getText)
    visitIdentifier(ctx.identifier())
  }

  override def visitIdentifier(ctx: IdentifierContext): TextID = {
    implicit val sc = SourceReference(ctx.start.getLine,ctx.getText)
    val names = ctx.name().toList.map(_.getText)
    if (names == null) throw new Exception("Identifier empty")
    TextID(names)
  }

  override def visitCombinedID(ctx: CombinedIDContext): CompositeID = {
    implicit val sc = SourceReference(ctx.start.getLine,ctx.getText)
    val names = ctx.name().toList.map(_.getText)
    if (names == null) throw new Exception("Identifier empty")
    CompositeID(
      ctx.element().accept(this),
      TextID(names)
    )
  }

  override def visitAssignment(ctx: AssignmentContext):Assignment = {
    implicit val sc = SourceReference(ctx.start.getLine,ctx.getText)
    Assignment (
      visitIdentifier(ctx.identifier()),
      ctx.element().accept(this)
    )
  }

  override def visitCodeBlock(ctx: CodeBlockContext):CodeBlock = {
    implicit val sc = SourceReference(ctx.start.getLine,ctx.getText)
    val elements = ctx.element().toList.map(_.accept(this))
    if (elements == null) CodeBlock(List())
    else CodeBlock(
      elements
    )
  }

  override def visitOpFunctionCall(ctx: OpFunctionCallContext): FunctionCall = {
    implicit val sc = SourceReference(ctx.start.getLine,ctx.getText)
    FunctionCall(
      OperatorResolver(
        ctx.element(0).accept(this),
        ctx.name().getText
      )(SourceReference(ctx.element(0).start.getLine,ctx.element(0).getText + " " + ctx.name().getText)),
      List(ctx.element(1).accept(this))
    )
  }

  override def visitLiteral(ctx: LiteralContext): Literal = {
    ctx.value().accept(literalVisitor)
  }

  override def visitNewObj(ctx: NewObjContext): Instantiation = {
    implicit val sc = SourceReference(ctx.start.getLine,ctx.getText)
    Instantiation(
      ctx.instantiation().name().getText,
      ctx.instantiation().elementList().accept(elementListVisitor)
    )
  }

  override def visitIf(ctx: IfContext): Element = {
    implicit val sc = SourceReference(ctx.start.getLine,ctx.getText)
    val condition = ctx.element(0).accept(this)
    val onTrue = ctx.element(1).accept(this)
    val onFalse = None
    Conditional(condition, onTrue, onFalse)
  }

  override def visitElseElement(ctx: ElseElementContext): Element = {
    implicit val sc = SourceReference(ctx.start.getLine,ctx.getText)
    val condition = ctx.element(0).accept(this)
    val onTrue = ctx.element(1).accept(this)
    val onFalse = Some(ctx.element(2).accept(this))
    Conditional(condition, onTrue, onFalse)
  }

  override def visitWhileElement(ctx: WhileElementContext): Element = {
    implicit val sc = SourceReference(ctx.start.getLine,ctx.getText)
    val condition = ctx.element(0).accept(this)
    val loop = ctx.element(1).accept(this)
    WhileLoop(condition, loop)
  }

  override def visitReturnElement(ctx: ReturnElementContext): Element = {
    implicit val sc = SourceReference(ctx.start.getLine,ctx.getText)
    val value = ctx.element().accept(this)
    ReturnElement(value)
  }

}