// Varargs/Task2.kt
package variableArgumentListsExercise2

fun printArgs(firstParam:String, vararg ints:Int) {
    println("$firstParam${ints.joinToString(", ", "[", "]")}" )
}

fun main() {
  printArgs("Numbers: ", 1, 2, 3)
}
/* Expected output:
Numbers: [1, 2, 3]
 */