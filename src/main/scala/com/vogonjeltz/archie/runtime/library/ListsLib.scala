package com.vogonjeltz.archie.runtime.library

import com.vogonjeltz.archie.AST.tree.IntegerLiteral
import com.vogonjeltz.archie.runtime.state.Scope
import com.vogonjeltz.archie.runtime.types._

/**
  * ListsLib
  *
  * Created by fredd
  */
class ListsLib extends Library {

  override lazy val types = List(
    ListType
  )

}

object ListType extends ArchieType("List", List(), (s: Scope) => {}) {

}

class ListInstance(val items: List[ArchieInstance] = List()) extends FullArchieInstance(ListType) {

  override def toString: String = "List(" + items.mkString(", ") + ")"

  val getFunction = new ArchieFunctionAdapter(
    List("n"),
    (s: Scope) => {
      val n = s.get("n").getOrElse(ArchieNone())
      n match {
        case n: IntLiteralInstance =>
          if (items.length > n.value) Some(items(n.value))
          else throw new Exception("No such element " + n.value)
        case _ => throw new Exception("n passed to list access not an integer")
      }
    }, Some(scope))

  val appendFunction = new ArchieFunctionAdapter(
    List("object"),
    (s: Scope) => {
      val obj = s.get("object").getOrElse(ArchieNone())
      obj match {
        case a if a == ArchieNone.instance => throw new Exception("Can't append None")
        case o => Some(new ListInstance((o :: items).reverse))
      }
    }, Some(scope))

  val prependFunction = new ArchieFunctionAdapter(
    List("object"),
    (s: Scope) => {
      val obj = s.get("object").getOrElse(ArchieNone())
      obj match {
        case a if a == ArchieNone.instance => throw new Exception("Can't append None")
        case o => Some(new ListInstance(o :: items))
      }
    }, Some(scope))



  scope.set("get", getFunction)
  scope.set("apply", getFunction)
  scope.set("append", appendFunction)
  scope.set("+", appendFunction)
  scope.set("prepend", prependFunction)


}


