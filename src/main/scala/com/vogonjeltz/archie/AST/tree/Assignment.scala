package com.vogonjeltz.archie.AST.tree

import com.vogonjeltz.archie.AST.treeWalk.ASTVisitor

/**
  * Created by Freddie on 03/01/2017.
  */
case class Assignment(id: Identifier, value: Element) extends Element {

  override def accept[T](astVisitor: ASTVisitor[T]) = astVisitor.visitAssignment(this)

}
