package com.vogonjeltz.archie.runtime.state

import com.vogonjeltz.archie.runtime.library.{Library, STDLib}

import scala.collection.mutable

/**
  * Created by Freddie on 04/01/2017.
  */
class ProgramContext protected (){

  val scopeStack = new ScopeStack

  val availableLibs: mutable.HashMap[String, Library] = mutable.HashMap()

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

  def instance: ProgramContext = {
    if (_instance == null) _instance = new ProgramContext
    _instance
  }

  def resetContext(): Unit = _instance = null

}
