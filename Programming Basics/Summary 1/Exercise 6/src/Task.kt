// Summary1/Task6.kt
package summaryIExercise6

fun String.removeWhitespaces() = replace(" ", "")

fun everyFifthNonSpace(s: String) {
  val trimStr = s.removeWhitespaces()
  for (i in 1 .. trimStr.length) {
    if (i  % 5 == 0) {
      println(trimStr[i-1])
    }
  }
}

fun main() {
  everyFifthNonSpace("abc d e fgh ik")
}
/* Output:
e
k
*/