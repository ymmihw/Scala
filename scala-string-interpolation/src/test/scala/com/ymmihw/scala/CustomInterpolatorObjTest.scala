package com.ymmihw.scala

import org.scalatest.GivenWhenThen
import org.scalatest.featurespec.AnyFeatureSpec
import com.ymmihw.scala.CustomInterpolatorObj._

class CustomInterpolatorObjTest extends AnyFeatureSpec with GivenWhenThen {

  Scenario("The custom interpolator may work as expected") {

    info("As a programmer")
    info("I want to demonstrate the expected behavior of custom string interpolator")

    Given("a string to be interpolated")
    val testString = "well"

    When("when we interpolate a string with our custom interpolator")
    val result = custom"the custom interpolator works $testString"

    Then("the result will be as expected")
    val expectedResult = new StringContext("the custom interpolator works ", "").custom(testString)
    assert(result == expectedResult)
  }
}