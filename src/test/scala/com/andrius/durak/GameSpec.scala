package com.andrius.durak

import org.scalatest.{Matchers, FlatSpec}

class GameSpec extends FlatSpec with Matchers {

  "game" must "be able to play a game" in {

    val C: (String) => Card = Card("H")
    val attacker = List(C("HQ"), C("H7"), C("HK"), C("C2"))
    val defender = List(C("S4"), C("H6"), C("C7"), C("S6"), C("H5"))

    GameMachine.play(attacker, defender) should be(1)
  }

  "cards" must "be sorted by strength after sorting" in {
    val C: (String) => Card = Card("H")
    val offense = List(C("HQ"), C("H7"), C("HK"), C("C2"))

    offense.sorted should be(List(C("C2"), C("H7"), C("HQ"), C("HK")))
  }

  "cards" must "be able to sort non trump cards correctly" in {
    val C: (String) => Card = Card("H")
    val offense = List(C("HQ"), C("C4"), C("C2"), C("D3"), C("D4"), C("D2"))

    offense.sorted should be(List(C("D2"), C("C2"), C("D3"), C("D4"), C("C4"), C("HQ")))
  }

  "non trump cards" must "have one strength dimension" in {
    val c = Card("H")("CT")
    c.strength should be(Array(0, 0, 10, 0))
  }

  "trump cards" must "have all strength dimensions" in {
    val c = Card("H")("HT")
    c.strength should be(Array(24, 24, 24, 24))
  }

  "trumps" must "defeat ordinary cards" in {
    val trump = Card("H")("H2")
    val ordinary = Card("H")("CT")
    trump.canDefend(ordinary) should be(true)
  }

  "trumps" must "have orinary rank" in {
    val trump = Card("H")("H2")
    trump.rank should be(2)
  }

  "trumps" must "have aces with orinary rank" in {
    val trump = Card("H")("HA")
    trump.rank should be(Card("H")("CA").rank)
  }

  "ordinary cards" must "not defeat different suites" in {
    val diamond = Card("H")("DT")
    val clove = Card("H")("C2")
    clove.canDefend(diamond) should be(false)
  }

  "ordinary cards" must "not defeat trumps" in {
    val trump = Card("H")("H2")
    val ordinary = Card("H")("CT")
    ordinary.canDefend(trump) should be(false)
  }
}
