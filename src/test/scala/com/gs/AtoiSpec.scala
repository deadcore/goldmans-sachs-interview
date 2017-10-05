package com.gs

import org.scalatest.Matchers._
import org.scalatest.WordSpec

class AtoiSpec extends WordSpec {

  val testTable = Seq(
    "3" -> 3,
    "1" -> 1,
    "-1" -> -1,
    "-124" -> -124,
    "+124" -> 124,
    "1004" -> 1004,
    "1,394" -> 1394,
    "-1,394" -> -1394,
    "1,394,458" -> 1394458
  )

  "StringCompator" should {
    "encode(String)" should {
      testTable.foreach { x =>
        s"${x._1} to [${x._2}]" in {
          Atoi.parse(x._1) should equal(x._2)
        }
      }
    }
  }
}
