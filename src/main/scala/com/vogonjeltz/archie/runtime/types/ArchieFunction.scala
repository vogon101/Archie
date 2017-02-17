package com.vogonjeltz.archie.runtime.types

import com.vogonjeltz.archie.AST.tree.{Element, FunctionCall}
import com.vogonjeltz.archie.runtime.state.{ConcreteScope, ProgramContext, Scope, ScopeStack}

/**
  * Created by Freddie on 04/01/2017.
  */
abstract class ArchieFunction(val paramNames: List[String] = List(), val baseScope: Option[Scope] = Some(new ConcreteScope)) extends FullArchieInstance(ArchieFunctionType.typeInstance) {

  //runoverride val scope: ScopeStack = new ScopeStack(Some(this), baseScope)
  //println(s"Scope : $scope")

  def run(params: List[ArchieInstance]): Option[ArchieInstance]

}

class ArchieFunctionAdapter (_paramNames: List[String], val f: (Scope) => Option[ArchieInstance], val closure: Option[Scope]) extends ArchieFunction(_paramNames, closure) {

  override def run(params: List[ArchieInstance]) = {
    if(params.length != _paramNames.length) {
      throw new Exception("Wrong number of arguments for function " + runMember("toString").get + s" (expected ${paramNames.length}, got ${params.length})")
    }
    scope.push ((s: Scope) => {
      for (param <- params.zip(paramNames)) {
        s.set(param._2, param._1)
      }
      f(s)
    })
  }

}

class ArchieElementFunction(_paramNames: List[String], val e: Element, val closure: Option[Scope]) extends ArchieFunction(_paramNames, closure) {

  override def run(params: List[ArchieInstance]) = {
    if(params.length != _paramNames.length) {
      throw new Exception("Wrong number of arguments for function " + runMember("toString").get + s" (expected ${paramNames.length}, got ${params.length})")
    }
    scope.push ((s: Scope) => {
      for (param <- params.zip(paramNames)) {
        s.set(param._2, param._1)
      }
      e.accept(ProgramContext.instance.interpreter)
    })
  }

}

class ArchieFunctionType extends ArchieType("Function", List(), (s: Scope) => {}){

}

object ArchieFunctionType {
  lazy val typeInstance = new ArchieFunctionType
}