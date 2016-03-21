package com.andrius.durak

import com.andrius.durak.Implicits._

class GameMachine(val trump: Suite) {
  def play(playerOne: List[Card], playerTwo: List[Card]): Option[PlayerNumber] = {
    val p1 = new Player(playerOne, First, trump)
    val p2 = new Player(playerTwo, Second, trump)
    attack(p1, p2)
  }

  def attack(attacker: Player, defender: Player, battlefield: List[Card] = List()): Option[PlayerNumber] = {
    val army = availableArmy(attacker, battlefield)
    val squadSize = if (battlefield.isEmpty) 1 else defender.hand.length
    val squad = army.take(squadSize)
    if (squad.nonEmpty) {
      defend(attacker - squad, defender, battlefield, squad)
    } else {
      nextTurn(nextDefender = attacker, nextAttacker = defender)
    }
  }

  def canDefend(attacker: Card, defender: Card): Boolean = {
      if(attacker.suite == defender.suite)
        attacker.rank < defender.rank
      else if(defender.suite == trump)
        true
      else
        false
  }

  def defend(attacker: Player, defender: Player, battlefield: List[Card], units: List[Card]): Option[PlayerNumber] = {
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
        val defence = defender.hand.find(canDefend(head, _))
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


  def nextTurnAfterLoss(attacker: Player, defender: Player, battlefield: List[Card], units: List[Card]): Option[PlayerNumber] = {
    val lossPenalty = availableArmy(attacker, battlefield ++ units).take(defender.hand.length - units.length)
    nextTurn(nextDefender = defender + battlefield + units + lossPenalty, nextAttacker = attacker - lossPenalty)
  }


  def availableArmy(attacker: Player, battlefield: List[Card]): List[Card] = {
    val legalOffenceCards = battlefield match {
      case List() => attacker.hand
      case _ => attacker.hand.filter(p => battlefield.map(c => c.rank).contains(p.rank))
    }
    legalOffenceCards
  }

  def nextTurn(nextDefender: Player, nextAttacker: Player): Option[PlayerNumber] = {
    if (nextDefender.hand.isEmpty && nextAttacker.hand.isEmpty)
      None
    else if (nextDefender.hand.isEmpty)
      Some(nextDefender.number)
    else if (nextAttacker.hand.isEmpty)
      Some(nextAttacker.number)
    else
      attack(attacker = nextAttacker, defender = nextDefender)
  }
}
