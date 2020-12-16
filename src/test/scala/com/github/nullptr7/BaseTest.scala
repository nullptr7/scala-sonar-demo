package com.github.nullptr7

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{BeforeAndAfter, Matchers, WordSpec}

@RunWith(classOf[JUnitRunner])
abstract class BaseTest extends WordSpec with Matchers with BeforeAndAfter {

}
