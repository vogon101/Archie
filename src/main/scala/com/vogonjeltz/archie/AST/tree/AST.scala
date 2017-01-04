package com.vogonjeltz.archie.AST.tree

import com.vogonjeltz.archie.AST.TreeWalk.ASTVisitor

/**
  * AST
  *
  * Created by fredd
  */
class AST(val lines: List[Line]) {

  override def toString: String = "AST : \n" + lines.map(L => L.toString + "\n").mkString

}

trait Line {

  def accept[T](astVisitor: ASTVisitor[T]): T

}

case class Comment(text: String) extends Line {

  override def accept[T](astVisitor: ASTVisitor[T]) = astVisitor.visitComment(this)

}