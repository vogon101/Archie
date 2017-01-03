package com.vogonjeltz.archie.parsing.old

import com.vogonjeltz.archie.AST._
import fastparse.WhitespaceApi

/**
  * FastParseArchieParser
  *
  * Created by fredd
  */
trait ParseUtils {

  val White = WhitespaceApi.Wrapper{
    import fastparse.all._
    NoTrace(" ".rep | "\n".rep | "\r".rep)
  }
  import White._
  import fastparse.noApi._

  lazy val alphabet = P( CharIn('A' to 'Z', 'a' to 'z') )

  lazy val alphaNumeric = P( CharIn('A' to 'Z', 'a' to 'z', '0' to '9' ) )

  lazy val validInName = P( alphaNumeric | CharIn("_-@*") )

  lazy val symbol = P( CharIn("+-/*^$£&!#~@|") )

}

class FPArchieParser extends ParseUtils {

  import White._
  import fastparse.noApi._

  lazy val program:Parser[AST] = P( line.rep ).map(X => {println("ho"); new AST(X.toList)}).log("Program")

  lazy  val line:Parser[Line] = P(comment | assignment | element)

  lazy val comment: Parser[Comment] = P("//" ~/ AnyChar.rep.! ~ "\n").map(X => Comment(X))

  lazy val assignment: Parser[Assignment] = P(identifier ~ "=" ~/ element).map{
    case (i,e) => Assignment(i,e)
  }

  lazy val element: Parser[Element] = P (functionCall | functionLiteral | identifier)

  lazy val identifier: Parser[Identifier] = P(textID | compositeID)

  lazy val textID: Parser[TextID] = P(name.rep(sep=".").map(X => TextID(X.toList)))

  lazy val name: Parser[String] = P (alphabet.! ~ validInName.rep.?.!).map {
    case (s1, s2) => s1 + s2
  }

  lazy val compositeID: Parser[CompositeID] = P(element ~ "." ~/ textID).map {
    case (e, t) => CompositeID(e,t)
  }

  lazy val nameList: Parser[List[String]] = P("(" ~/ name.rep(sep=",") ~ ")").map(_.toList)

  lazy val functionLiteral: Parser[FunctionLiteral] = P(nameList ~ "=>" ~/ element).map {
    case (params, e) => FunctionLiteral(params, e)
  }

  lazy val elementList: Parser[List[Element]] = P("(" ~/ element.rep(sep=",") ~ ")").map(_.toList)

  lazy val functionCall:Parser[FunctionCall] =
    P(element ~ elementList).map {
      case (e,as) => FunctionCall(e, as)
    } | P(element ~ name ~/ element).map {
      case (e, n, a) => FunctionCall(OperatorResolver(e, n), List(a))
    }

}
