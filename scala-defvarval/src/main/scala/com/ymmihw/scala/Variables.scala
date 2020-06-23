package com.ymmihw.scala

object Variables extends App {
  var variable: Int = {
    println("variable")
    1
  }

  println("After variable declaration")
  println(variable)
  println(variable)

  var secretNumber: Int = 5
  secretNumber = 1
}
