package com.vogonjeltz.archie.runtime.types


import com.vogonjeltz.archie.runtime.state.{ConcreteScope, ProgramContext, Scope, ScopeStack}

/**
  * Created by Freddie on 04/01/2017.
  */
abstract class ArchieInstance(val archieType: ArchieType, val constructorParams: List[ArchieInstance] = List()) {

  //println(archieType)
  lazy val scope: ScopeStack = new ScopeStack(Some(this))
  //println(s"Scope: $scope")
  scope.set("this", this)

}

class ArchieNone extends ArchieInstance(ArchieType.ArchieTypeType) {

  override def toString: String = "None"

}

object ArchieNone {

  lazy val instance = new ArchieNone()

  def apply(): ArchieNone = instance
}

class FullArchieInstance(_at: ArchieType, _constructorParams: List[ArchieInstance] = List()) extends ArchieInstance(_at, _constructorParams) {

  //TODO: Stop working in Option[ArchieInstance] and start using ArchieInstance with ArchieNone

  def runMember(name: String, args: List[ArchieInstance] = List()):Option[ArchieInstance] =  {
    //TODO: Make this more debuggable
    //println(name)
    //println(args)
    //println(scope)
    //println(archieType.name)
    //val x = scope.get(name)
    //val y = x.filter(_.isInstanceOf[ArchieFunction])
    //val z = y.map(_.asInstanceOf[ArchieFunction])
    //val a = z.flatMap(_.run(args))

    scope.get(name).filter(_.isInstanceOf[ArchieFunction]).map(_.asInstanceOf[ArchieFunction]).flatMap(_.run(args))
  }

  for((name, member) <- archieType.members)
    scope.set(name, member.get(scope))

  if (constructorParams.length != archieType.paramNames.length) {
    throw new Exception(s"Wrong number of params for ${archieType.name} instantiation (Got ${constructorParams.length}, expected ${archieType.paramNames.length}")
  }

  for (param <- constructorParams.zip(archieType.paramNames)) {
    scope.set(param._2, param._1)
  }

  scope.set("this", this)
  ProgramContext.instance.scopeStack.push(scope) (archieType.instantiationFunction)

  override def toString = archieType.archieToString(scope).getOrElse(ArchieNone()).toString

}
