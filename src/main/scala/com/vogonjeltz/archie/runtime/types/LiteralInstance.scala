package com.vogonjeltz.archie.runtime.types

import com.vogonjeltz.archie.AST.tree.{FunctionCall, TextID}
import com.vogonjeltz.archie.runtime.library.Library
import com.vogonjeltz.archie.runtime.state.{ProgramContext, Scope}

/**
  * Created by Freddie on 04/01/2017.
  */
object LiteralInstance {

  val StringType = new LiteralType("String")
  val BooleanType = new LiteralType("Boolean")
  val IntType = new LiteralType("Int")
  val FloatType = new LiteralType("Float")

  val literalLib = new Library(List(StringType, BooleanType, IntType, FloatType))

}

class LiteralType(_name: String) extends ArchieType(_name, List(), (s: Scope) => {})

abstract class LiteralInstance(literalType: ArchieType) extends ArchieInstance(literalType) {

  val value: Any

  override def toString = value.toString

}

class StringLiteralInstance(override val value: String) extends LiteralInstance(LiteralInstance.StringType) {

  scope.set("+", new ArchieFunctionAdapter(List("other"), (s: Scope) => {
    Some(new StringLiteralInstance(value + s.get("other").get))
  }))

}

class BooleanLiteralInstance(override val value: Boolean) extends LiteralInstance(LiteralInstance.BooleanType)

sealed class NumericalInstance[T](_archieType: ArchieType, override val value: T) extends LiteralInstance(_archieType) {

  scope.set("+", new ArchieFunctionAdapter(List("other"), (s: Scope) => {
    val otherVal = ProgramContext.instance.interpreter.visitFunctionCall(
      FunctionCall(TextID(List("this", "toFloat")), List())
    )
    if (otherVal.isEmpty) throw new Exception(s"Couldn't convert ${s.get("other")} to float")
    else {
      otherVal.get match {
        case v: NumericalInstance[Float] => Some(new FloatLiteralInstance(value.asInstanceOf[Float] + v.value))
        case _ => None
      }
    }
  }))

  scope.set("-", new ArchieFunctionAdapter(List("other"), (s: Scope) => {
    val otherVal = ProgramContext.instance.interpreter.visitFunctionCall(
      FunctionCall(TextID(List("this", "toFloat")), List())
    )
    if (otherVal.isEmpty) throw new Exception(s"Couldn't convert ${s.get("other")} to float")
    else {
      otherVal.get match {
        case v: NumericalInstance[Float] => Some(new FloatLiteralInstance(value.asInstanceOf[Float] + v.value))
        case _ => None
      }
    }
  }))

}

class IntLiteralInstance(_value: Int) extends NumericalInstance[Int](LiteralInstance.IntType, _value)

class FloatLiteralInstance(_value: Float) extends NumericalInstance[Float](LiteralInstance.FloatType, _value)

