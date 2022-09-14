// NonNullAssertions/Task3.kt
package nonNullAssertionsExercise3
import atomictest.eq
import java.util.Collections
import kotlin.math.absoluteValue

fun absMinIsMax(list: List<Int>): Boolean {
  return when {
    list.isEmpty() -> false
    Math.abs(Collections.min(list))
            == Math.abs(Collections.max(list)) -> true
    else -> false
  }
}

fun main() {
  absMinIsMax(listOf(-10, 1, 10)) eq true
  absMinIsMax(listOf(10, 10)) eq true
  absMinIsMax(listOf(-10, 1)) eq false
}