package com.vogonjeltz.archie.AST
import com.vogonjeltz.archie.AST.treeWalk.ASTVisitor

/**
  * FunctionCall
  *
  * Created by fredd
  */
case class FunctionCall(element: Element, arguments: List[Element]) extends Element {

  override def accept[T](astVisitor: ASTVisitor[T]) = astVisitor.visitFunctionCall(this)

}



