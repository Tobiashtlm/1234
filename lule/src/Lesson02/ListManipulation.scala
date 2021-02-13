package lesson02

object ListManipulation {
  def isEven(i: Int): Boolean = i % 2 == 0
  def isOdd(i: Int): Boolean = {

    if (isEven(i))
      false
    else
      true
  }
  def filterEvenNumbers(xs: List[Int]): List[Int] = xs.filter(isEven)
  def filterOddNumbers(xs: List[Int]): List[Int] = xs.filter(isOdd)
  def filterEvenNumbersContaining2(xs: List[Int]): List[Int] = xs.filter(isEven)
  def filterEvenNumbersContaining2BiggerThan100(xs: List[Int]): List[Int] = ???
  def filterEvenNumbersContaining2BiggerThan100SmallerThan200(
      xs: List[Int]
  ): List[Int] = ???

}
