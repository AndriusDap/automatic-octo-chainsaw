package com.andrius.durak

import com.andrius.durak.Implicits._

case class Rank private (val strength: Int) {


  override def equals(other: Any): Boolean = other match {
    case that: Rank =>
      (that canEqual this) &&
        that.strength == strength
    case _ => false
  }

  def canEqual(other: Any): Boolean = other.isInstanceOf[Rank]

  def <(rank: Rank): Boolean = strength < rank.strength
  override def toString = s"$strength"
}

object Rank {
  private def ranks = Map("T" -> 10, "J" -> 11, "Q" -> 12, "K" -> 13, "A" -> 14)
  def apply(rank: Char): Option[Rank] = {
    val v = ranks.get(rank.toString).orElse(rank.toString.toOptionInt)
    v.flatMap {c => if (c >= 2 && c <= 14) Some(new Rank(c)) else None}
  }

  implicit val rankOrdering = Ordering.by { rank: Rank =>
    rank.strength
  }
}


