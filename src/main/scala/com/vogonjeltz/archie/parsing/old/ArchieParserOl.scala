package com.vogonjeltz.archie.parsing

import com.vogonjeltz.archie.AST._
/*
import scala.util.parsing.combinator.{JavaTokenParsers, PackratParsers}

/**
  * ArchieParser
  *
  * Created by fredd
  */
class ArchieParser extends JavaTokenParsers with PackratParsers {

  def parseProgram(text: String): ParseResult[AST] = {
    parseAll(program, text + "\n")
  }

  val program: PackratParser[AST] = log(rep(line))("program") ^^ (lines => new AST(lines))

  //TODO: Support no semi-colon
  lazy val line: PackratParser[Line] = log(
    (comment | (assignment | element)) <~ ( ";"?)
  )("line")

  lazy val comment: PackratParser[Comment] = "//.*".r ^^ (Comment(_))

  //TODO: Can assignments and comments be elements?

  lazy val assignment: PackratParser[Assignment] = log(((identifier <~ "=") ~ element))("assignment") ^^ {
    case id ~ e => Assignment(id, e)
  }

  lazy val element:PackratParser[Element] =log(
      functionCall |
      functionLiteral |
      identifier)("element")

  lazy  val identifier: Parser[Identifier] = textID | compositieID

  lazy val textID: Parser[TextID] = repsep(name | symbol, ".") ^^ (TextID(_))

  lazy val compositieID: PackratParser[CompositeID] = ((element <~ ".") ~ textID) ^^ {
    case e ~ t => CompositeID(e, t)
  }

  lazy val name: PackratParser [String] = "[A-Za-z_]+[A-Za-z0-9_\\-]*".r ^^ {X => X}

  lazy val symbol: PackratParser[String] = "[=!£\\$%\\^\\&\\*\\-\\+\\~#@?<>]+".r ^^ {X => X}

  lazy val paramNameList:PackratParser[List[String]] = "(" ~> repsep(name, ",") <~ ")"

  lazy val functionLiteral: PackratParser[FunctionLiteral] = ((paramNameList <~ "=>") ~ element) ^^ {
    case names ~ e => FunctionLiteral(names, e)
  }

  lazy val elementList: PackratParser[List[Element]] = "(" ~> repsep(element, ",") <~ ")"

  lazy val functionCall: PackratParser[FunctionCall] = (element ~ elementList) ^^ {
    case e ~ es => FunctionCall(e,es)
  } | operatorFunctionCall

  lazy val operatorFunctionCall: PackratParser[FunctionCall] = (element ~ symbol ~ element) ^^ {
    case e1 ~ s ~ e2 => FunctionCall(OperatorResolver(e1, s), List(e2))
  }

}
*/