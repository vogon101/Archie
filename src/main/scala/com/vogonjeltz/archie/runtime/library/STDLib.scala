package com.vogonjeltz.archie.runtime.library

import com.vogonjeltz.archie.runtime.types.LiteralInstance

/**
  * Created by Freddie on 04/01/2017.
  */
object STDLib {

  val coreLib = new LibraryCollection(List(
    LiteralInstance.literalLib,
    new STDIO
  ))

  val stdLib = new LibraryCollection(List(

  ))

}
