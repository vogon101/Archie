package com.vogonjeltz.archie.app

import com.vogonjeltz.archie.parsing.ParserCore
import com.vogonjeltz.archie.runtime.{ArchieException, Interpreter}

import scala.io.StdIn

/**
  * Created by Freddie on 28/03/2017.
  */
object ConsoleApp extends App {

  var running: Boolean = true

  var parser = new ParserCore("")
  val interpreter = new Interpreter(4)

  while (running) {
    val text = StdIn.readLine(">")
    parser.updateText(text)
    try {
      println(interpreter.visitASTKeepLast(parser.parsed).getOrElse("None "))
    } catch {
      case e: ArchieException => println(e.getArchieStackTrace)
    }
  }

}
