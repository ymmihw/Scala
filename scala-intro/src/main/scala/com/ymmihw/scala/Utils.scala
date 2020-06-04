package com.ymmihw.scala

class Utils {
  def gcd(x: Int, y: Int): Int = {
    if (y == 0) x else gcd(y, x % y)
  }

  def gcdIter(x: Int, y: Int): Int = {
    var a = x
    var b = y
    while (b > 0) {
      a = a % b
      val t = a
      a = b
      b = t
    }
    a
  }
}