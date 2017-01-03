package com.vogonjeltz.archie.app

import java.io.FileNotFoundException

import com.vogonjeltz.archie.AST.treeWalk.walkers.PrintWalker
import com.vogonjeltz.archie.parsing.ParserCore

import scala.io.{Source, StdIn}

/**
  * Created by Freddie on 03/01/2017.
  */
object SimpleFileApp {

  def time[R](block: => R): R = {
    val t0 = System.nanoTime()
    val result = block    // call-by-name
    val t1 = System.nanoTime()
    println("Elapsed time: " + (t1 - t0) / Math.pow(10, 9) + "s")
    result
  }

  def main(args: Array[String]): Unit = {

    var opFunction: (String) => Unit = null

    var mode = "parseTree"
    val modeInput = StdIn.readLine("Mode >")
    if (modeInput != "") mode = modeInput

    mode match {
      case "run" => println("Not Implemented"); System.exit(0)
      case "parseTree" => opFunction = X => parseTree(X)
      case _ => println("Invalid Mode"); System.exit(0)
    }

    while (true) {
      val fileName = "Examples\\" + StdIn.readLine("File >") + ".ar"
      if (fileName == "Examples\\.ar") System.exit(0)
      try {
        val fileContents = Source.fromFile(fileName).mkString
        println(fileContents)
        opFunction(fileContents)
      } catch {
        case e: FileNotFoundException => println("File not found")
      }
    }

  }

  def parseTree(text: String): Unit = {
    val parser = new ParserCore(text)
    time {
      new PrintWalker().visitAST(parser.parsed)
    }
  }

}
