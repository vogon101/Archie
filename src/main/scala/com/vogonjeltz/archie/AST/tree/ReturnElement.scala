package com.vogonjeltz.archie.AST.tree
import com.vogonjeltz.archie.AST.TreeWalk.ASTVisitor

/**
  * Created by Freddie on 05/03/2017.
  */
case class ReturnElement(val value: Element)(implicit sr: SourceReference) extends Element{

  override def accept[T](astVisitor: ASTVisitor[T]) = astVisitor.visitReturn(this)

}
