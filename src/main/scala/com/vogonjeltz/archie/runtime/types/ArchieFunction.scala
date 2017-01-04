package com.vogonjeltz.archie.runtime.types

import com.vogonjeltz.archie.AST.tree.Element
import com.vogonjeltz.archie.runtime.state.Scope

/**
  * Created by Freddie on 04/01/2017.
  */
abstract class ArchieFunction(val paramNames: List[String] = List()) extends ArchieInstance(ArchieFunctionType.typeInstance) {

}

class ArchieFunctionAdapter (_paramNames: List[String], val f: (Scope) => Option[ArchieInstance]) extends ArchieFunction(_paramNames) {

  //def this(_paramNames: List[String], f: (Scope) => Unit) = this(_paramNames, (s: Scope) => {f(s); None})

}

class ArchieElementFunction(_paramNames: List[String], val e: Element) extends ArchieFunction(_paramNames)

class ArchieFunctionType extends ArchieType("Function", List(), (s: Scope) => {}){

}

object ArchieFunctionType {
  lazy val typeInstance = new ArchieFunctionType
}