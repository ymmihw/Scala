package com.ymmihw.scala

import com.ymmihw.scala.Fingers._

class FingersOperation {

  def isShortest(finger: Finger) =
    Fingers.values.toList.sortBy(_.height).head == finger

  def twoLongest() =
    Fingers.values.toList.sortBy(_.heightInCms()).takeRight(2)
}
