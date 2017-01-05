package com.vogonjeltz.archie.runtime.library

import com.vogonjeltz.archie.runtime.state.Scope
import com.vogonjeltz.archie.runtime.types.{ArchieFunctionAdapter, ArchieInstance}

import scala.collection.immutable.HashMap

/**
  * Created by Freddie on 04/01/2017.
  */
class STDIO extends Library {

  override lazy val instances: HashMap[String, ArchieInstance] = HashMap(
    "print" -> new ArchieFunctionAdapter(List("obj"), (s: Scope) => {print(s.get("obj").getOrElse("None")); None}),
    "println" -> new ArchieFunctionAdapter(List("obj"), (s: Scope) => {println(s.get("obj").getOrElse("None")); None})
  )

}
