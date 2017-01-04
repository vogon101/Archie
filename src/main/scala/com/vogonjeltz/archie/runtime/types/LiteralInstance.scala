package com.vogonjeltz.archie.runtime.types

import com.vogonjeltz.archie.runtime.library.Library
import com.vogonjeltz.archie.runtime.state.Scope
import com.vogonjeltz.archie.runtime.types.ArchieFunctionAdapter

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

class IntLiteralInstance(override val value: Int) extends LiteralInstance(LiteralInstance.IntType)

class FloatLiteralInstance(override val value: Float) extends LiteralInstance(LiteralInstance.FloatType)

