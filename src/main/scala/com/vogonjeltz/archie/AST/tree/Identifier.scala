package com.vogonjeltz.archie.AST.tree

import com.vogonjeltz.archie.AST.TreeWalk.ASTVisitor

/**
  * Identifier
  *
  * Created by fredd
  */
sealed abstract class Identifier extends Element {

  override def accept[T](astVisitor: ASTVisitor[T]) = astVisitor.visitIdentifier(this)

}

case class CompositeID(element: Element, textID: TextID) extends Identifier {

}

case class TextID(resolvePath: List[String]) extends Identifier {

  def contextPath: TextID = if (resolvePath.nonEmpty) TextID(resolvePath.init) else TextID(List())

}