package com.vogonjeltz.archie.runtime.library

import com.vogonjeltz.archie.runtime.types.LiteralInstance

/**
  * Created by Freddie on 04/01/2017.
  */
object STDLib {

  val coreLib = new LibraryCollection(Map(
    "literals" -> LiteralInstance.literalLib,
    "stdio" -> new STDIO,
    "lists" -> new ListsLib
  ))

  val stdLib = new LibraryCollection(Map(
    "utils" -> new Utils
  ))

}
