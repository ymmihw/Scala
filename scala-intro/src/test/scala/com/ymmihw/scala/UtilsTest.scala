package com.ymmihw.scala

import org.junit.{Assert, Test}
import org.scalatest.matchers.should.Matchers

class UtilsTest extends Matchers {

  @Test
  def whenGcdCalledWith15and27_then3 = {
    Assert.assertEquals(3, new Utils().gcd(15, 27))
  }

  @Test
  def whenGcdIterCalledWith15and27_then3 = {
    Assert.assertEquals(3, new Utils().gcdIter(15, 27))
  }

  @Test
  def whenFactorialCalledWith6_then720 = {
    Assert.assertEquals(720, new Utils().factorial(6))
  }

  @Test
  def whenRangeSumCalledWith1And10_then5 = {
    Assert.assertEquals(55, new Utils().rangeSum(1, 10))
  }

  @Test
  def whenPowerCalledWith2And3_then8 = {
    Assert.assertEquals(8, new Utils().power(2, 3))
  }

}
