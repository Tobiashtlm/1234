package lesson03
import scala.io.StdIn.readLine
import utest._

object PingPongSuite extends TestSuite {

  val tests = Tests {
    test("ping") - {
      val x = "ping"

      val r = PingPong.hello(x)

      assert {
        r == "pong"
      }
    }

    test("pong") - {
      val x = "pong"

      val r = PingPong.hello(x)

      assert {
        r == "ping"
      }
    }

    test("what") - {
      val x = "ok"

      val r = PingPong.hello(x)

      assert {
        r == "what"
      }
    }

  }
}
