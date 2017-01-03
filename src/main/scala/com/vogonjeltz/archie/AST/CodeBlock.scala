package com.vogonjeltz.archie.AST
import com.vogonjeltz.archie.AST.treeWalk.ASTVisitor

/**
  * Created by Freddie on 02/01/2017.
  */
case class CodeBlock(lines: List[Line]) extends Element{

  override def accept[T](astVisitor: ASTVisitor[T]) = astVisitor.visitCodeBlock(this)

}