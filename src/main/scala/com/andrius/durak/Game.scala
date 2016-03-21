package com.andrius.durak

object Game {
  def main(args: Array[String]) = {
    val lines = scala.io.Source.fromFile(args.head).getLines()
    val trump = Suite(lines.find(_ => true).get.head)
    if(trump.isEmpty)
      println("Impossible trump suite passed in")
    else {
      val machine: GameMachine = new GameMachine(trump.get)
      val results = lines.map { line =>
        val cards = line.split(" \\| ").map(_.split(" ").map(c => Card(Suite(c.head), Rank(c.last))))
        if (cards.map(isValid).foldLeft {true} {_ && _})
          Some(machine.play(cards(0).flatten.toList, cards(1).flatten.toList))
        else None
      }
      println(s"Game results: $results")
    }
  }

  def isValid: (Array[Option[Card]]) => Boolean = {
    c => c.flatten.length == c.length
  }
}