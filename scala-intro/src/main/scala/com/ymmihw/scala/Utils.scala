package com.ymmihw.scala

class Utils {
  def gcd(x: Int, y: Int): Int = {
    if (y == 0) x else gcd(y, x % y)
  }
}