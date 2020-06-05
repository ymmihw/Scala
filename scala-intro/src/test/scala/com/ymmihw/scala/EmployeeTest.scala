package com.ymmihw.scala

import org.junit.Assert.assertEquals
import org.junit.Test

class EmployeeTest {
  @Test
  def whenSalaryIncremented_thenCorrectSalary = {
    val employee = new Employee("John Doe", 1000)
    employee.incrementSalary()
    assertEquals(1020, employee.salary)
  }
}
