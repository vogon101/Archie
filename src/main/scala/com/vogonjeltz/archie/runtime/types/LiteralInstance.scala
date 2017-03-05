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

class LiteralType(_name: String) extends ArchieType(_name, List(), (s: Scope) => {}) {

}

abstract class LiteralInstance(literalType: ArchieType) extends FullArchieInstance(literalType) {

  val value: Any

  override def toString = value.toString

  def toFloat: FloatLiteralInstance

  scope.set("toFloat", new ArchieFunctionAdapter(List(), (s: Scope) => {
    Some(toFloat)
  }, Some(scope)))

  override def equals(obj: scala.Any): Boolean = {
    obj match {
      case literal: LiteralInstance => literal.value == value
      case _ => false
    }
  }

}

class StringLiteralInstance(override val value: String) extends LiteralInstance(LiteralInstance.StringType) {

  def + (that: ArchieInstance) = new StringLiteralInstance(value + that.toString)

  override def toFloat = FloatLiteralInstance(value.toFloat)

  scope.set("+", new ArchieFunctionAdapter(List("other"), (s: Scope) => {
    Some(this + s.get("other").get)
  }, Some(scope)))

}

case class BooleanLiteralInstance(override val value: Boolean) extends LiteralInstance(LiteralInstance.BooleanType) {

  def toFloat = throw new Exception("Cannot implicitly cast boolean to a float")

  scope.set("&&", new ArchieFunctionAdapter(List("other"), (s: Scope) => {
    s.get("other") match {
      case Some(BooleanLiteralInstance(otherVal)) => Some(BooleanLiteralInstance(value && otherVal))
      case _ => throw new Exception("Not boolean for &&")
    }
  }, Some(scope)))

  scope.set("||", new ArchieFunctionAdapter(List("other"), (s: Scope) => {
    s.get("other") match {
      case Some(BooleanLiteralInstance(otherVal)) => Some(BooleanLiteralInstance(value || otherVal))
      case _ => throw new Exception("Not boolean for &&")
    }
  }, Some(scope)))



}


sealed abstract class NumericalInstance[T](_archieType: ArchieType, override val value: T) extends LiteralInstance(_archieType) {

  scope.set("+", new ArchieFunctionAdapter(List("other"), (s: Scope) => {
    val otherVal = s.get("other")
    this match {
      case thisNumber: IntLiteralInstance => otherVal match {
        case Some(thatNumber: IntLiteralInstance) => Some(IntLiteralInstance(thisNumber.value + thatNumber.value))
        case Some(thatNumber: LiteralInstance) => Some(FloatLiteralInstance(thisNumber.value + thatNumber.toFloat.value))
        case _ => ???
      }
      case thisNumber: FloatLiteralInstance => otherVal match {
        case Some(thatNumber: LiteralInstance) => Some(FloatLiteralInstance(thisNumber.value + thatNumber.toFloat.value))
        case _ => ???
      }
    }
  }, Some(scope)))

  scope.set("-", new ArchieFunctionAdapter(List("other"), (s: Scope) => {
    val otherVal = s.get("other")
    this match {
      case thisNumber: IntLiteralInstance => otherVal match {
        case Some(thatNumber: IntLiteralInstance) => Some(IntLiteralInstance(thisNumber.value - thatNumber.value))
        case Some(thatNumber: LiteralInstance) => Some(FloatLiteralInstance(thisNumber.value - thatNumber.toFloat.value))
        case _ => ???
      }
      case thisNumber: FloatLiteralInstance => otherVal match {
        case Some(thatNumber: LiteralInstance) => Some(FloatLiteralInstance(thisNumber.value - thatNumber.toFloat.value))
        case _ => ???
      }
    }
  }, Some(scope)))

  scope.set("<", new ArchieFunctionAdapter(List("that"), (s: Scope) => {
    val otherVal = s.get("that")
    otherVal match {
      case None => throw new Exception("Cannot perform < on none")
      case Some(instance: FullArchieInstance) => {
        val floatValue = instance.runMember("toFloat").getOrElse(throw new Exception(s"Cannot cast $instance to float, please provide toFloat helper"))
        floatValue match {
          case FloatLiteralInstance(float) => Some(BooleanLiteralInstance(toFloat.value < float))
          case _ => throw new Exception(s"toFloat member of $instance did not return a float")
        }
      }
    }
  }, Some(scope)))

  scope.set(">", new ArchieFunctionAdapter(List("that"), (s: Scope) => {
    val otherVal = s.get("that")
    otherVal match {
      case None => throw new Exception("Cannot perform < on none")
      case Some(instance: FullArchieInstance) => {
        val floatValue = instance.runMember("toFloat").getOrElse(throw new Exception(s"Cannot cast $instance to float, please provide toFloat helper"))
        floatValue match {
          case FloatLiteralInstance(float) => Some(BooleanLiteralInstance(toFloat.value > float))
          case _ => throw new Exception(s"toFloat member of $instance did not return a float")
        }
      }
    }
  }, Some(scope)))

  scope.set("<=", new ArchieFunctionAdapter(List("that"), (s: Scope) => {
    val otherVal = s.get("that")
    otherVal match {
      case None => throw new Exception("Cannot perform < on none")
      case Some(instance: FullArchieInstance) => {
        val floatValue = instance.runMember("toFloat").getOrElse(throw new Exception(s"Cannot cast $instance to float, please provide toFloat helper"))
        floatValue match {
          case FloatLiteralInstance(float) => Some(BooleanLiteralInstance(toFloat.value <= float))
          case _ => throw new Exception(s"toFloat member of $instance did not return a float")
        }
      }
    }
  }, Some(scope)))

  scope.set(">=", new ArchieFunctionAdapter(List("that"), (s: Scope) => {
    val otherVal = s.get("that")
    otherVal match {
      case None => throw new Exception("Cannot perform < on none")
      case Some(instance: FullArchieInstance) => {
        val floatValue = instance.runMember("toFloat").getOrElse(throw new Exception(s"Cannot cast $instance to float, please provide toFloat helper"))
        floatValue match {
          case FloatLiteralInstance(float) => Some(BooleanLiteralInstance(toFloat.value >= float))
          case _ => throw new Exception(s"toFloat member of $instance did not return a float")
        }
      }
    }
  }, Some(scope)))

}

case class IntLiteralInstance(override val value: Int) extends NumericalInstance[Int](LiteralInstance.IntType, value) {

  override def toFloat = FloatLiteralInstance(value.toFloat)

}

case class FloatLiteralInstance(override val value: Float) extends NumericalInstance[Float](LiteralInstance.FloatType, value) {

  override def toFloat = this

}
