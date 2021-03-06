package com.ymmihw.scala

trait Mixing {
  var mixer: String
  val qualityRatio: Double = 3.14

  def algorithm: MixingAlgorithm = HighInstrumentalQuality
}
