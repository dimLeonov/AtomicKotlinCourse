// IntroGenerics/Task1.kt
package introductionToGenericsExercise1
import atomictest.capture
import atomictest.eq

fun <T> List<T>.secondOrNull(): T? = if (this.size >= 2) this.get(1) else null

fun <T> List<T>.penultimateOrNull(): T? = if (this.size >= 2) this.get(this.size - 2) else null

fun main() {
  val ints = listOf(1, 2, 3)
  ints.secondOrNull() eq 2
  ints.penultimateOrNull() eq 2

  val strings = listOf("a", "b", "c", "d")
  strings.secondOrNull() eq "b"
  strings.penultimateOrNull() eq "c"
}