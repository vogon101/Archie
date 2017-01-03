package com.vogonjeltz.archie.test

import com.vogonjeltz.archie.AST._
import com.vogonjeltz.archie.AST.treeWalk.{ASTTransform, ASTTransformVisitor, ASTVisitor}

/**
  * Created by Freddie on 03/01/2017.
  */
class TestVisitor extends ASTTransformVisitor[Line] {

  def default(e: Line) = e

  override def visitAssignment(assignment: Assignment) = {
    StringLiteral("Hello")
  }

}
