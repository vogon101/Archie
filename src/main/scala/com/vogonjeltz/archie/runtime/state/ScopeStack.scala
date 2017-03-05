package com.vogonjeltz.archie.runtime.state

import com.vogonjeltz.archie.runtime.types.ArchieInstance

import scala.collection.mutable

/**
  * Created by Freddie on 04/01/2017.
  */
class ScopeStack(override val _container: Option[ArchieInstance], val baseScope:Option[Scope] = None) extends Scope {


  override def container: ArchieInstance = _container match {
    case Some(instance) => instance
    case None => top.container
  }

  private val scopes: mutable.Stack[Scope] =
    if (baseScope.isDefined) mutable.Stack(baseScope.getOrElse(new ConcreteScope(_container)), new ConcreteScope(_container))
    else mutable.Stack(new ConcreteScope(_container))

  def push[T](scope: Scope)(f: (Scope) => T): T = {
    scopes.push(scope)
    val retVal = f(this)
    scopes.pop()
    retVal
  }

  def push[T](f: Scope => T): T = push(new ConcreteScope(_container))(f)

  def pushScope(s:Scope): Unit = scopes.push(s)
  def pop(): Unit = scopes.pop()

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

  def top:Scope = scopes.head

  override def toString: String = "ScopeStack (" + scopes.map(_.toString).mkString(", ") + ")"

}
