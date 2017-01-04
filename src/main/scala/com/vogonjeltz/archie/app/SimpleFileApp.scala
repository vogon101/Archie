package com.vogonjeltz.archie.app

import java.io.FileNotFoundException

import com.vogonjeltz.archie.AST.TreeWalk.walkers.PrintWalker
import com.vogonjeltz.archie.parsing.ParserCore
import com.vogonjeltz.archie.runtime.Interpreter
import com.vogonjeltz.archie.runtime.state.Scope
import com.vogonjeltz.archie.runtime.types.{ArchieFunction, ArchieFunctionAdapter, ArchieTypeWrapper}

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

  def test(text: String) = {

    println("Testing function type")
    val function = new ArchieFunctionAdapter(List(), (s: Scope) => null)
    val wrapper = function.archieType.wrapper

  }

  def run(text: String) = {
    val parser = new ParserCore(text)
    val interpreter = new Interpreter(4)
    interpreter.visitAST(parser.parsed)
    print("Value of 'this': ")
    println(interpreter.context.scopeStack.get("this"))
  }


  def main(args: Array[String]): Unit = {

    var opFunction: (String) => Unit = null

    var mode = "parseTree"
    val modeInput = StdIn.readLine("Mode >")
    if (modeInput != "") mode = modeInput

    mode match {
      case "test" => opFunction = X => test(X)
      case "run" => opFunction = X => run(X)
      case "parseTree" => opFunction = X => parseTree(X)
      case _ => println("Invalid Mode"); System.exit(0)
    }

    while (true) {
      val fileName = "Examples\\" + StdIn.readLine("File >") + ".ar"
      if (fileName == "Examples\\.ar") System.exit(0)
      try {
        val fileContents = Source.fromFile(fileName).mkString
        println(fileContents)
        println("\n\n")
        opFunction(fileContents)
      } catch {
        case e: FileNotFoundException => println("File not found")
        case e: Exception => e.printStackTrace(System.out)
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
