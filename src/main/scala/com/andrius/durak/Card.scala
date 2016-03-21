package com.andrius.durak

case class Card(val suite: Suite, val rank: Rank) {

  override def toString = s"$suite$rank"

  def canEqual(other: Any): Boolean = other.isInstanceOf[Card]

  override def equals(other: Any): Boolean = other match {
    case that: Card =>
      (that canEqual this) &&
        suite == that.suite && rank == that.rank
    case _ => false
  }
}

object Card {
  def apply(suite: Option[Suite], rank: Option[Rank]): Option[Card] = suite.flatMap(s => rank.map(new Card(s, _)))
}
