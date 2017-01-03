package com.vogonjeltz.archie.parsing

import com.vogonjeltz.archie.AST._
import com.vogonjeltz.archie.parsing.antlr._
import com.vogonjeltz.archie.parsing.antlr.archieParser._
import com.vogonjeltz.archie.parsing.visitor.ProgramVisitor
import org.antlr.v4.runtime.{ANTLRInputStream, CommonTokenStream}

import scala.collection.JavaConversions._
import scala.collection.mutable.ListBuffer

/**
  * ParserCore
  *
  * Created by fredd
  */
class ParserCore(private var _text: String) {

  val text: String = _text + "\n"
  private val in = new ANTLRInputStream(text)

  lazy val parsed: AST = {
    val parser = new archieParser(tokens)
    val visitor = new ProgramVisitor()
    parser.program().accept(visitor)
  }

  lazy val tokens: CommonTokenStream = {
    val lexer = new archieLexer(in)
    new CommonTokenStream(lexer)
  }



}