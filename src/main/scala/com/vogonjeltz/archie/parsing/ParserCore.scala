package com.vogonjeltz.archie.parsing
import com.vogonjeltz.archie.AST.tree.AST
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

  private var in = new ANTLRInputStream(text)

  def updateText(new_text: String) = {
    _text = new_text + "\n"
    in = new ANTLRInputStream(text)
  }
  def text = _text

  def parsed: AST = {
    val parser = new archieParser(tokens)
    val visitor = new ProgramVisitor()
    parser.program().accept(visitor)
  }

  def tokens: CommonTokenStream = {
    val lexer = new archieLexer(in)
    new CommonTokenStream(lexer)
  }



}