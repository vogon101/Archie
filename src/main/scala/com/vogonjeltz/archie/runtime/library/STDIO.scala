package com.vogonjeltz.archie.runtime.library

import com.vogonjeltz.archie.runtime.state.Scope
import com.vogonjeltz.archie.runtime.types.{ArchieFunctionAdapter, ArchieInstance, ArchieNone}
import com.vogonjeltz.archie.runtime.state.ProgramContext
import scala.collection.immutable.HashMap
import com.vogonjeltz.archie.runtime.types.StringLiteralInstance

/**
  * Created by Freddie on 04/01/2017.
  */
class STDIO extends Library {

  override lazy val instances: HashMap[String, ArchieInstance] = HashMap(
    "print" -> new ArchieFunctionAdapter(List("obj"), (s: Scope) => {print(s.get("obj").getOrElse("None")); None}, None),
    "println" -> new ArchieFunctionAdapter(List("obj"), (s: Scope) => {
      val obj = s.get("obj").getOrElse(ArchieNone()).toString
      println(obj)
      None
    }, None),
    "debug" -> new ArchieFunctionAdapter(List("obj"), (s: Scope) => {
      val obj = s.get("obj").getOrElse(ArchieNone())
      println(s"Information about object: $obj")
      println(s"Scope: ${obj.scope}")
      println(s"This reference: ${obj.scope.get("this")}")
      None
    }, None),
    "debugInst" -> new ArchieFunctionAdapter(List(), (s: Scope) => {
      println(s"Information about instantiation")
      println(ProgramContext.instance.classDef)
      None
    }, None),
    "import" -> new ArchieFunctionAdapter(List("name"), (s: Scope) => {
      val name = s.get("name").getOrElse(ArchieNone())
      name match {
        case n: StringLiteralInstance => Some(STDLib.stdLib.libraries(n.value).toInstance)
        case _ => throw new Exception(s"Cannot find library $name")
      }
    }, None),
    "require!" -> new ArchieFunctionAdapter(List("name"), (s: Scope) => {
      val name = s.get("name").getOrElse(ArchieNone())
      name match {
        case n: StringLiteralInstance =>
          val lib = STDLib.stdLib.libraries(n.value)
          ProgramContext.instance.loadLibrary(lib)
        case _ => throw new Exception(s"Cannot find library $name")
      }
      None
    }, None)
  )

}
