package demo
import scala.io.StdIn.readLine

object Quiz {

  def start() = {

    println("Svara genom att ange ett av svarsalternativen (1),(2) eller (3).")

    val guess1 = readLine("""Vem styr Sverige?
    1. Kungen
    2. Tobbe
    3. Jehovas
    Svar: """)

    if (guess1 == "2") {

      println("Grattis du svarade rätt på fråga 1! Men den var enkel. ")
    } else {
      println("Loser du svarade fel på fråga 1, det börjar inte bra!")
    }

    val guess2 = readLine("""Vilken färg är himmlen?
    1. Gul
    2. Silver
    3. Blå 
    Svar: """)

    if (guess2 == "3") {
      println("Grattis du svarade rätt på fråga 2! ")
    } else {
      println("Loser du svarade fel på fråga 2!")
    }

    val guess3 = readLine("""Hur många fötter har en häst?
    1. 4 fötter
    2. 2 fötter
    3. 0 fötter
    Svar: """)

    if (guess3 == "3") {
      println("Grattis du svarade rätt på fråga 3! ")
    } else {
      println("Loser du svarade fel på fråga 3!")
    }

    val guess4 = readLine("""Hur många bokstäver finns i ordet Katt? 
    1. 4st
    2. 3st
    3. 30st
    Svar: """)

    if (guess4 == "1") {
      println("Grattis du svarade rätt på fråga 4! ")
    } else {
      println("Loser du svarade fel på fråga 4!")
    }

  }
}
