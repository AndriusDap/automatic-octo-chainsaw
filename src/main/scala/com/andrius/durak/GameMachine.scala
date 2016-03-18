package com.andrius.durak

import com.andrius.durak.Implicits._

object GameMachine {

  def play(playerOne: List[Card], playerTwo: List[Card]): Int = {
    val p1 = new Player(playerOne, 1)
    val p2 = new Player(playerTwo, 2)
    attack(p1, p2)
  }

  def attack(attacker: Player, defender: Player, battlefield: List[Card] = List()): Int = {
    val army = availableArmy(attacker, battlefield)
    val squadSize = if (battlefield.isEmpty) 1 else defender.hand.length
    val squad = army.take(squadSize)
    if (squad.nonEmpty) {
      defend(attacker - squad, defender, battlefield, squad)
    } else {
      nextTurn(nextDefender = attacker, nextAttacker = defender)
    }
  }

  def defend(attacker: Player, defender: Player, battlefield: List[Card], units: List[Card]): Int = {
    println()
    println(s"Attacker $attacker")
    println(s"Defender $defender")
    println(s"Attacking units ${units.asString}")
    println(s"Battlefield: ${battlefield.asString}")

    if (battlefield.isEmpty) {
      val passingCard = defender.hand.find(_.rank == units.head.rank)
      if (passingCard.isDefined && attacker.hand.length >= (units.length + 1)) {
        println(s"Passing ${units.asString} with ${passingCard.get}")
        return defend(defender - passingCard.get, attacker, battlefield, units :+ passingCard.get)
      }
    }

    units match {
      case head :: tail =>
        val defence = defender.hand.find(_.canDefend(head))
        if (defence.isDefined) {
          println(s"Defending against $head with ${defence.get}")
          defend(attacker, defender - defence.get, battlefield :+ head :+ defence.get, tail)
        } else {
          println(s"Cannot defend against $head")
          nextTurnAfterLoss(attacker, defender, battlefield, units)
        }
      case Nil => attack(attacker, defender, battlefield)
    }
  }


  def nextTurnAfterLoss(attacker: Player, defender: Player, battlefield: List[Card], units: List[Card]): Int = {
    val lossPenalty = availableArmy(attacker, battlefield).take(defender.hand.length - units.length)
    nextTurn(nextDefender = defender + battlefield + units + lossPenalty, nextAttacker = attacker - lossPenalty)
  }

  def availableArmy(attacker: Player, battlefield: List[Card]): List[Card] = {
    val legalOffenceCards = battlefield match {
      case List() => attacker.hand
      case _ => attacker.hand.filter(p => battlefield.map(c => c.rank).contains(p.rank))
    }
    legalOffenceCards
  }

  def nextTurn(nextDefender: Player, nextAttacker: Player): Int = {
    if (nextDefender.hand.isEmpty && nextAttacker.hand.isEmpty)
      0
    else if (nextDefender.hand.isEmpty)
      nextDefender.number
    else if (nextAttacker.hand.isEmpty)
      nextAttacker.number
    else
      attack(attacker = nextAttacker, defender = nextDefender)
  }
}
