package com.vogonjeltz.archie.AST.tree

import com.vogonjeltz.archie.AST.TreeWalk.ASTVisitor

/**
  * Created by Freddie on 03/01/2017.
  */
case class Instantiation(name: String, constructorParams: List[Element])(implicit _sr: SourceReference) extends Element {

  override def accept[T](astVisitor: ASTVisitor[T]) = astVisitor.visitInstantiation(this)

}
