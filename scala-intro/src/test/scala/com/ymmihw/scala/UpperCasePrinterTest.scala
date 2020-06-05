package com.ymmihw.scala

import org.junit.Assert.assertEquals
import org.junit.Test

class UpperCasePrinterTest {
  @Test
  def givenEmployeeWithTrait_whenToStringCalled_thenUpper = {
    val employee = new Employee("John Doe", 10) with UpperCasePrinter
    assertEquals("EMPLOYEE(NAME=JOHN DOE, SALARY=10)", employee.toString)
  }
}
