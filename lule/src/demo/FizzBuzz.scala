package demo
object FizzBuzz {

  def fizzBuzz(i: Int): String = {

    val japp = i % 3 == 0
    val twix = i % 5 == 0

    if (japp && twix)
      "FizzBuzz"
    else if (twix)
      "Buzz"
    else if (japp)
      "Fizz"
    else i.toString

  }

}
