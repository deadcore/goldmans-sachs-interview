package com.gs

import org.scalatest.Matchers._
import org.scalatest.WordSpec

class StringCompactorSpec extends WordSpec {

  val testTable = Seq(
    "" -> "",
    "a" -> "a1",
    "aa" -> "a2",
    "aab" -> "a2b1",
    "aabb" -> "a2b2",
    "aabba" -> "a2b2a1",
    "aabbaa" -> "a2b2a2"
  )

  "StringCompator" should {
    "encode(String)" should {
      testTable.foreach { x =>
        s"[${x._1}] to [${x._2}]" in {
          StringCompactor.encode(x._1) should equal(x._2)
        }
      }
    }
  }
}
