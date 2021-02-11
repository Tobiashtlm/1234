package demo

object Lists {
  // returnera en lista i omvänd ordning
  def reverse(xs: List[Int]): List[Int] = xs.reverse

  // returnera true om listan innehåller x
  def contains(x: Int, xs: List[Int]): Boolean = xs.contains(x)

  // slå ihop listorna och returnera sammanslagen lista
  def join(xs: List[Int], ys: List[Int]): List[Int] = xs ++ ys // todo

//returnerar svansen på listan
  def tail(xs: List[Int]): List[Int] = xs.tail

  def distinct(xs: List[Int]): List[Int] = xs.distinct

  def addFirst(x: Int, xs: List[Int]): List[Int] = x +: xs

  def addLast(x: Int, xs: List[Int]): List[Int] = xs :+ x

  def dropRight(n: Int, xs: List[Int]): List[Int] = xs.dropRight(n)

  def endsWith

}
