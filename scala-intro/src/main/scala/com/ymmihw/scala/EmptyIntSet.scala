package com.ymmihw.scala

class EmptyIntSet extends IntSet {
  def contains(x: Int) = false

  def incl(x: Int) =
    new NonEmptyIntSet(x, this)
}