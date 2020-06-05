package com.ymmihw.scala

import org.junit.Assert.assertEquals
import org.junit.{Assert, Test}
import org.scalatest.matchers.should.Matchers

class UtilsTest extends Matchers {

  @Test
  def whenGcdCalledWith15and27_then3 = {
    assertEquals(3, new Utils().gcd(15, 27))
  }

  @Test
  def whenGcdIterCalledWith15and27_then3 = {
    assertEquals(3, new Utils().gcdIter(15, 27))
  }

  @Test
  def whenFactorialCalledWith6_then720 = {
    assertEquals(720, new Utils().factorial(6))
  }

  @Test
  def whenRangeSumCalledWith1And10_then5 = {
    assertEquals(55, new Utils().rangeSum(1, 10))
  }

  @Test
  def whenPowerCalledWith2And3_then8 = {
    assertEquals(8, new Utils().power(2, 3))
  }

  @Test
  def whenCalledWithSumAndSquare_thenCorrectValue = {
    def square(x: Int) = x * x

    def sum(x: Int, y: Int) = x + y

    def sumSquares(a: Int, b: Int) =
      new Utils().mapReduce(sum, 0, square, a, b)

    assertEquals(385, sumSquares(1, 10))
  }

  @Test
  def whenCalledWithAnonymousFunctions_thenCorrectValue = {
    def sumSquares(a: Int, b: Int) =
      new Utils().mapReduce((x, y) => x + y, 0, x => x * x, a, b)

    assertEquals(385, sumSquares(1, 10))
  }

  @Test
  def whenSumModCalledWith6And10_then10 = {
    // a curried function
    def sum(f: Int => Int)(a: Int, b: Int): Int =
      if (a > b) 0 else f(a) + sum(f)(a + 1, b)

    // another curried function
    def mod(n: Int)(x: Int) = x % n

    // application of a curried function
    assertEquals(1, mod(5)(6))

    // partial application of curried function
    // trailing underscore is required to
    // make function type explicit
    val sumMod5 = sum(mod(5)) _

    assertEquals(10, sumMod5(6, 10))
  }

}
