package com.vogonjeltz.archie.test

import com.vogonjeltz.archie.AST.TreeWalk.walkers.PrintWalker
import com.vogonjeltz.archie.parsing.ParserCore
import com.vogonjeltz.archie.runtime.types.ArchieFunction

/**
  * MainTest
  *
  * Created by fredd
  */
object MainTest {

  def time[R](block: => R): R = {
    val t0 = System.nanoTime()
    val result = block    // call-by-name
    val t1 = System.nanoTime()
    println("Elapsed time: " + (t1 - t0) / Math.pow(10, 9) + "s")
    result
  }


  def main(args: Array[String]): Unit = {

    println("\n\n\n\n")

    val text =
      """(this.that = that.this)();
        |this.this = that.other;
        |that = this() + 4;
        |that = () => that;
        |a(4,5.65,6.47f, 5f);
        |5+6
        |myname = "Freddie Poser"
        |{x = y; () => y = x;}
        |class MyClass(e1, e2) {
        | this.name = "Freddie"
        |}
        |new MyClass(this, that, theOther())
        |true & false | myVar""".stripMargin
    //(text + "\n\n")
    try {
      val parser = new ParserCore(text)
      time { println(parser.parsed) }
      new PrintWalker().visitAST(parser.parsed)
      println("\n\n\n")

      //val instance = new ArchieFunction()

      //println("\n\n\n")
      //val visitor = new TestVisitor()
      //new PrintWalker().visitAST(visitor.visitAST(parser.parsed))
      //println (visitor.visitAST(parser.parsed))
    } catch {
      case e: Exception => e.printStackTrace(System.out)
    }


  }

}
