package com.gs

/**
  * I was not able to grab this code but heres an example:
  *
  * aabbbcc -> a2b3c2
  */
object StringCompactor {
  def encode(str: String): String = {

    val chars = str.toCharArray

    def loop(elem: Char, chars: Array[Char], acc: Int): String = {
      val maybeNext = chars.headOption

      if (maybeNext.isDefined) {
        val next = maybeNext.get

        if (elem == next) {
          loop(next, chars.tail, acc + 1)
        } else {
          s"$elem$acc${loop(next, chars.tail, 1)}"
        }
      } else {
        s"$elem$acc"
      }
    }

    chars.headOption.fold("")(loop(_, chars.tail, 1))
  }


}