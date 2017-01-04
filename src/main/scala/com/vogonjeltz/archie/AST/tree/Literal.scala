package com.vogonjeltz.archie.AST.tree

import com.vogonjeltz.archie.AST.TreeWalk.ASTVisitor

/**
  * Created by Freddie on 03/01/2017.
  */
trait Literal extends Element {

  override def accept[T](astVisitor: ASTVisitor[T]) = astVisitor.visitLiteral(this)

}

case class StringLiteral(text: String) extends Literal {

}

case class IntegerLiteral(value: Int) extends Literal {

}

case class FloatLiteral(value: Float) extends Literal {

}

case class BooleanLiteral(value: Boolean) extends Literal {

}