package com.ymmihw.scala

import org.junit.{Assert, Test}
import org.scalatest.matchers.should.Matchers

class UtilsTest extends Matchers {

  @Test
  def whenGcdCalledWith15and27_then3 = {
    Assert.assertEquals(3, new Utils().gcd(15, 27))
  }
}
