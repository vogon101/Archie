package com.vogonjeltz.archie

import com.vogonjeltz.archie.parsing.ArchieParser

/**
  * MainTest
  *
  * Created by fredd
  */
object MainTest {

  def main(args: Array[String]): Unit = {

    println("\n\n\n\n")

    val text =
      """this.that = that.this;
        |this.this = that.other;
        |a = b.c;""".stripMargin
    println(text)
    val parser = new ArchieParser()
    val parsed = parser.parse(parser.program, text)
    println(parsed)
    println(parsed.get)

    println("\n\n\n\n")

  }

}
