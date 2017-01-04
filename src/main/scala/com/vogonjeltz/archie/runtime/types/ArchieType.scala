package com.vogonjeltz.archie.runtime.types

import com.vogonjeltz.archie.AST.tree.Element
import com.vogonjeltz.archie.runtime.state.{ProgramContext, Scope}

/**
  * Created by Freddie on 04/01/2017.
  */
class ArchieType(val name: String, val paramNames: List[String], val instantiationFunction: Scope => Unit){

  lazy val wrapper = new ArchieTypeWrapper(this)

}

class ArchieTypeWrapper(val wrappedArchieType: ArchieType) extends ArchieInstance(ArchieType.ArchieTypeType)

object ArchieType {

  val ArchieTypeType = new ArchieType("Type", List(), (s: Scope)=>{})//new ArchieTypeType

}