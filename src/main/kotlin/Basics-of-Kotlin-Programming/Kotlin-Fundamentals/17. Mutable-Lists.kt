/*
Mutable lists are lists where elements can be added as well as altered in mutable lists.
 Syntax :
       var/val listName = mutableListOf<data_type>(list_of_items)
 */

fun main() {

    val listOfStrings = mutableListOf("Cupboard","Box", "Table", "Chair")

    listOfStrings[1] = "Bed"

    print("${listOfStrings}")

    println()

    listOfStrings.add("TV")

    print("${listOfStrings}")

    println()

    listOfStrings.add(3,"Air-Conditioner")

    print("${listOfStrings}")

    println()

    listOfStrings.removeAt(3)

    print("${listOfStrings}")

    println()

    val arr = arrayOf("Fan","Lights","Mattress")

    listOfStrings.addAll(arr)

    print("${listOfStrings}")

    println()

}

/*
ArrayList is same as mutable list
 */