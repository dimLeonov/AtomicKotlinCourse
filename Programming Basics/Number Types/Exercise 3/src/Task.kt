// NumberTypes/Task3.kt
package numberTypesExercise3


fun convertFahrenheitToCelsius(f: Int): Double {
  val result = ((f - 32) * (5f / 9f)).toDouble()
  return result
}

fun convertCelsiusToFahrenheit(c: Int): Double {
    val result = (c * (9f / 5f) + 32).toDouble();
    return result
}
fun main() {
  println(convertFahrenheitToCelsius(68)) // 20.0
  println(convertCelsiusToFahrenheit(20)) // 68.0
}