package com.vogonjeltz.archie.runtime.state

import com.vogonjeltz.archie.runtime.types.{ArchieFunction, ArchieInstance, LazyArchieFunction, LazyArchieInstance}

import scala.collection.mutable

/**
  * Created by Freddie on 04/01/2017.
  */
trait Scope {

  val _container: Option[ArchieInstance] = None

  def set(name: String, instance: ArchieInstance): Unit

  def get(name: String): Option[ArchieInstance]

  def forceGet(name: String): ArchieInstance = get(name).get

  def getOrElse(name: String, alt: => ArchieInstance) = get(name).getOrElse(alt)

  def isSet(name: String): Boolean

  def apply(name: String): Option[ArchieInstance] = get(name)

  def container: ArchieInstance = _container match {
    case Some(c) => c
    case None => throw new Exception("Tried to access container of scope not contained")
  }


  def getFunction(name:String): Option[ArchieFunction] = {
    val f = get(name)
    f match {
      case Some(f: ArchieFunction) => Some(f)
      case _ => None
    }
  }

}

class ConcreteScope(override val _container: Option[ArchieInstance] = None) extends Scope {

  private val variables = mutable.HashMap[String, ArchieInstance] ()

  def set(name: String, instance: ArchieInstance) = variables += (name -> instance)

  /**
    * Gets values from a scope, will also unpack wrapped lazy values
    * @param name
    * @return
    */
  def get(name: String): Option[ArchieInstance] = {
    val value = variables.get(name)
    value match {
      case Some(LazyArchieFunction(f)) => {
        val instance = f(this)
        set(name, instance)
        Some(instance)
      }
      case Some(LazyArchieInstance(instance)) => {
        set(name, instance)
        Some(instance)
      }
      case x => x
    }
  }

  def isSet(name: String) = variables.isDefinedAt(name)

  override def toString = variables.filter((X: (String, ArchieInstance)) => X._1 != "this").toString

}
