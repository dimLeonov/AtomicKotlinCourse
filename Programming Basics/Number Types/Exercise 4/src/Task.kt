// NumberTypes/Task4.kt
package numberTypesExercise4

import java.text.DateFormat

fun convertToMilliseconds(hours: Long, minutes: Long, seconds: Long): Long {
  return (hours * 3_600_000) + (minutes * 60000) +(seconds * 1000)
}

fun main() {
  println(convertToMilliseconds(1, 30, 0))
}