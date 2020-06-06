package com.ymmihw.scala

object Methods {
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

  def factorial(a: Int): Int = {
    var result = 1
    var i = 1
    do {
      result *= i
      i = i + 1
    } while (i <= a)
    result
  }

  def rangeSum(a: Int, b: Int): Int = {
    var sum = 0
    for (i <- a to b) {
      sum += i
    }
    sum
  }

  def power(x: Int, y: Int): Int = {
    def powNested(i: Int,
                  accumulator: Int): Int = {
      if (i <= 0) accumulator
      else powNested(i - 1, x * accumulator)
    }

    powNested(y, 1)
  }

  def mapReduce(r: (Int, Int) => Int,
                i: Int,
                m: Int => Int,
                a: Int, b: Int) = {
    def iter(a: Int, result: Int): Int = {
      if (a > b) {
        result
      } else {
        iter(a + 1, r(m(a), result))
      }
    }

    iter(a, i)
  }
}