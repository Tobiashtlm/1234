package demo
import scala.io.StdIn.readLine

object Quiz {

  def start() = {

    val guess = readLine("Heter Sveriges huvudstad Stockholm? Y/N ")
    val Y = true
    val N = false


    if (Y)
      println("Grattis du svarade rätt! ")
    else {
      println("Du svarade fel!")

    }
  }
}
