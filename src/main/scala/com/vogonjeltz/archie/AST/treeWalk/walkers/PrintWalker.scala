package com.vogonjeltz.archie.AST.TreeWalk.walkers

import com.vogonjeltz.archie.AST.tree._
import com.vogonjeltz.archie.AST.TreeWalk.ASTVisitor

/**
  * Created by Freddie on 03/01/2017.
  */
class PrintWalker extends ASTVisitor[Unit]{

  override def default(e: Line) = indent(e.toString){}

  private var level: Int = 0

  def indent(text: String)(f: => Unit) = {
    println(("|\t" * level) + text)
    level += 1
    f
    level -= 1
  }

  override def visitAssignment(assignment: Assignment) = {
    indent ("Assignment:") {
      indent("Identifier:") {
        assignment.id.accept(this)
      }
      indent("Value:") {
        assignment.value.accept(this)
      }
    }
  }

  override def visitCodeBlock(codeBlock: CodeBlock) = {
    indent("Code Block:") {
      for (elem <- codeBlock.lines) {
        elem.accept(this)
      }
    }
  }

  override def visitFunctionCall(functionCall: FunctionCall) = {
    indent("Function Call") {
      indent("Function:") {
        functionCall.element.accept(this)
      }
      indent("Arguments:") {
        for (elem <- functionCall.arguments) {
          elem.accept(this)
        }
      }
    }
  }

  override def visitIdentifier(identifier: Identifier) = {
    indent("Identifier:") {
      identifier match {
        case i: TextID => indent(i.resolvePath.mkString(".")){}
        case i: CompositeID =>
          println("Composite ID")
          indent("Element"){
            i.element.accept(this)
          }
          indent("TextID"){
            i.textID.accept(this)

        }
      }
    }
  }

  override def visitOperatorResolver(operatorResolver: OperatorResolver) = {
    indent("Operator Resolver:"){
      indent("Element:") {
        operatorResolver.element.accept(this)
      }
      indent("Name: " + operatorResolver.name){}
    }
  }

  override def visitClassDef(classDef: ClassDef) = {
    indent("ClassDef:") {
      indent("Name: " + classDef.name) {}
      indent("Params: " + classDef.params){}
      indent("Body: ") {
        classDef.body.foreach(b => b.accept(this))
      }
    }
  }

  override def visitInstantiation(instantiation: Instantiation) = {
    indent("Instantiation:") {
      indent("Name: " + instantiation.name){}
      indent("Params:") {
        for (elem <- instantiation.constructorParams) {
          elem.accept(this)
        }
      }
    }
  }

  override def visitFunctionLiteral(functionLiteral: FunctionLiteral) = {
    indent("Function Literal:") {
      indent("Param Names:") {
        for (elem <- functionLiteral.paramNames) {
          indent(elem){}
        }
      }
      indent("Body"){
        functionLiteral.element.accept(this)
      }
    }
  }

  override def visitConditional(ifStatement: Conditional): Unit = {
    indent("Conditional: ") {
      indent("Condition: ") {
        ifStatement.condition.accept(this)
      }
      indent("onTrue: ") {
        ifStatement.onTrue.accept(this)
      }
      indent("onFalse: ") {
        ifStatement.onFalse.foreach(_.accept(this))
      }
    }
  }

  override def visitWhile(whileLoop: WhileLoop): Unit = {
    indent("While Loop:") {
      indent("condition:"){
        whileLoop.condition.accept(this)
      }
      indent("Body:"){
        whileLoop.block.accept(this)
      }
    }
  }
}
