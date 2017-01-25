package com.vogonjeltz.archie.runtime.types
import TypeHelpers._
import com.vogonjeltz.archie.AST.tree.{Element, StringLiteral}
import com.vogonjeltz.archie.runtime.state.{ProgramContext, Scope}

/**
  * Created by Freddie on 04/01/2017.
  */
class ArchieType(val name: String, val paramNames: List[String], val instantiationFunction: Scope => Unit, val superclass: Option[ArchieType] = None){

  implicit class MemberName(s: String) {

    def >>> (member: => ArchieInstance):Unit = addMember(s, () => member)

  }

  lazy val wrapper = new ArchieTypeWrapper(this)

  private var _members: Map[String, () => ArchieInstance] = Map()

  def instantiate(params: List[ArchieInstance]):FullArchieInstance = new FullArchieInstance(this, params)

  def addMember(name: String, member: () => ArchieInstance) = _members = members + (name -> member)
  def members = _members

  def archieToString(s:Scope): Option[ArchieInstance] = S("Archie Instance ") + s.forceGet("hashCode")

  "toString" >>> Lazy (archieToString _ $)
  "hashCode" >>> Lazy (S(hashCode().toString))

}

class ArchieTypeWrapper(val wrappedArchieType: ArchieType) extends FullArchieInstance(ArchieType.ArchieTypeType)

object ArchieType {

  val ArchieTypeType = new ArchieType("Type", List(), (s: Scope)=>{})//new ArchieTypeType

}