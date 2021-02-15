package demo
import utest._
object FizzBuzzSuite extends TestSuite {
  val tests = Tests {
    test("FizzBuzz") - {

      val r1 = FizzBuzz.fizzBuzz(1)
      val r2 = FizzBuzz.fizzBuzz(2)
      val r3 = FizzBuzz.fizzBuzz(3)
      val r5 = FizzBuzz.fizzBuzz(5)
      val r12 = FizzBuzz.fizzBuzz(12)
      val r13 = FizzBuzz.fizzBuzz(13)
      val r15 = FizzBuzz.fizzBuzz(15)

      assert(
        r1 == "1",
        r2 == "2",
        r3 == "Fizz",
        r5 == "Buzz",
        r12 == "Fizz",
        r13 == "13",
        r15 == "FizzBuzz"
      )
    }
  }
}
