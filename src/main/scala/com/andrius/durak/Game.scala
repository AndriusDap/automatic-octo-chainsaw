package com.andrius.durak

import com.andrius.durak.Implicits._

object Game {
  def main(args: Array[String]) = {
    val lines = scala.io.Source.fromFile(args.head).getLines()
    val trump = lines.find(_ => true).get
    val results = lines.map { line =>
      val cards = line.split(" \\| ").map(_.split(" ").map(Card(trump)))
      GameMachine.play(cards(0).toList, cards(1).toList)
    }
    println(s"Game results: ${results.asString}")
  }
}
