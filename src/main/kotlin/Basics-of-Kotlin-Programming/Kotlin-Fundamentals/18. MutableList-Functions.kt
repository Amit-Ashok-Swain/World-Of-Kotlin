package `Kotlin-Fundamentals`

fun main() {

    //add(element: E): This function is used to add an element to the end of the list.

    val numbers = mutableListOf(1,2,3)
    numbers.add(4) // Adds 4 to the list

    print("$numbers")

    println()

    //add(index: Int, element: E): You can use this function to insert an element at a specific index in the list.

    val fruits = mutableListOf("Apple","Banana","Orange")
    fruits.add(1,"Mango") // Inserts "Mango" at index 1

    print("$fruits")

    println()

    //remove(element: E): It removes the first occurrence of the specified element from the list.

    val colors = mutableListOf( "Green", "Red", "Blue", "Orange")
    colors.remove("Green") // Removes the first occurrence of "Green"

    print("$colors")

    println()

    //removeAt(index: Int): This function removes the element at a specific index.removeAt(index: Int): This function removes the element at a specific index.

    val names = mutableListOf("Alice", "Bob", "Charlie")
    names.removeAt(1) // Removes "Bob" at index 1

    print("$names")

    println()

    //addAll(elements: Collection<E>): You can use this function to add all elements from a collection to the end of the list.

    val listOfNumbers = mutableListOf(1, 2, 3)
    listOfNumbers.addAll(listOf(4, 5, 6)) // Adds elements 4, 5, 6 to the list

    print("$listOfNumbers")

    println()

    //addAll(index: Int, elements: Collection<E>): It inserts all elements from a collection at a specific index in the list.

    val listOfFruits = mutableListOf("Apple","Banana")
    listOfFruits.addAll(1, listOf("Mango","Orange")) // Inserts "Mango" and "Orange" at index 1

    print("$listOfFruits")

    println()

    //clear(): This function removes all elements from the list, making it empty.

    val items = mutableListOf("Item 1", "Item 2", "Item 3")
    items.clear() // Removes all elements, making the list empty

    print("$items")

    println()

    //set(index: Int, element: E): It updates the element at a specific index.

    val listOfColors = mutableListOf("Red","Green","Blue","Orange","White","Grey")
    listOfColors[1] = "Yellow" // Updates the element at index 1 to "Yellow"
    listOfColors.set(5,"Black")
    print("$listOfColors")

    println()

    //sort(): This function sorts the list in ascending order.

    val listOfUnsortedNumbers = mutableListOf(5, 2, 4, 1, 3)
    listOfUnsortedNumbers.sort() // Sorts the list to [1, 2, 3, 4, 5]

    print("$listOfUnsortedNumbers")

    println()

    //reverse(): It reverses the order of elements in the list.

    val listOfNames = mutableListOf("Alice", "Bob", "Charlie")
    listOfNames.reverse() // Reverses the list to ["Charlie", "Bob", "Alice"]

    print("$listOfNames")

    println()

    //removeAll(elements: Collection<E>): This function removes all occurrences of elements from the list that are present in the given collection.

    val listOfDuplicateNumbers = mutableListOf(1,2,3,2,4)
    listOfDuplicateNumbers.removeAll(listOf(2,3)) // Removes all 2s and 3s from the list

    print("$listOfDuplicateNumbers")

    println()

    //retainAll(elements: Collection<E>): It retains only the elements in the list that are also present in the given collection, removing the rest.

    val colorsList = mutableListOf("Red", "Green", "Blue", "Red")
    colorsList.retainAll(listOf("Red", "Blue")) // Retains only "Red" and "Blue"

    print("$colorsList")

    println()

    //removeIf(predicate: (E) -> Boolean): This function removes all elements from the list that satisfy the given predicate.

    val numbersList = mutableListOf(1, 2, 3, 4, 5)
    numbersList.removeIf { it % 2 == 0 } // Removes all even numbers

    print("$numbersList")

    println()


    //shuffle(): This function shuffles the elements in the list, randomly reordering them.

    val cards = mutableListOf("Ace", "King", "Queen", "Jack")
    cards.shuffle() // Shuffles the order of the cards

    print("$cards")

    println()

    //replaceAll(oldElement: E, newElement: E): It replaces all occurrences of the old element with the new element.

    val duplicateColors = mutableListOf("Red", "Green", "Red", "Blue")
    duplicateColors.replaceAll { if (it == "Red") "Yellow" else it } // Replaces all "Red" with "Yellow"

    print("$duplicateColors")

    println()

    // removeAll { it -> ... }: This function allows you to remove elements based on a condition provided in the lambda expression.

    val listOfItems = mutableListOf("Items 1", "Items 2", "Item 3")
    listOfItems.removeAll { it.startsWith("Items") } // Removes items starting with "Item"

     print("$listOfItems")
    println()
}