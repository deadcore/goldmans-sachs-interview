package com.gs

/**
  * I was not able to grab this code but heres an example:
  *
  * aabbbcc -> a2b3c2
  */
object StringCompactor {

  def encode(str: String): String = {
    def loop(chars: Array[Char], acc: Int): String = chars match {
      case Array(head, next, _*) if head == next => loop(chars.tail, acc + 1)
      case Array(head, next, _*) if head != next => s"$head$acc${loop(chars.tail, 1)}"
      case Array(head)                           => s"$head$acc"
      case Array()                               => ""
    }

    loop(str.toCharArray, 1)
  }
}