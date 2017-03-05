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



  def memberFunction(params: List[String], function: (Scope) => Option[ArchieInstance]):MemberFunctionDef =
    new MemberFunctionDef(
      (container: Option[ArchieInstance]) => new ArchieFunctionAdapter(params, function, None, container)
    )

  implicit class ParamNames(val names: List[String]) {

    def $ (f: (Scope) => Option[ArchieInstance]): MemberFunctionDef = memberFunction(names, f)

  }

  implicit class WrappedFunction(val f: (Scope) => Option[ArchieInstance]) {

    def $ : MemberFunctionDef = memberFunction(List(), f)

  }

  class MemberDef (private val _member: ArchieInstance) {

    def get(s : Option[ArchieInstance]):ArchieInstance = _member

  }

  class LazyMemberDef (private val _member: () => ArchieInstance) extends MemberDef(ArchieNone()) {

    override def get (s: Option[ArchieInstance]): LazyWrappedInstance = LazyWrappedInstance(_member)

  }

  class MemberFunctionDef (val f: (Option[ArchieInstance]) => ArchieFunction) extends MemberDef(ArchieNone()){

    override def get (s: Option[ArchieInstance]):ArchieFunction = {
      //println(s"Getting a member function def $s")
      f(s)
    }

  }

  class LazyFunctionMemberDef (private val _member: (Option[ArchieInstance]) => ArchieFunction) extends LazyMemberDef(null) {

    override def get(s: Option[ArchieInstance]): LazyWrappedFunction = LazyWrappedFunction(_member)

  }




  def S(text: String): StringLiteralInstance = new StringLiteralInstance(text)

  def Lazy(v: => ArchieInstance) = new LazyMemberDef(() => v)

  def Lazy(v: (Option[ArchieInstance]) => ArchieFunction) = new LazyFunctionMemberDef(v)

  def Lazy(v: MemberFunctionDef) = new LazyFunctionMemberDef(v.get _)

  //TODO: Fix this monstrosity
  implicit def archieOptionToInstance[T <: ArchieInstance](option: Option[T]): T = option match {
    case Some(x) => x
    case _ => throw new Exception("Tried to unpack Option[ArchieInstance] but was null")
  }

  implicit def archieInstanceToOption[T <: ArchieInstance](instance: T): Option[T] = Some(instance)

}
