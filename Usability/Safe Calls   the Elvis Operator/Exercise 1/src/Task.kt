// SafeCallsAndElvis/Task1.kt
package safeCallsAndTheElvisOperatorExercise1
import atomictest.eq

fun downcase(str: String?) : String? {
    if (str == null) {
        return ""
    } else {
        return str.lowercase()
    }

}

fun main() {

  downcase(null) eq ""
  downcase("ABC") eq "abc"

}