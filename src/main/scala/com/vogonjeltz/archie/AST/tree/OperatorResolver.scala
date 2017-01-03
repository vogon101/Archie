package com.vogonjeltz.archie.AST.tree

import com.vogonjeltz.archie.AST.treeWalk.ASTVisitor

/**
  * Created by Freddie on 03/01/2017.
  */
case class OperatorResolver(element: Element, name: String) extends Element {

  override def accept[T](astVisitor: ASTVisitor[T]) = astVisitor.visitOperatorResolver(this)

}
