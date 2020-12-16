package com.github.nullptr7

object MainClass {

  def divisionOfTwoIntegers(numerator: Int, denominator: Int): Option[Int] = {
    try {
      Option(numerator / denominator)
    } catch {
      case _: Throwable =>
        None
    }
  }

  def unUsedMethodWillNotBePartOfCoverage(): Unit = {
    println("This is just a test method just to prove this is not included in any test")
  }
}
