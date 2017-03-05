package com.vogonjeltz.archie.runtime

import com.vogonjeltz.archie.AST.tree.SourceReference

/**
  * ArchieException
  *
  * Created by fredd
  */
class ArchieException(message: String, val sourceStack: List[SourceReference], cause: Exception) extends Exception(message, cause) {

  def getArchieStackTrace: String = s"ArchieException: $message\n\nStackTrace:\n"+sourceStack.map(sr => sr.lineNumber + " -> " + sr.text).mkString("\n")

  override def getStackTrace: Array[StackTraceElement] = cause.getStackTrace

  override def printStackTrace(): Unit = cause.printStackTrace()

  override def getMessage: String = message

  override def getCause: Throwable = cause

  override def toString: String = getArchieStackTrace

}
