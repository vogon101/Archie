package com.vogonjeltz.archie.AST

/**
  * Identifier
  *
  * Created by fredd
  */
abstract class Identifier extends Element {

}

case class CompositeID(element: Element, textID: TextID) extends Identifier {

  def run() = ???

}

case class TextID(resolvePath: List[String]) extends Identifier {

  def run() = ???

}