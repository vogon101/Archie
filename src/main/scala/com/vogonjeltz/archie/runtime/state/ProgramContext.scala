package com.vogonjeltz.archie.runtime.state

import com.vogonjeltz.archie.AST.tree.SourceReference
import com.vogonjeltz.archie.runtime.Interpreter
import com.vogonjeltz.archie.runtime.library.{Library, STDLib}
import com.vogonjeltz.archie.runtime.types.ArchieInstance

import scala.collection.mutable

/**
  * Created by Freddie on 04/01/2017.
  */
class ProgramContext(val interpreter: Interpreter) {

  val scopeStack = new ScopeStack

  val availableLibs: mutable.HashMap[String, Library] = mutable.HashMap()

  private var _classDef: Option[ArchieInstance] = None
  def classDef = _classDef

  private var _sourceRefs: List[SourceReference] = List()
  def sourceRefs = _sourceRefs
  def pushSourceRef(r: SourceReference) = _sourceRefs = r :: sourceRefs
  def popSourceRef() = _sourceRefs = _sourceRefs.tail

  def withSourceRef[T <: ArchieInstance](sourceReference: SourceReference)(func:  => Option[T]):Option[T] = {
    pushSourceRef(sourceReference)
    val ret = func
    popSourceRef()
    ret
  }

  def withClassDef[T](instance: ArchieInstance)(actions:  => T): T = {
    _classDef = Some(instance)
    val res = actions
    _classDef = None
    res
  }

  //private var _currentContainer:

  //TODO: Refactor into a Library class
  def loadLibrary(lib: Library): Unit = {
    lib.types.foreach(T => scopeStack.set(T.name, T.wrapper))
    lib.instances.foreach(I => scopeStack.set(I._1, I._2))
  }

  def addLib(name: String, lib:Library) = {
    availableLibs += (name -> lib)
  }

  def loadLibrary(name:String): Unit = {
    val lib = availableLibs.get(name)
    if (lib.isEmpty) throw new Exception(s"Lib $name not found")
    loadLibrary(lib.get)
  }

  def loadCoreLib() = {
    loadLibrary(STDLib.coreLib)
  }

  addLib("std", STDLib.stdLib)

}

object ProgramContext {

  private var _instance: ProgramContext = _

  def instance(interpreter: Interpreter): ProgramContext = {
    _instance = new ProgramContext(interpreter)
    _instance
  }

  def instance: ProgramContext = _instance

  def resetContext(): Unit = _instance = null

}
