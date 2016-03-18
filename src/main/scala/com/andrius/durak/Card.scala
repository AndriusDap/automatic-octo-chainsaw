package com.andrius.durak

import com.andrius.durak.Implicits._

case class Card(val strength: Array[Int], val rank: Int, val asString: String) {
  def canDefend(that: Card): Boolean = (this.strength, that.strength).zipped.map(_ - _).forall(_ >= 0)

  override def toString = asString

  def canEqual(other: Any): Boolean = other.isInstanceOf[Card]

  override def equals(other: Any): Boolean = other match {
    case that: Card =>
      (that canEqual this) &&
        strength.deep == that.strength.deep
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(strength)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}

object Card {
  def suites: Seq[String] = Seq("H", "D", "C", "S")

  def ranks: Seq[String] = Seq("T", "J", "Q", "K", "A")

  def maxOrdinaryStrength: Int = asStrength(ranks.last)

  def apply(trumps: String)(card: String): Card = {
    val strength = asStrength(card takeRight 1)
    val suite = card take 1

    if (suite == trumps)
      new Card(Array.fill(4)(maxOrdinaryStrength + strength), strength, card)
    else
      new Card(Array.fill(4)(0).updated(suites.indexOf(suite), strength), strength, card)
  }

  def asStrength(rank: String): Int = rank.toOptionInt.getOrElse(10 + ranks.indexOf(rank.toUpperCase))

  implicit val CardOrdering = Ordering.by { card: Card =>
    val max: Int = card.strength.max
    (max, card.strength.indexOf(max))
  }
}
