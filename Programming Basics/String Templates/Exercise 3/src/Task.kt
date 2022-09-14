// StringTemplates/Task3.kt
package stringTemplatesExercise3

fun show(i : Int, s: String, c: Char, d: Double) {
    println("i: $i")
    println("""s: "$s"""")
    println("c: '$c'")
    println("d: $d")
}

fun main() {
    show(10, "abc", 'a', 1.0)
}
/* Expected output:
i: 1
s: "abc"
c: 'd'
d: 2.0
*/