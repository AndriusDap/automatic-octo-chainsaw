package com.andrius.durak

import com.andrius.durak.Implicits._

case class Player(unsortedHand: List[Card], val number: PlayerNumber, val trumps: Suite) {
  val hand: List[Card] = unsortedHand.sortBy(c => (c.suite == trumps, c.rank))

  def -(card: Card): Player = {
    new Player(hand.filterNot(card.equals), number, trumps)
  }

  def -(card: List[Card]): Player = {
    new Player(hand.filterNot(card.contains), number, trumps)
  }

  def +(card: Card): Player = {
    new Player(hand :+ card, number, trumps)
  }

  def +(card: List[Card]): Player = {
    new Player(hand ++ card, number, trumps)
  }

  override def toString: String = s"(P$number) ${hand.asString}"
}