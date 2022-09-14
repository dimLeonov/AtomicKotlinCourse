// Summary1/Task7.kt
package summaryIExercise7

fun countDigits(number: Int, digit: Int): Int {
  var worker = number
  var occurrences = 0


  return number.toString().filter { c -> c.digitToInt() == digit }.length
}

fun main() {
  println(countDigits(764241, 4)) // 2
}