// Properties/Task1.kt
package propertiesExercise1

class X {
    val a: Int = 3
    val b: Int = 42
    var c: Int = 0

    fun add() : Int {
        this.c = a+b
        return this.c
    }
}

fun main() {
    val xtest = X()
    xtest.add()
    print(xtest.c)
}