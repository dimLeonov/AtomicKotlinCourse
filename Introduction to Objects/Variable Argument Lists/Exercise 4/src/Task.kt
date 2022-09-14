// Varargs/Task4.kt
package variableArgumentListsExercise4
import atomictest.eq

fun flatten(listOfLists: List<List<String>>): List<String> {
  var resultList = ArrayList<String>()
  for (list in listOfLists) {
    for (el in list){
      resultList.add(el)
    }
  }
  return resultList
}

fun main() {
  val listOfLists = listOf(listOf("a", "b"), listOf("c", "d"))
  flatten(listOfLists) eq listOf("a", "b", "c", "d")
}