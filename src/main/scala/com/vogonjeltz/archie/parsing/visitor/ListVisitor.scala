package com.vogonjeltz.archie.parsing.visitor
import com.vogonjeltz.archie.AST.tree.Element
import com.vogonjeltz.archie.parsing.antlr.archieParser.{ElementListContext, NameListContext}

import scala.collection.JavaConversions._
/**
  * Created by Freddie on 03/01/2017.
  */
class NameListVisitor extends ArchieVisitor[List[String]] {

  override def visitNameList(ctx: NameListContext) = {
    val names = ctx.name.toList.map(_.getText)
    if (names == null) List()
    else names
  }

}

class ElementListVisitor(elementVisitor: ElementVisitor) extends ArchieVisitor[List[Element]] {

  override def visitElementList(ctx: ElementListContext) = {
    val elements = ctx.element.toList.map(_.accept(elementVisitor))
    if (elements == null) List()
    else elements
  }

}