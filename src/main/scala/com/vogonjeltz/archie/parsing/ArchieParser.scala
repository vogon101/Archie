package com.vogonjeltz.archie.parsing

import com.vogonjeltz.archie.AST._

import scala.util.parsing.combinator.JavaTokenParsers

/**
  * ArchieParser
  *
  * Created by fredd
  */
class ArchieParser extends JavaTokenParsers {

  def parseProgram(text: String): ParseResult[AST] = {
    parse(program, text + "\n")
  }

  lazy val program: Parser[AST] = rep(line) ^^ (lines => new AST(lines))

  //TODO: Support no semi-colon
  lazy val line: Parser[Line] = comment | ((assignment | element) <~ ";")

  lazy val comment: Parser[Comment] = "//.*".r ^^ (Comment(_))

  //TODO: Can assignments and comments be lines?

  lazy val assignment: Parser[Assignment] = ((identifier <~ "=") ~ element) ^^ {
    case id ~ e => Assignment(id, e)
  }

  lazy val element:Parser[Element] = identifier

  lazy  val identifier: Parser[Identifier] = textID | compositieID

  lazy val textID: Parser[TextID] = repsep(name | symbol, ".") ^^ (TextID(_))

  lazy val compositieID: Parser[CompositeID] = ((element <~ ".") ~ textID) ^^ {
    case e ~ t => CompositeID(e, t)
  }

  lazy val name: Parser[String] = "[A-Za-z_]+[A-Za-z0-9_\\-]*".r

  lazy val symbol: Parser[String] = "[=!£\\$%\\^\\&\\*\\-\\+\\~#@?<>]+".r

  lazy val paramNameList:Parser[List[String]] = "(" ~> repsep(name, ",") <~ ")"

  lazy val functionLiteral: Parser[FunctionLiteral] = ((paramNameList <~ "=>") ~ element) ^^ {
    case names ~ e => FunctionLiteral(names, e)
  }

}
