package demo


import utest._

object TestSuite extends TestSuite {

  val tests = Tests {
    test("describe test here") - {
      // set up test if needed

      // runt tests

      // assert test
    }
    test("opposite true") - {
      val oppositeTrueResult = Test.opposite(true)

      assert {
        oppositeTrueResult == false
      }
    }
    test("opposite false") - {
      val oppositeFalseResult = Test.opposite(false)

      assert {
        oppositeFalseResult == true
      }
    }
    test("a class") - {
      val dut = new Test

      dut.add
      dut.add
      dut.add
      val result = dut.get

      assert {
        result == 3
      }
    }
    test("a freshly instantiated class") - {
      val dut = new Test

      val result = dut.get

      assert {
        result == 0
      }
    }
  }
}
