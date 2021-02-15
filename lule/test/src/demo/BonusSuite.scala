package demo
import utest._
object MyMathSuite extends TestSuite {

  val tests = Tests {
    test("Multiply") - {

      val x = 2
      val y = 3

      val r = MyMath.multiply(x, y)

      assert {

        r == (6)
      }
    }

    test("plus") - {

      val x = 2
      val y = 3

      val r = MyMath.plus(x, y)

      assert {

        r == (5)
      }
    }

  }
}
