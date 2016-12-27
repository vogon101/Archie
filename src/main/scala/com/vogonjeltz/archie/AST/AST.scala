package com.vogonjeltz.archie.AST

/**
  * AST
  *
  * Created by fredd
  */
class AST(val lines: List[Line]) {

  override def toString: String = "AST : " + lines.toString()

}

abstract class Line {

  def run()

}

case class Assignment(id: Identifier, value: Element) extends Line {

  def run() = ???

}

case class Comment(text: String) extends Line {

  def run() = {

  }

}