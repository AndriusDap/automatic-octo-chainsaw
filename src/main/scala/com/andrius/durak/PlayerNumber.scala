package com.andrius.durak

sealed trait PlayerNumber
object First extends PlayerNumber {
  override def toString = "1"
}
object Second extends PlayerNumber {
  override def toString = "2"
}