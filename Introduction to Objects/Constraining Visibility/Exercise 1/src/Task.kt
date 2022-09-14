// Visibility/Task1.kt
package constrainingVisibilityExercise1

class Alien(val name: String, val species: String, private var planet: String) {

    fun movePlanet(planet: String) {
        this.planet = planet
    }

    override fun toString(): String {
        return "Alien $name, $species: $planet"
    }
}

fun main() {
    val allien = Alien("Alien Arthricia", "Cat Person", "PurgePlanet")
    val allien2 = Alien("Alien Arthricia", "Cat Person", "PurgePlanet")
    allien.movePlanet("Gearworld")
    allien2.movePlanet("Parblesnops")
    println(allien)
    println(allien2)
}
/* Expected output:
Alien Arthricia, Cat Person: PurgePlanet
Alien Arthricia, Cat Person: Earth C-137
Alien Dale, Giant: Gearworld
Alien Dale, Giant: Parblesnops
*/