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

    test("evenNumbersContaining2") - {
      val myList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

      val resultat = ListManipulation.filterEvenNumbersContaining2(myList)

      assert {
        resultat == List(2)

      }
    }

    test("evenNumbersContaining2BiggerThan100") - {
      val myList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 101, 102, 122)

      val resultat =
        ListManipulation.filterEvenNumbersContaining2BiggerThan100(myList)

      assert {
        resultat == List(102, 122)

      }
    }

    test("evenNumbersContaining2BiggerThan100SmallerThan200") - {
      val myList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 101, 102, 122)

      val resultat =
        ListManipulation
          .filterEvenNumbersContaining2BiggerThan100SmallerThan200(myList)

      assert {
        resultat == List(102, 122)

      }
    }

  }

}
