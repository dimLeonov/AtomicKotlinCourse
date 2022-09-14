// LoopingAndRanges/Task4.kt
package loopingAndRangesExercise4

fun showHalfTriangle(n: Int) {
  for (i in 1 .. n) {
    println("#".repeat(i))
  }
}

fun main() {
  showHalfTriangle(4)
}
/* Output:
#
##
###
####
*/