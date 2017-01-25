package com.vogonjeltz.archie.runtime.types

import com.vogonjeltz.archie.runtime.state.Scope

/**
  * Created by Freddie on 25/01/2017.
  */
object TypeHelpers {

  //TODO: Somehow provide the instance to the functions created so that they can access the scope
  //Some sort of implicit parameter perhaps
  //Has to be available when they are created
  //Perhaps wrap all of this is a MemberDefinition that is then eval'd with instance on creation?

  class InstanceProvider (instance: ArchieInstance) {
  }

  def function(params: List[String], function: (Scope) => Option[ArchieInstance]):ArchieFunction = new ArchieFunctionAdapter(params, function)

  implicit class ParamNames(val names: List[String]) {

    def $ (f: (Scope) => Option[ArchieInstance]): ArchieFunction = function(names, f)

  }

  implicit class WrappedFunction(val f: (Scope) => Option[ArchieInstance]) {

    def $ : ArchieFunction = function(List(), f)

  }

  def S(text: String): StringLiteralInstance = new StringLiteralInstance(text)

  def Lazy(v: =>ArchieInstance) = new LazyArchieInstance(() => v)

}
