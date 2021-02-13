package demo

import utest._

object ListsSuite extends TestSuite {
  val tests = Tests {
    test("reverse list") - {

      val list = List(1, 2, 3)

      val r = Lists.tail(list)
      assert {
        r == List(2, 3)
      }
    }

    test("xxxxxxxxxx") - {
      val list = List(1, 2)
      val r = Lists.addLast(3, list)
      assert {
        r == List(1, 2, 3)
      }
    }

    test("lägg till element först i listan") - {
      val list = List(2, 3)
      val r = Lists.addFirst(1, list)
      assert {
        r == List(1, 2, 3)
      } 
    }
  

    test("select elements and ignore duplicates") - {
      val list = List(1, 1, 2, 3, 3, 5, 6, 7)
      val r = Lists.distinct(list)
      assert {
        r == List(1, 2, 3, 5, 6, 7)
      }
    }

    test("list contains") - {
      val list = List(1, 2, 3)

      val result = Lists.contains(2, list)

      assert {
        result == true
      }
    }
    test("list not contains") - {
      val list = List(1, 2, 3)

      val result = Lists.contains(10, list)

      assert {
        result == false

      }
    }
    test("join") - {
      val list1 = List(1, 2)
      val list2 = List(3, 4)

      val result = Lists.join(list1, list2)

      assert {
        result == List(1, 2, 3, 4)
      }
    }

    test("dropRight") - {
      val list = List(1, 2, 3, 4, 5)

      val r = Lists.dropRight(2, list)

      assert {
        r == List(1, 2, 3)

      }
    }

    test("endsWith") - {
      val list = List(11, 12, 33, 44, 55)
      val end = List(44, 55)

      val r = Lists.endsWith(end, list)

      assert {
        r == true
      }
    }

    test("startsWith") - {
      val list = List(1, 2, 3, 4, 5)
      val start = 2

      val r = Lists.startsWithInt(start, list)

      assert {
        r == false

      }
    }
  }
}
