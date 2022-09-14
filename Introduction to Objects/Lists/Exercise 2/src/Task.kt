// Lists/Task2.kt
package listsExercise2

import java.util.Collections

fun countOccurrences(list: IntList, number: Int): Int {
  var occurance = 0;

  for (i in list) {
    if (number == i) {
      occurance++
    }
  }
  return occurance
}

fun main() {
  val list = IntList(listOf(1, 2, 3, 2))
  println(countOccurrences(list, 2))  // 2
}