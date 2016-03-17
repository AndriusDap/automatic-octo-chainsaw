object MinglerSolution {
  def mingledStrings(a: String, b: String): String = (a zip b).flatMap { case (a, b) => Seq(a, b) } mkString

  def main(args: Array[String]) {
    val n = scala.io.StdIn.readLine()
    val p = scala.io.StdIn.readLine()

    println(mingledStrings(n, p))
  }
}