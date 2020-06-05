package com.ymmihw.scala

abstract class IntSet {
  // add an element to the set
  def incl(x: Int): IntSet

  // whether an element belongs to the set
  def contains(x: Int): Boolean
}