// NullableTypes/Task2.kt
package nullableTypesExercise2

 fun zilch() : String? {
     return null
 }

fun zilich2() : String? {
    return zilch()
}

fun main() {
   var x = zilch()
   var y = zilich2()
}