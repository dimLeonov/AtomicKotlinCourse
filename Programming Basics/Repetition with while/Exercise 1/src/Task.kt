// RepetitionWithWhile/Task1.kt
package repetitionWithWhileExercise1

fun displayContent(text: String) {
    var i = 0;
    val maxLength = text.length;
    while (i < maxLength) {
        println(text[i]);
        i++
    }
}

fun main() {
displayContent("test")
}
/* Expected output:
a
b
c
*/