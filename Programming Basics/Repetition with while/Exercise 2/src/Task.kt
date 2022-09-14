// RepetitionWithWhile/Task2.kt
package repetitionWithWhileExercise2

fun sum(number: Int): Int {
  var left = number
  var sum = 0
  while (left > 0) {
    sum += left
    left -= 1
  }
  return sum
}

fun main() {
  println(sum(2))  // 55
}