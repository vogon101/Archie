package com.vogonjeltz.archie.runtime.types

import com.vogonjeltz.archie.runtime.state.Scope

/**
  * Created by Freddie on 05/03/2017.
  */

object LazyType extends ArchieType ("LazyWrapper", List(), (s: Scope) => {}, None){

}

class LazyWrappedInstance(val valueFunction: () => ArchieInstance) extends ArchieInstance(LazyType) {

  private var _value: ArchieInstance = _

  def value: ArchieInstance = {
    if (_value == null) _value = valueFunction()
    _value
  }

}

object LazyWrappedInstance {

  def unapply(arg: LazyWrappedInstance): Option[ArchieInstance] = Some(arg.value)

  def apply(valueFunction: () => ArchieInstance): LazyWrappedInstance = new LazyWrappedInstance(valueFunction)

}

class LazyWrappedFunction(val functionFunction: (Option[ArchieInstance]) => ArchieFunction) extends LazyWrappedInstance(null){

  private var _value: ArchieFunction = _

  override def value =
    if (_value == null) throw new Exception("Lazy function accessed before initialised")
    else _value

  def value(container: Option[ArchieInstance]) = {
    if(_value == null) _value = functionFunction(container)
    _value
  }

}

object LazyWrappedFunction {

  def unapply(arg: LazyWrappedFunction): Option[(Option[ArchieInstance]) => ArchieFunction] = Some(arg.functionFunction)

  def apply(functionFunction: (Option[ArchieInstance]) => ArchieFunction) = new LazyWrappedFunction(functionFunction)

}