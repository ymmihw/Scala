package com.ymmihw.scala

trait Composition extends Orchestration with Mixing {
  var composer: String

  def compose(): String

  var studio: String

  def getStudio(): String = s"Composed at studio $studio"
}
