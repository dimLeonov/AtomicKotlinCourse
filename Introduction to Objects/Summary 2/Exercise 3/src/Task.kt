// Summary2/Task3.kt
package summaryIIExercise3
import atomictest.*
import varargs.v

class FixedSizeHolder(val num: Int) {
    val list = ArrayList<Any>()
    val full: Boolean
        get() {
            return list.size == num
        }

    val size = num

    fun add(value: Any) {
        if (full) {

            throw IllegalStateException("The container is full")
        }
        list.add(value)
    }
}

fun main() {

  val holder = FixedSizeHolder(2)
  holder.add("What is the answer?")
  holder.add(42)
  holder.full eq true
  holder.size eq 2
  capture {
    holder.add("!!!")
  } eq "IllegalStateException: The container is full"

}