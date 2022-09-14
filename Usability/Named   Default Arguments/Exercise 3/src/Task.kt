// NamedAndDefaultArgs/Task3.kt
package namedAndDefaultArgumentsExercise3
import atomictest.eq
import java.util.StringJoiner

fun joinComments(s: String): String =
  s.trimMargin("// ").lines().joinToString("; ")

fun main() {
  val s = """
        // First
        // Second
        // Third
        """
  joinComments(s) eq "First; Second; Third"
}