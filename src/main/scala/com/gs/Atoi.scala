package com.gs

import java.lang.Character.{getNumericValue, isDigit}

/* Problem Name is &&& atoi &&& PLEASE DO NOT REMOVE THIS LINE. */


/**
  * Instructions to candidate.
  * 1) Run this code in the REPL to observe its behaviour. The
  * execution entry point is main().
  * 2) There are bugs in the implementation of atoi(). Consider
  * adding some relevant tests.
  * 3) Correct the implementation of atoi(). Feel free to use
  * print-style debugging in the absence of a true debugger.
  * 4) If time permits, consider adding robustness to atoi().
  * For example, what type of input checking would be useful?
  */
object Atoi {

  /**
    * Takes a string str and returns the int value represented by
    * the string. For example, atoi("42") returns 42.
    */
  def parse(str: String): Int = {
    val number = str.filter(isDigit).map(getNumericValue).foldLeft(0) { (acc, c) => (acc * 10) + c }

    str.headOption match {
      case Some('-') => number * -1
      case Some('+') => number
      case _         => number
    }

  }
}