package com.vogonjeltz.archie.runtime.types

import com.vogonjeltz.archie.AST.tree.{Element, StringLiteral}
import com.vogonjeltz.archie.runtime.state.{ProgramContext, Scope}

/**
  * Created by Freddie on 04/01/2017.
  */
class ArchieType(val name: String, val paramNames: List[String], val instantiationFunction: Scope => Unit, val superclass: Option[ArchieType] = None){

  import TypeHelpers._

  implicit class MemberName(name: String) {

    def >>> (member: MemberDef): Unit = addMember(name, member)

  }

  lazy val wrapper = new ArchieTypeWrapper(this)

  private var _members: Map[String, MemberDef] = Map()

  def instantiate(params: List[ArchieInstance]):FullArchieInstance = new FullArchieInstance(this, params)

  def addMember(name: String, member: MemberDef) = _members = members + (name -> member)
  def members = _members

  def archieToString(s:Scope): Option[ArchieInstance] = S("Archie Instance of type ") + S(name) + S(" ") + S(s.container.hashCode.toString)

  "toString" >>> Lazy ((archieToString _).$)
  "hashCode" >>> Lazy (S(hashCode().toString))
  "typeName" >>> Lazy (S(name))

  //println(s"Archie type created $name")


}

class ArchieTypeWrapper(val wrappedArchieType: ArchieType) extends FullArchieInstance(ArchieType.ArchieTypeType)

object ArchieType {

  val ArchieTypeType = new ArchieType("Type", List(), (s: Scope)=>{})//new ArchieTypeType

}