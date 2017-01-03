package com.vogonjeltz.archie.AST
import com.vogonjeltz.archie.AST.treeWalk.ASTVisitor

/**
  * FunctionLiteral
  *
  * Created by fredd
  */
case class FunctionLiteral(paramNames: List[String], element: Element) extends Element {

  override def accept[T](astVisitor: ASTVisitor[T]) = astVisitor.visitFunctionLiteral(this)

}
