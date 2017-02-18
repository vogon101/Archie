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
  * @param _valueFunction
  */
class LazyArchieInstance(private val _valueFunction: () => ArchieInstance) extends ArchieInstance(LazyArchieType.typeInstance){

  //TODO: Some sort of unwrapping for when not accessed from a scope

  private var _value: ArchieInstance = _

  def value:ArchieInstance = {
    if (_value == null) _value = _valueFunction()
    _value
  }

}

class LazyArchieFunction(val _valueFunction: (Scope) => ArchieFunction) extends LazyArchieInstance(null) {

  private var _value: ArchieFunction = _

  def value (scope: Scope) = {
    if(_value == null)
      _value = _valueFunction(scope)
    _value
  }

  override def value:ArchieFunction = {
    if (_value == null) throw new Exception("LazyArchieFunction accessed before initialised")
    else _value
  }

}

object LazyArchieFunction {

  def apply(_valueFunction: (Scope) => ArchieFunction) = new LazyArchieFunction(_valueFunction)

  def unapply(arg: LazyArchieFunction): Option[(Scope) => ArchieFunction] = Some(arg._valueFunction)
  
}

object LazyArchieInstance {

  def apply(_value: () => ArchieInstance) = new LazyArchieInstance(_value)

  def unapply(arg: LazyArchieInstance): Option[ArchieInstance] = Some(arg.value)

}
