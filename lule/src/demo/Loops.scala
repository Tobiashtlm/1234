package demo

import java.util.Random

object Loops {

  def test() = {
    for(i <- 1 to 10) {
      println(i)
    }
    var running = true
    while(running) {
      println("running")
      running = new Random().nextBoolean
    }
  }
}