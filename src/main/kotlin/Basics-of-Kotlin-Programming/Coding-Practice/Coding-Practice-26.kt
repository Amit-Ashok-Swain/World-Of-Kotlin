package `Coding-Practice`

/*
In the mutable version of the list in the previous question add the string: “Harry Kane”.
From the modified list remove the string: “Wayne Rooney”.
Now in this list add the string: “Neymar Jr.” at index 1.
Now print the modified mutable list.
 */

fun main() {

val mutableList = mutableListOf<String>("Lionel Messi", "Wayne Rooney", "Luka Modric", "Eden Hazard", "Sergio Aguero")

    print("$mutableList")
    println()

    mutableList.add("Harry Kane")
    mutableList.remove("Wayne Rooney")
    mutableList.add(1,"Neymar Jr.")

    print("$mutableList")

}