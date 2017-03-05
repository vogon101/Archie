package com.vogonjeltz.archie.AST.treeWalk

import com.vogonjeltz.archie.AST.tree._

/**
  * This walks over a tree and transforms, returning a new AST when done
  *
  * This is an alternative to the visitor pattern as implemented in {@link ASTVisitor} and is designed to be used with
  * pattern matching
  */
class ASTTransform {

  /**
    * Transform an abastract syntax tree by transforming every line
    * @param ast The AST to transform
    * @param T The transformation function that transforms lines
    * @return The transformed AST
    */
  def transform(ast: AST)(T: (Line) => Line):AST = {
    new AST(
      ast.lines.map(T(_))
    )
  }

  /**
    * Transform only the elements and classDefs, leaves out comments
    * @param ast The ast to transform
    * @param T The function that transforms elements
    * @param CT The function that transforms class definitions
    * @return The tranformed ast
    */
  def transformElements(ast:AST)(T: (Element) => Element)(CT: (ClassDef) => ClassDef): AST = {
    new AST(
      ast.lines.map {
        case c: Comment => c
        case e: Element => T(e)
        case d: ClassDef => CT(d)
      }
    )
  }

  def transformComplexElements[LS <: {val lines: List[Line]}](ast: LS)(T: (Element) => Element): AST = {
    new AST(
      ast.lines.map {
        case c: Comment => c
        case b: CodeBlock => CodeBlock(transformComplexElements(b)(T).lines)(b.sourceReference)
        case e: Element => T(e)
      }
    )
  }

}
