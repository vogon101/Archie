package com.vogonjeltz.archie.runtime.state

import com.vogonjeltz.archie.runtime.types.ArchieInstance

import scala.collection.mutable

/**
  * Created by Freddie on 04/01/2017.
  */
class ScopeStack extends Scope {

  val baseScope: Scope = new ConcreteScope

  private val scopes: mutable.Stack[Scope] = mutable.Stack(baseScope)

  def push[T](scope: Scope)(f: (Scope) => T): T = {
    scopes.push(scope)
    val retVal = f(this)
    scopes.pop()
    retVal
  }

  def push[T](f: Scope => T): T = push(new ConcreteScope)(f)

  def pushScopeStack[T](scope:Scope)(f: (ScopeStack) => T): T = {
    scopes.push(scope)
    val retVal = f(this)
    scopes.pop()
    retVal
  }

  override def set(name: String, instance: ArchieInstance) = {
    var existingScope: Scope = null
    scopes.foreach( S => if (existingScope == null && S.isSet(name)) existingScope = S)
    existingScope match {
      case e: Scope => e.set(name, instance)
      case null => scopes.head.set(name, instance)
    }
  }

  override def get(name: String): Option[ArchieInstance] = {
    for (scope <- scopes) {
      if (scope.isSet(name)) return scope.get(name)
    }
    None
  }

  override def isSet(name: String): Boolean = {
    for (scope <- scopes) {
      if (scope.isSet(name)) return  true
    }
    false
  }

  def setTop(name: String, instance:ArchieInstance) = {
    scopes.head.set(name, instance)
  }

}
