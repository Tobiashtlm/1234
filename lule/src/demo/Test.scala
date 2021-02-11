package demo

object Test {
  def opposite(b: Boolean): Boolean = !b
}

class Test {
  private var i = 0
  def add = {
    i = i + 1
  }
  def get = {
    i
  }
}
