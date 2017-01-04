package com.vogonjeltz.archie.runtime.library

import com.vogonjeltz.archie.runtime.types.{ArchieInstance, ArchieType}

import scala.collection.immutable.HashMap

/**
  * Created by Freddie on 04/01/2017.
  */
class Library(val types: List[ArchieType], val instances: Map[String, ArchieInstance]) {

  def this(types:List[ArchieType]) = this(types, HashMap())

  def this(instances: HashMap[String, ArchieInstance]) = this(List(), instances)

  def this() = this(List(), HashMap())

}

class LibraryCollection(val libraries: List[Library]) extends Library {

  override val types: List[ArchieType] = libraries.flatMap(_.types)

  override val instances: Map[String, ArchieInstance] = libraries.flatMap(_.instances).toMap

}