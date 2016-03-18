package com.andrius.durak

import com.andrius.durak.Implicits._

case class Player(unsortedHand: List[Card], playerNumber: Int) {
  val hand: List[Card] = unsortedHand.sorted
  val number: Int = playerNumber

  def -(card: Card): Player = {
    new Player(hand.filterNot(card.equals), number)
  }

  def -(card: List[Card]): Player = {
    new Player(hand.filterNot(card.contains), number)
  }

  def +(card: Card): Player = {
    new Player(hand :+ card, number)
  }

  def +(card: List[Card]): Player = {
    new Player(hand ++ card, number)
  }

  override def toString: String = s"(P$number) ${hand.asString}"
}