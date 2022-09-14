// Packages/EquilateralTriangle.kt
package pythagorean


class EquilateralTriangle(val side: Double) {
    fun area() = Math.sqrt(3.0) / 4 * side * side
}