package com.andrius.durak

import scala.collection.TraversableOnce
import scala.util.Try

object Implicits {
  implicit class StringParser (val s: String) extends AnyVal {
    def toOptionInt = Try (s.toInt) toOption
  }

  implicit class ListFormatter[A] (val s: TraversableOnce[A]) extends AnyVal {
    def asString = s.mkString(", ")
  }
}
