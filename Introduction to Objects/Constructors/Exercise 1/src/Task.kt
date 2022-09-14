// Constructors/Task1.kt
package constructorsExercise1


class Floating(val d: Double) {
  override fun toString(): String = "$d"

}

fun main() {
  val data = Floating(1.0)
  println(data)
}