import org.scalatest._
import scalaz.Scalaz
import Scalaz._

class HackerRankSpec extends FlatSpec with Matchers {

  def oddSum(list: List[Int]): Int = list match {
    case x :: tail if x % 2 != 0 => x + oddSum(tail)
    case x :: tail => oddSum(tail)
    case Nil => 0
  }

  def oddSumGolf(list: List[Int]): Int = list.map(x => x * (x % 2)).sum

  "oddSum" must "sum lists with odd number of elements" in {
    val list = List(3, 2, 4, 6, 5, 7, 8, 0, 1)
    oddSum(list) should ===(16)
  }

  "oddSum" must "sum lists work with negatives" in {
    val list = List(-3, 2, 4, -6, 5, 7, 8, 0, 1)
    oddSum(list) should ===(10)
  }


  "oddSum" must "sum lists with single element" in {
    val list = List(1)
    oddSum(list) should ===(1)
  }

  def mingledStringz(a: String, b: String): String = (a zip b).flatMap(_.fold(Seq(_, _))) mkString

  "mingledStrings" must "be mingled thoroughly" in {
    MinglerSolution.mingledStrings("abcde", "pqrst") should be("apbqcrdset")
  }

  "mingledStringz" must "be mingled thoroughly with scalaz" in {
    mingledStringz("abcde", "pqrst") should be("apbqcrdset")
  }

  "permute" must "permute string with sample data" in {
    PermuteSolution.permute(List(1, 2, 3, 4)) should be(List(2, 1, 4, 3))
  }


  "factorial" must "be able to get factorial of 10" in {
    TriangleSolution.factorial(10) should be > 0
  }


  "triangleLine" must "be able to return third line" in {
    TriangleSolution.triangleLine(2) should be(List(1, 2, 1))
  }

  "triangle" must "be able to return triangle" in {
    TriangleSolution.triangle(2) should be(List(List(1), List(1, 1)))
  }

  def exp(x: Double): Double = (0 to 9).map(t => scala.math.pow(x, t) / TriangleSolution.factorial(t)).sum

  "exp" must "correctly exponentiate" in {
    exp(20) should be(2423600.1887 +- 0.0001)
  }

  "copressedWord" must "not cahnge single letter" in {
    StringSolution.compressedWord("a") should be("a")
  }

  "copressedWord" must "compress a word" in {
    StringSolution.compressedWord("aaa") should be("a3")
  }

  "compression" must "compress a single word" in {
    StringSolution.compressed("aaaa") should equal("a4")
  }

  "compression" must "compress a given phrase" in {
    StringSolution.compressed("aaabaaaaccaaaaba") should equal("a3ba4c2a4ba")
  }
}