package com.andrius.durak

import org.scalatest.{Matchers, FlatSpec}

class GameSpec extends FlatSpec with Matchers {

  def C(s : String): Card = Card(Suite(s.head), Rank(s.last)).get

  "game" must "be able to play a game" in {


    val attacker = List(C("HQ"), C("H7"), C("HK"), C("C2"))
    val defender = List(C("S4"), C("H6"), C("C7"), C("S6"), C("H5"))

    new GameMachine(Hearts).play(attacker, defender).get should be(First)
  }

  "trumps" must "have orinary rank" in {
    val trump = C("H2")
    trump.rank.strength should be(2)
  }
}
