package com.vogonjeltz.archie.parsing
import com.vogonjeltz.archie.AST._
/*
import scala.util.parsing.combinator.{JavaTokenParsers, PackratParsers}
/**
  * SLangParser
  *
  * Created by fredd
  */
class SLangParser extends JavaTokenParsers with PackratParsers {

  //TODO: Support composite identifiers for cases like "string".operation()
  //TODO: Allow no semicolons
  //TODO: Allow files to end with line(no semicolon/newline)

  lazy val program:PackratParser[AST] = log(rep(line) ^^ (x => new AST(x)))("program")

  lazy val line:PackratParser[Line] = (comment | (assignment | element)) <~ ( ";"?)

  //ASSIGNMENT
  lazy val assignment:Parser[Assignment] = assignmentLHS ~ element ^^ {
    case x ~ y => Assignment(x,y)
  }

  lazy val assignmentLHS: Parser[Identifier] = identifier <~ "="

  lazy val comment: PackratParser[Comment] = "//.*".r ^^ (i => Comment(i))

  lazy val element: PackratParser[Element] = {
    functionCall | functionDefinition | identifier
  }

  lazy val name: PackratParser[String] = "([a-zA-Z_\\+\\-\\*^%#~@\\?\\/]+[a-zA-Z0-9_\\+\\-\\*^%#~@\\?\\/]*)".r ^^ (X => X)

  //IDENTIFIER
  lazy val identifier:PackratParser[Identifier] = repsep(name,".") ^^
    (i => {
      //println(s"Parsed $i")
      new TextID(i)
    }) | compositeIdentifier

  lazy val compositeIdentifier: PackratParser[CompositeID] = (compositeIdentifierLHS ~ name) ^^ {
    case element ~ name => CompositeID(element, TextID(List(name)))
  }

  lazy val compositeIdentifierLHS: PackratParser[Element] = element <~ "."


  //FUNCTION CALLS
  lazy val functionCall : PackratParser[FunctionCall] = (element ~ elementList ^^ {
    case x ~ y => new FunctionCall(x, y)
  }) | operatorFunctionCall

  lazy val operatorFunctionCall : PackratParser[FunctionCall] = (element ~ name ~ element) ^^ {
    case container ~ name ~ arg => new FunctionCall(OperatorResolver(container, name), List(arg))
  }

  lazy val nameList: PackratParser[List[String]] = "(" ~> repsep("([a-zA-Z]+[a-zA-Z0-9\\-_]*)".r, ",") <~ ")"

  lazy val elementList : PackratParser[List[Element]] = "(" ~> repsep(element, ",") <~ ")"

  //FUNCTION DEFINITION
  lazy val functionDefinitionLHS: PackratParser[List[String]] = nameList <~ "=>"

  lazy val functionDefinition : PackratParser[FunctionLiteral] = functionDefinitionLHS ~ element ^^ {
    case x ~ y => FunctionLiteral(x, y)
  }



}
*/

