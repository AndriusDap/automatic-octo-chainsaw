package com.andrius.durak

sealed abstract class Suite
object Hearts extends Suite {
  override def toString = "H"
}
object Spades extends Suite {
  override def toString = "S"
}
object Clubs extends Suite {
  override def toString = "C"
}
object Diamonds extends Suite {
  override def toString = "D"
}

object Suite {
  def apply(name :Char): Option[Suite] = name match {
    case 'H' => Some(Hearts)
    case 'S' => Some(Spades)
    case 'C' => Some(Clubs)
    case 'D' => Some(Diamonds)
    case _ => None
  }
}