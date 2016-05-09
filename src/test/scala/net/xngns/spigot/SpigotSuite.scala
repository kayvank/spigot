package net.xngns.spigot

import org.scalatest.FunSuite

class SpigotSuite extends FunSuite {

  // Source: http://oeis.org/A000796
  val digitsOfPiTo105: List[Int] =
    List(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9, 3, 2, 3, 8, 4, 6, 2, 6, 4, 3,
         3, 8, 3, 2, 7, 9, 5, 0, 2, 8, 8, 4, 1, 9, 7, 1, 6, 9, 3, 9, 9, 3, 7, 5, 1,
         0, 5, 8, 2, 0, 9, 7, 4, 9, 4, 4, 5, 9, 2, 3, 0, 7, 8, 1, 6, 4, 0, 6, 2, 8,
         6, 2, 0, 8, 9, 9, 8, 6, 2, 8, 0, 3, 4, 8, 2, 5, 3, 4, 2, 1, 1, 7, 0, 6, 7,
         9, 8, 2, 1, 4)

  test("pi should generate the first 105 digits of Pi correctly") {
    assert(pi.take(105).toList == digitsOfPiTo105)
  }

  test("piL should generate the first 105 digits of Pi correctly") {
    assert(piL.take(105).toList == digitsOfPiTo105)
  }
}
