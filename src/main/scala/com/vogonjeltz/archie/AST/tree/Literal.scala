package com.vogonjeltz.archie.AST.tree

import com.vogonjeltz.archie.AST.TreeWalk.ASTVisitor

/**
  * Created by Freddie on 03/01/2017.
  */
abstract class Literal(implicit _sr: SourceReference) extends Element {

  override def accept[T](astVisitor: ASTVisitor[T]) = astVisitor.visitLiteral(this)

}

case class StringLiteral(text: String)(implicit _sr: SourceReference) extends Literal {

}

case class IntegerLiteral(value: Int)(implicit _sr: SourceReference) extends Literal {

}

case class FloatLiteral(value: Float)(implicit _sr: SourceReference) extends Literal {

}

case class BooleanLiteral(value: Boolean)(implicit _sr: SourceReference) extends Literal {

}