package com.vogonjeltz.archie.AST.treeWalk

import com.vogonjeltz.archie.AST._
import com.vogonjeltz.archie.AST.tree.{AST, Comment, Element, Line}

/**
  * Created by Freddie on 03/01/2017.
  */
class ASTTransform {

  def transform(ast: AST)(T: (Line) => Line):AST = {
    new AST(
      ast.lines.map(T(_))
    )
  }

  def transformElements(ast:AST)(T: (Element) => Element): AST = {
    new AST(
      ast.lines.map {
        case c: Comment => c
        case e: Element => T(e)
      }
    )
  }
  /**
  def transformComplexElements(ast:AST)(T: (Element) => Element): AST = {
    new AST(
      ast.lines.map {
        case c: Comment => c
        case b: CodeBlock => CodeBlock(transformComplexElements(b)(T).lines)
        case e: Element => T(e)
      }
    )
  }**/

}
