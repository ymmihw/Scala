package com.ymmihw.scala

sealed trait Currency
object Currency {
  case object EUR extends Currency
  case object USD extends Currency
  case object GBP extends Currency
}
