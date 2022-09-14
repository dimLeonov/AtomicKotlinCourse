// Summary2/Task2.kt
package summaryIIExercise2
import atomictest.eq

class Boring2(val a: Double, val b: String, val c: Int) {
  fun a() = a
  fun b() = b
  fun c() = c
}

fun main() {
  val boring = Boring2(5.5, "test", 5)
  boring.a eq 5.5
  boring.b eq "test"
  boring.c eq 5

}