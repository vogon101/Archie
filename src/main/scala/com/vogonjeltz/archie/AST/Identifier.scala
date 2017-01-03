package com.vogonjeltz.archie.AST
import com.vogonjeltz.archie.AST.treeWalk.ASTVisitor

/**
  * Identifier
  *
  * Created by fredd
  */
abstract class Identifier extends Element {

  override def accept[T](astVisitor: ASTVisitor[T]) = astVisitor.visitIdentifier(this)

}

case class CompositeID(element: Element, textID: TextID) extends Identifier {

}

case class TextID(resolvePath: List[String]) extends Identifier {

}

case class NewTextID(resolve: String) extends Identifier {

}