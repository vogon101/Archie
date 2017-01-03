package com.vogonjeltz.archie.AST.tree

import com.vogonjeltz.archie.AST.treeWalk.ASTVisitor

/**
  * Created by Freddie on 03/01/2017.
  */
case class ClassDef(name: String, params: List[String], body: Option[Element]) extends Line{

  override def accept[T](astVisitor: ASTVisitor[T]) = astVisitor.visitClassDef(this)

}
