package `Coding-Practice`

/*
Create an immutable list, a mutable list, and an arraylist of the elements: “Lionel Messi”, “Wayne Rooney”, “Luka Modric”, “Eden Hazard”, “Sergio Aguero”.
Print all the above three lists.
 */

fun main() {

    val immutableList = listOf<String>("Lionel Messi", "Wayne Rooney", "Luka Modric", "Eden Hazard", "Sergio Aguero")

    val mutableList = mutableListOf<String>("Lionel Messi", "Wayne Rooney", "Luka Modric", "Eden Hazard", "Sergio Aguero")

    val arrayList = arrayListOf<String>("Lionel Messi", "Wayne Rooney", "Luka Modric", "Eden Hazard", "Sergio Aguero")

    print("$immutableList")
    println()
    print("$mutableList")
    println()
    print("$arrayList")
    println()

}
