package com.vogonjeltz.archie.runtime.library

import com.vogonjeltz.archie.runtime.state.Scope
import com.vogonjeltz.archie.runtime.types.{ArchieInstance, ArchieType, FullArchieInstance}

import scala.collection.immutable.HashMap

/**
  * Created by Freddie on 04/01/2017.
  */
class Library(_types: List[ArchieType], _instances: Map[String, ArchieInstance]) {

  lazy val types:List[ArchieType] = _types

  lazy val instances:Map[String, ArchieInstance] = _instances

  def toInstance: ArchieInstance = new LibraryInstance(this)

  def this(types:List[ArchieType]) = this(types, HashMap())

  def this(instances: HashMap[String, ArchieInstance]) = this(List(), instances)

  def this() = this(List(), HashMap())

}

object LibraryType extends ArchieType("Library", List(), (s: Scope) => {})

class LibraryInstance(l: Library) extends FullArchieInstance(LibraryType) {

  for ((n,i) <- l.instances) scope.set(n, i)
  for (t <- l.types) scope.set(t.name, t.wrapper)

}


class LibraryCollection(val libraries: Map[String, Library]) extends Library {

  override lazy val types: List[ArchieType] = libraries.flatMap(_._2.types).toList

  override lazy val instances: Map[String, ArchieInstance] = libraries.flatMap(_._2.instances)

}