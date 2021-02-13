package lesson02

import utest._

object ListManipulationSuite extends TestSuite {

  val tests = Tests {
    test("IsEven, Jämna tal") - {
      val myList = List(1, 2, 3, 4, 5)

      val resultat = ListManipulation.filterEvenNumbers(myList)

      assert {
        resultat == List(2, 4)
      }
    }

    test("IsEven, Ojämna tal") - {
      val myList = List(1, 2, 3, 4, 5)

      val resultat = ListManipulation.filterOddNumbers(myList)

      assert {
        resultat == List(1, 3, 5)

      }
    }

  }

}
