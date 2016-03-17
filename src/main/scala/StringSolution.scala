import scala.io.StdIn._

object StringSolution {

  def compressedWord(word: String): String = word match {
    case long if long.length > 1 => long.head.toString() + long.length
    case letter => letter
  }

  def compressed(message: String): String = message.split("(?<=(.))(?!\\1)").map(compressedWord).mkString("")


  def main(args: Array[String]) {
    println(compressed(readLine()))
  }
}
