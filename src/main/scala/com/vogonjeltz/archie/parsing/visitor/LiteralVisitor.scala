package com.vogonjeltz.archie.parsing.visitor

import com.vogonjeltz.archie.AST.tree._
import com.vogonjeltz.archie.parsing.antlr.archieParser._

/**
  * Created by Freddie on 03/01/2017.
  */
class LiteralVisitor extends ArchieVisitor[Literal]{

  override def visitIntegerLiteral(ctx: IntegerLiteralContext) = {
    implicit val sc = SourceReference(ctx.start.getLine,ctx.getText)
    IntegerLiteral(ctx.getText.toInt)
  }

  override def visitFloatLiteral(ctx: FloatLiteralContext) = {
    implicit val sc = SourceReference(ctx.start.getLine,ctx.getText)
    FloatLiteral(ctx.getText.toFloat)
  }

  override def visitStringLiteral(ctx: StringLiteralContext) = {
    implicit val sc = SourceReference(ctx.start.getLine,ctx.getText)
    val text = ctx.getText
    StringLiteral(text.substring(1, text.length-1))
  }

  override def visitBooleanLiteral(ctx: BooleanLiteralContext) = {
    implicit val sc = SourceReference(ctx.start.getLine,ctx.getText)
    BooleanLiteral(ctx.getText.toBoolean)
  }

}
