package com.gs

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


object Solution {

  /**
    * Takes a string str and returns the int value represented by
    * the string. For example, atoi("42") returns 42.
    */
  def atoi(str: String): Int = {

    val str2 = if (str.startsWith("-")) str.substring(1, str.length) else str

    str2.foldLeft(0) { case (acc, c) => (acc * 10) + Character.getNumericValue(c) }


  }


  /**
    * boolean doTestsPass()
    * Returns true if all tests pass. Otherwise returns false.
    */
  def doTestsPass(): Boolean = {

    println(s"3: ${atoi("3")}")
    println("")
    println(s"1: ${atoi("1")}")
    println("")
    println(s"1: ${atoi("11")}")
    println("")
    println(s"1004: ${atoi("1004")}")
    println("")
    println(s"1004: ${atoi("-12")}")
    println("")

    // todo: implement more tests, please
    // feel free to make testing more elegant
    (atoi("3") == 3) &&
    (atoi("1") != 2) &&
    (atoi("1004") == 1004)
  }


  /**
    * Execution entry point.
    */
  def main(args: Array[String]) {
    if (doTestsPass()) {
      println("All tests pass")
    }
    else {
      println("There are test failures")
    }
  }
}