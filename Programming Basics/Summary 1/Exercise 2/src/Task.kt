// Summary1/Task2.kt
package summaryIExercise2

fun other(s: String): String {
  var res = ""
  var ind = 0
  while (ind < s.length) {
    res += s[ind];
    ind += 2
  }
  return res
}

fun main() {
  println(other("cement"))
}
/* Output:
cmn
*/