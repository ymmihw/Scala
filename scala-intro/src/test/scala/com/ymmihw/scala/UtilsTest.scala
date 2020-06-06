package com.ymmihw.scala

import org.junit.Assert.assertEquals
import org.junit.Test

class UtilsTest {
  @Test
  def whenFibonacciCalledWith6_then13 = {
    assertEquals(13, Utils.fibonacci(6))
  }
}
