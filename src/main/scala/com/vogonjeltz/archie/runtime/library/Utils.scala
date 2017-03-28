package com.vogonjeltz.archie.runtime.library


import com.vogonjeltz.archie.runtime.state.Scope
import com.vogonjeltz.archie.runtime.types.{ArchieFunctionAdapter, ArchieInstance, ArchieNone}
import com.vogonjeltz.archie.runtime.state.ProgramContext
import scala.collection.immutable.HashMap

/**
  * Utils
  *
  * Created by fredd
  */
class Utils extends Library {

  override lazy val instances: HashMap[String, ArchieInstance] = HashMap(
    "testFunction" -> new ArchieFunctionAdapter(List(), (s: Scope) => {println("Hello from the utils function"); None}, None)
  )

}