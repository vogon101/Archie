package com.vogonjeltz.archie.parsing.visitor

import com.vogonjeltz.archie.AST.tree._
import com.vogonjeltz.archie.parsing.antlr._
import com.vogonjeltz.archie.parsing.antlr.archieParser.{ClassDefContext, ElementListContext, LineContext, ProgramContext}

import scala.collection.JavaConversions._
/**
  * Created by Freddie on 03/01/2017.
  */
abstract class ArchieVisitor[T] extends archieBaseVisitor[T]{

}

class ProgramVisitor extends ArchieVisitor[AST] {

  override def visitProgram(ctx: ProgramContext) = {
    val lineVisitor = new LineVisitor()
    new AST(
      ctx.line().toList.map(_.accept(lineVisitor))
    )
  }

}

class LineVisitor extends ArchieVisitor[Line] {

  lazy val classDefVisitor = new ClassDefVisitor()

  override def visitLine(ctx: LineContext) = {
    if (ctx.classDef() != null) {
      ctx.classDef().accept(classDefVisitor)
    }
    else if (ctx.element() != null) {
      ctx.element().accept(new ElementVisitor())
    } else if (ctx.COMMENT() != null) {
      Comment(ctx.COMMENT().toString)
    } else {
      throw new Exception("Line visitor match not exhaustive")
    }
  }

}

class ClassDefVisitor extends ArchieVisitor[ClassDef] {

  override def visitClassDef(ctx: ClassDefContext): ClassDef = {
    lazy val nameListVisitor = new NameListVisitor()
    val body: Option[Element] =
      if (ctx.element() != null) Some(ctx.element().accept(new ElementVisitor()))
      else None
    ClassDef(
      ctx.classHeader().ALPHA_NUMERIC_NAME().getText,
      ctx.classHeader().nameList().accept(nameListVisitor),
      body
    )
  }

}
