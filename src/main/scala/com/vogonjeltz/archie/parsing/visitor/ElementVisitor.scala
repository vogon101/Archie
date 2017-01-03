package com.vogonjeltz.archie.parsing.visitor

import com.vogonjeltz.archie.AST._
import com.vogonjeltz.archie.parsing.antlr.archieParser._

import scala.collection.JavaConversions._

/**
  * Created by Freddie on 03/01/2017.
  */
class ElementVisitor extends ArchieVisitor[Element]{

  lazy val elementListVisitor = new ElementListVisitor(this)
  lazy val nameListVisitor = new NameListVisitor()
  lazy val literalVisitor = new LiteralVisitor()

  override def visitBracketedElement(ctx: BracketedElementContext) = {
    ctx.element().accept(this)
  }

  override def visitFunctionCall(ctx: FunctionCallContext):FunctionCall = {
    FunctionCall(
      ctx.element().accept(this),
      ctx.elementList().accept(elementListVisitor)
    )
  }

  override def visitFunctionLiteral(ctx: FunctionLiteralContext):FunctionLiteral = {
    FunctionLiteral(
      ctx.nameList().accept(nameListVisitor),
      ctx.element().accept(this)
    )
  }

  override def visitTextID(ctx: TextIDContext): TextID = {
    visitIdentifier(ctx.identifier())
  }

  override def visitIdentifier(ctx: IdentifierContext): TextID = {
    val names = ctx.name().toList.map(_.getText)
    if (names == null) throw new Exception("Identifier empty")
    TextID(names)
  }

  override def visitCombinedID(ctx: CombinedIDContext): CompositeID = {
    val names = ctx.name().toList.map(_.getText)
    if (names == null) throw new Exception("Identifier empty")
    CompositeID(
      ctx.element().accept(this),
      TextID(names)
    )
  }

  override def visitAssignment(ctx: AssignmentContext):Assignment = {
    Assignment (
      visitIdentifier(ctx.identifier()),
      ctx.element().accept(this)
    )
  }

  override def visitCodeBlock(ctx: CodeBlockContext):CodeBlock = {
    val elements = ctx.element().toList.map(_.accept(this))
    if (elements == null) CodeBlock(List())
    else CodeBlock(
      elements
    )
  }

  override def visitOpFunctionCall(ctx: OpFunctionCallContext): FunctionCall = {
    FunctionCall(
      OperatorResolver(
        ctx.element(0).accept(this),
        ctx.name().getText
      ),
      List(ctx.element(1).accept(this))
    )
  }

  override def visitLiteral(ctx: LiteralContext): Literal = {
    ctx.value().accept(literalVisitor)
  }

  override def visitNewObj(ctx: NewObjContext): Instantiation = {
    Instantiation(
      ctx.instantiation().name().getText,
      ctx.instantiation().elementList().accept(elementListVisitor)
    )
  }

}
