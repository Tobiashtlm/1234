package demo

object Types {
  var a: String = "hej" //här deklareras en sträng som heter A
  val b = "hej då"
  val i = 42
  val pi: Double = 3.1415
  val speech = """ Hejsan 
detta 
ska bli 
4 rader"""
  var firstName = "Jonas"
  var mi = "Bengan"
  var lastName = "Nordsten"

  val supernamn = s"$firstName $mi $lastName"

  val iIs42 = 42 == i

  def test() = {
    val i: Int = 42

    a = "Hello"
    println(a + "ove rytter")
    println(b)

    println(i + pi)

    if (iIs42)
      println("iIs42 är true")
    else
      println("iIs42 är false")

    println(speech)
    println(supernamn)

    System.err.println("Error 404 ")

  }
}
