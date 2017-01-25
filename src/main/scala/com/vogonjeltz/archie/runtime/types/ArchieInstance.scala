package com.vogonjeltz.archie.runtime.types


import com.vogonjeltz.archie.runtime.state.{ConcreteScope, ProgramContext, Scope, ScopeStack}

/**
  * Created by Freddie on 04/01/2017.
  */
abstract class ArchieInstance(val archieType: ArchieType, val constructorParams: List[ArchieInstance] = List()) {

  val scope: ScopeStack = new ScopeStack
  scope.set("this", this)

}

class FullArchieInstance(_at: ArchieType, _constructorParams: List[ArchieInstance] = List()) extends ArchieInstance(_at, _constructorParams) {

  def runMember(name: String, args: List[ArchieInstance] = List()):Option[ArchieInstance] =  {
    //TODO: Make this more debuggable
    scope.get(name).filter(_.isInstanceOf[ArchieFunction]).map(_.asInstanceOf[ArchieFunction]).flatMap(_.run(args))
  }

  for((name, member) <- archieType.members)
    scope.set(name, member())

  if (constructorParams.length != archieType.paramNames.length) {
    throw new Exception(s"Wrong number of params for ${archieType.name} instantiation (Got ${constructorParams.length}, expected ${archieType.paramNames.length}")
  }

  for (param <- constructorParams.zip(archieType.paramNames)) {
    scope.set(param._2, param._1)
  }

  ProgramContext.instance.scopeStack.push(scope) (archieType.instantiationFunction(_))

  override def toString = runMember("toString").toString

}
