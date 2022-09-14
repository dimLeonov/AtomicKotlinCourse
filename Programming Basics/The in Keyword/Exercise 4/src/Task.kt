// InKeyword/Task4.kt
package theInKeywordExercise4

// isValidCharacter

fun isValidIdentifier(s: String): Boolean {
  if (s.isEmpty()) return false
  val startsWithLatter = s.first().isLetter() || s.first() == '_'
  val regex ="""([A-Za-z0-9\-\_]+)""".toRegex()
  return if (startsWithLatter && s.matches(regex)) true else false
}

fun main() {
  println(isValidIdentifier("name"))  // true
  println(isValidIdentifier("0name"))  // false
}