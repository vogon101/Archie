package com.vogonjeltz.archie.AST.tree

import com.vogonjeltz.archie.AST.TreeWalk.ASTVisitor

/**
  * Defines a program as a sequence of Lines
  * @param lines The lines that make up the program
  */
class AST(val lines: List[Line]) {

  override def toString: String = "AST : \n" + lines.map(L => L.toString + "\n").mkString

}

/**
  * The top level atom of the programming language. Accepts an ASTVisitor
  */
trait Line {

  def accept[T](astVisitor: ASTVisitor[T]): T

}

case class Comment(text: String) extends Line {

  override def accept[T](astVisitor: ASTVisitor[T]):T = astVisitor.visitComment(this)

}

case class ClassDef(name: String, params: List[String], body: Option[Element]) extends Line{

  override def accept[T](astVisitor: ASTVisitor[T]):T = astVisitor.visitClassDef(this)

}

/**
  * The basic unit of the Archie programming language.
  * @param sourceReference The reference to the source of this element used for debugging
  */
sealed abstract class Element (implicit val sourceReference: SourceReference) extends Line

case class Assignment(id: Identifier, value: Element) (implicit _sr: SourceReference) extends Element {

  override def accept[T](astVisitor: ASTVisitor[T]):T = astVisitor.visitAssignment(this)

}

case class CodeBlock(lines: List[Line])(implicit _sr: SourceReference) extends Element{

  override def accept[T](astVisitor: ASTVisitor[T]):T = astVisitor.visitCodeBlock(this)

}

case class FunctionCall(element: Element, arguments: List[Element])(implicit _sr: SourceReference) extends Element {

  override def accept[T](astVisitor: ASTVisitor[T]):T = astVisitor.visitFunctionCall(this)

}

case class FunctionLiteral(paramNames: List[String], element: Element)(implicit _sr: SourceReference) extends Element {

  override def accept[T](astVisitor: ASTVisitor[T]):T = astVisitor.visitFunctionLiteral(this)

}

sealed abstract class Identifier(implicit _sr: SourceReference) extends Element {

  override def accept[T](astVisitor: ASTVisitor[T]):T = astVisitor.visitIdentifier(this)

}

case class CompositeID(element: Element, textID: TextID)(implicit _sr: SourceReference) extends Identifier

case class TextID(resolvePath: List[String])(implicit _sr: SourceReference) extends Identifier {

  def contextPath: TextID = if (resolvePath.nonEmpty) TextID(resolvePath.init) else TextID(List())

}

case class Conditional(condition: Element, onTrue: Element, onFalse: Option[Element] = None)(implicit _sr: SourceReference) extends Element {

  override def accept[T](astVisitor: ASTVisitor[T]):T = astVisitor.visitConditional(this)

}

case class Instantiation(name: String, constructorParams: List[Element])(implicit _sr: SourceReference) extends Element {

  override def accept[T](astVisitor: ASTVisitor[T]):T = astVisitor.visitInstantiation(this)

}

/**
  * The superclass for all literals
  * @param _sr Implicit source reference
  */
sealed abstract class Literal(implicit _sr: SourceReference) extends Element {

  override def accept[T](astVisitor: ASTVisitor[T]):T = astVisitor.visitLiteral(this)

}

case class StringLiteral(text: String)(implicit _sr: SourceReference) extends Literal {

}

case class IntegerLiteral(value: Int)(implicit _sr: SourceReference) extends Literal {

}

case class FloatLiteral(value: Float)(implicit _sr: SourceReference) extends Literal {

}

case class BooleanLiteral(value: Boolean)(implicit _sr: SourceReference) extends Literal {

}

case class OperatorResolver(element: Element, name: String)(implicit _sr: SourceReference) extends Element {

  override def accept[T](astVisitor: ASTVisitor[T]):T = astVisitor.visitOperatorResolver(this)

}

case class ReturnElement(value: Element)(implicit sr: SourceReference) extends Element{

  override def accept[T](astVisitor: ASTVisitor[T]):T = astVisitor.visitReturn(this)

}

case class WhileLoop(condition: Element, block: Element)(implicit _sr: SourceReference) extends Element {

  override def accept[T](astVisitor: ASTVisitor[T]):T = astVisitor.visitWhile(this)

}

