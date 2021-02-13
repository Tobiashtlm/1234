package lesson03

object PingPong {
  def hello(x: String): String = {
    if (x.equalsIgnoreCase("ping"))
      "pong"
    else if (x.equalsIgnoreCase("pong"))
      "ping"
    else ("what")
  }
}
