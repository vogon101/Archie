package com.vogonjeltz.archie.AST.tree
import com.vogonjeltz.archie.AST.TreeWalk.ASTVisitor

/**
  * Conditional
  *
  * Created by fredd
  */
case class Conditional(condition: Element, onTrue: Element, onFalse: Option[Element] = None)(implicit _sr: SourceReference) extends Element {

  override def accept[T](astVisitor: ASTVisitor[T]) = astVisitor.visitConditional(this)

}