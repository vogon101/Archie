package com.vogonjeltz.archie.runtime.types

import com.vogonjeltz.archie.runtime.state.Scope

/**
  * LazyArchieType
  *
  * Created by fredd
  */
class LazyArchieType private extends ArchieType ("Lazy", List("value"), (s: Scope) => {}){

}

object LazyArchieType {

  val typeInstance = new LazyArchieType

}

/**
  * Wraps an ArchieInstancs so that it will only be evaluated when needed
  * @param _value
  */
class LazyArchieInstance(val _value: () => ArchieInstance) extends ArchieInstance(LazyArchieType.typeInstance){

  //TODO: Some sort of unwrapping for when not accessed from a scope

  lazy val value:ArchieInstance = _value()

}


object LazyArchieInstance {

  def unapply(arg: LazyArchieInstance): Option[ArchieInstance] = Some(arg.value)

}
