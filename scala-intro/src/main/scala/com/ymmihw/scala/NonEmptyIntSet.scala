package com.ymmihw.scala

class NonEmptyIntSet(val head : Int, val tail : IntSet)
  extends IntSet {
 
  def contains(x : Int) =
    head == x || (tail contains x)
 
  def incl(x : Int) =
    if (this contains x) {
      this
    } else {
      new NonEmptyIntSet(x, this)
    }
}