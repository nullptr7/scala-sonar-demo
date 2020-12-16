package com.github.nullptr7


class MainClassTest extends BaseTest {

  "division of integers" should {

    "return valid result for non-zero denominator" in {
      MainClass.divisionOfTwoIntegers(10, 2) shouldBe Option(5)
    }

    "return none when denominator is zero" in {
      MainClass.divisionOfTwoIntegers(10, 0) shouldBe None
    }
  }

}
