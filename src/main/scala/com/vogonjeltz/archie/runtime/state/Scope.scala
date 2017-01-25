package com.vogonjeltz.archie.runtime.state

import com.vogonjeltz.archie.runtime.types.{ArchieFunction, ArchieInstance, LazyArchieInstance}

import scala.collection.mutable

/**
  * Created by Freddie on 04/01/2017.
  */
trait Scope {

  def set(name: String, instance: ArchieInstance): Unit

  def get(name: String): Option[ArchieInstance]

  def forceGet(name: String): ArchieInstance = get(name).get

  def getOrElse(name: String, alt: => ArchieInstance) = get(name).getOrElse(alt)

  def isSet(name: String): Boolean

  def apply(name: String): Option[ArchieInstance] = get(name)


  def getFunction(name:String): Option[ArchieFunction] = {
    val f = get(name)
    f match {
      case Some(f: ArchieFunction) => Some(f)
      case _ => None
    }
  }

}

class ConcreteScope extends Scope {

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
      case Some(LazyArchieInstance(instance)) => Some(instance)
      case x => x
    }
  }

  def isSet(name: String) = variables.isDefinedAt(name)

  override def toString = variables.filter((X: (String, ArchieInstance)) => X._1 != "this").toString

}
