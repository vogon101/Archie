package com.vogonjeltz.archie.AST.tree

import com.vogonjeltz.archie.AST.TreeWalk.ASTVisitor

/**
  * FunctionCall
  *
  * Created by fredd
  */
case class FunctionCall(element: Element, arguments: List[Element]) extends Element {

  override def accept[T](astVisitor: ASTVisitor[T]) = astVisitor.visitFunctionCall(this)

}



