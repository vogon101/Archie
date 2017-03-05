package com.vogonjeltz.archie.AST.tree

import com.vogonjeltz.archie.AST.TreeWalk.ASTVisitor

/**
  * WhileLoop
  *
  * Created by fredd
  */
case class WhileLoop(condition: Element, block: Element)(implicit _sr: SourceReference) extends Element {

  override def accept[T](astVisitor: ASTVisitor[T]) = astVisitor.visitWhile(this)

}
