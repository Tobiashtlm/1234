package demo
import scala.io.StdIn.readLine
import scala.util.Random

object Dice {

  def start() = {
    val rnd = new Random
    val guess = readLine("gissa vad de blir av två tärningar: ").toInt
    val dice1 = rnd.between(1, 7)
    val dice2 = rnd.between(1, 7)
    val summa = dice1 + dice2

    if (summa == guess)
      println("Grattis du gissade rätt")
    else {
      val diff = Math.abs(guess - summa)
      println(s"diff fel $diff")
    }

  }
}
