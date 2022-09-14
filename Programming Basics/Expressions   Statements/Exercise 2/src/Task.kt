// ExpressionsStatements/Task2.kt
package expressionsAndStatementsExercise2

import testingExercise2.sum
import java.util.StringJoiner

fun f(a: Int ,b: Int ,) = a + b

fun g(a: String, b: String) = a + b

fun h() = println("h()")

fun main() {
  val fVal: Int = f(1, 2)
  val gVal: String = g("a", "bc")
  val hVal: Unit = h()
  println("Int")
  println("String")
  println("Unit")
}