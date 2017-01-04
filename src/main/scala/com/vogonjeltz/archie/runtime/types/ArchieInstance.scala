package com.vogonjeltz.archie.runtime.types


import com.vogonjeltz.archie.runtime.state.{ConcreteScope, ProgramContext, Scope, ScopeStack}

/**
  * Created by Freddie on 04/01/2017.
  */
abstract class ArchieInstance(val archieType: ArchieType, val constructorParams: List[ArchieInstance] = List()) {

  val scope: Scope = new ConcreteScope
  scope.set("this", this)

  if (constructorParams.length != archieType.paramNames.length) {
    throw new Exception(s"Wrong number of params for ${archieType.name} instantiation (Got ${constructorParams.length}, expected ${archieType.paramNames.length}")
  }

  for (param <- constructorParams.zip(archieType.paramNames)) {
    scope.set(param._2, param._1)
  }

  ProgramContext.instance.scopeStack.push(scope) (archieType.instantiationFunction(_))

}

class ConcreteArchieInstance(_at: ArchieType, _constructorParams: List[ArchieInstance] = List()) extends ArchieInstance(_at, _constructorParams) {


  scope.set("toString", new ArchieFunctionAdapter(List(), (s: Scope) => {Some(new StringLiteralInstance(this.toString))}))

  override def toString = s"${archieType.name} ($scope)"

}
