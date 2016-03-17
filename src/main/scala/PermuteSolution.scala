import scala.io.StdIn._

object PermuteSolution {
  def permute[T](arr: List[T]): List[T] = arr match {
    case a :: b :: tail => List(b, a) ++ permute(tail)
    case Nil => List.empty
  }

  def main(args: Array[String]) {
    val count = readLine().toInt
    for(x <- 1 to count) {
      println(permute(readLine().toList) mkString)
    }
  }
}
