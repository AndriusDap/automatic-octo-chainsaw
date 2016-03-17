import scala.io.StdIn._

object TriangleSolution {
  def triangle(h: Int): List[List[Int]] = (0 to h - 1).map(triangleLine).toList

  def triangleLine(k: Int): List[Int] = (0 to k).map(i => factorial(k) / (factorial(i) * factorial(k - i))).toList

  def factorial(n: Int): Int = n match {
    case i if i <= 1 => 1
    case i => i * factorial(i - 1)
  }

  def main(args: Array[String]) {
    val size = readLine().toInt
    print(triangle(size).map(a=> a.mkString(" ")).mkString("\n"))
  }
}
