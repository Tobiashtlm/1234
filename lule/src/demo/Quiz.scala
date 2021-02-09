package demo
import scala.io.StdIn.readLine

object Quiz {

  def start() = {
    var summa = 0
    var summa1 = 0
    
    println(
      "Svara genom att ange ett av svarsalternativen (1),(2) eller (3). Rätt svar ger 1 poäng, fel svar get minus 1 poäng"
    )

    val guess1 = readLine("""Vem styr Sverige?
    1. Kungen
    2. Tobbe
    3. Jehovas
    Svar: """)

    if (guess1 == "2") {
      summa = summa + 1
      println("[31mGrattis du svarade rätt på \u001b[31mfråga\u001b[0m 1! Men den var enkel. ")
    } else {
      println("Loser du svarade fel på fråga 1, det börjar inte bra!")
    }

    val guess2 = readLine("""Vilken färg är himmlen?
    1. Gul
    2. Silver
    3. Blå 
    Svar: """)

    if (guess2 == "3") {
      summa = summa + 1
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
      summa = summa + 1
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
      summa = summa + 1
      println("\u001b[31mGrattis du svarade rätt på fråga 4! ")
    } else {
      summa = summa - 1
      println("Loser du svarade fel på fråga 4!")
    }

    println(s"$summa $summa1/4 Poäng")

  }
}
