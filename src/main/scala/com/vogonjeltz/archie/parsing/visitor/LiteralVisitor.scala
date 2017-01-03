package com.vogonjeltz.archie.parsing.visitor

import com.vogonjeltz.archie.AST._
import com.vogonjeltz.archie.parsing.antlr.archieParser._

/**
  * Created by Freddie on 03/01/2017.
  */
class LiteralVisitor extends ArchieVisitor[Literal]{

  override def visitIntegerLiteral(ctx: IntegerLiteralContext) = {
    IntegerLiteral(ctx.getText.toInt)
  }

  override def visitFloatLiteral(ctx: FloatLiteralContext) = {
    FloatLiteral(ctx.getText.toFloat)
  }

  override def visitStringLiteral(ctx: StringLiteralContext) = {
    val text = ctx.getText
    StringLiteral(text.substring(1, text.length-1))
  }

  override def visitBooleanLiteral(ctx: BooleanLiteralContext) = {
    BooleanLiteral(ctx.getText.toBoolean)
  }

}
