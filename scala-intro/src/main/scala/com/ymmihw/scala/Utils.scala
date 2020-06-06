package com.ymmihw.scala

object Utils {
  def average(x: Double, y: Double) =
    (x + y) / 2

  def fibonacci(n: Int): Int = n match {
    case 0 | 1 => 1
    case x if x > 1 =>
      fibonacci(x - 1) + fibonacci(x - 2)
  }
}