package `Kotlin-Fundamentals`
/*
Syntax : var/val listName = arrayListOf<data_type>(list_of_items)
 */
fun main() {

    //add(element: E): This function is used to add an element to the end of the ArrayList.
    val colors = ArrayList<String>()
    colors.add("Red")
    colors.add("Green")
    print("$colors")
    println()

    //add(index: Int, element: E): You can use this function to insert an element at a specific index in the ArrayList.
    val fruits = ArrayList<String>()
    fruits.add(0, "Apple")
    fruits.add(1, "Banana")
    print("$fruits")
    println()

    //remove(element: E): It removes the first occurrence of the specified element from the ArrayList.
    colors.add("Orange")
    colors.add("White")
    colors.remove("Green")
    print("$colors")
    println()

    //removeAt(index: Int): This function removes the element at a specific index.
    val numbers = ArrayList<Int>()
    numbers.add(1)
    numbers.add(2)
    numbers.add(3)
    numbers.add(4)
    numbers.add(5)
    numbers.removeAt(4)
    numbers.remove(2)
    print("$numbers")
    println()


    //addAll(elements: Collection<E>): You can use this function to add all elements from a collection to the end of the ArrayList.

    val listOfNumbers = ArrayList<Int>()
    listOfNumbers.addAll(listOf(1, 2, 3))
    print("$listOfNumbers")
    println()

    //addAll(index: Int, elements: Collection<E>): It inserts all elements from a collection at a specific index in the ArrayList.

    val listOfFruits = ArrayList<String>()
    listOfFruits.addAll(0, listOf("Apple", "Banana"))
    print("$listOfFruits")
    println()

    //clear(): This function removes all elements from the ArrayList, making it empty.

    val items = ArrayList<String>()
    items.add("Item 1")
    items.add("Item 2")
    items.clear()
    print("$items")
    println()

    //set(index: Int, element: E): It updates the element at a specific index.

    val listOfColors = ArrayList<String>()
    listOfColors.add("Red")
    listOfColors.add("Green")
    listOfColors.set(1, "Blue")
    print("$listOfColors")
    println()


    // sort(): This function sorts the ArrayList in ascending order.
    numbers.add(5)
    numbers.add(2)
    numbers.sort()
    print("$numbers")
    println()

    //reverse(): It reverses the order of elements in the ArrayList.
    val names = ArrayList<String>()
    names.add("Alice")
    names.add("Bob")
    names.reverse()
    print("$names")
    println()

    //retainAll(elements: Collection<E>): It retains only the elements in the ArrayList that are also present in the given collection, removing the rest.
    colors.add("Black")
    colors.add("Orange")
    colors.add("Blue")
    colors.retainAll(listOf("Red", "Blue")) // Retains only "Red"
    print("$colors")
    println()

    //removeIf(predicate: (E) -> Boolean): This function removes all elements from the ArrayList that satisfy the given predicate.
    numbers.addAll(listOf(1, 2, 3, 4, 5))
    numbers.removeIf { it % 2 == 0 } // Removes all even numbers
    print("$numbers")
    println()


    //shuffle(): This function shuffles the elements in the ArrayList, randomly reordering them.
    val cards = ArrayList<String>()
    cards.addAll(listOf("Ace", "King", "Queen", "Jack"))
    cards.shuffle() // Shuffles the order of the cards
    print("$cards")
    println()

    //replaceAll(transform: (E) -> E): It applies the provided transformation function to each element in the ArrayList, replacing each element with the result of the transformation
    numbers.addAll(listOf(1, 2, 3, 4, 5))
    numbers.replaceAll { it * 2 } // Doubles each element
    print("$numbers")
    println()

    //subList(fromIndex: Int, toIndex: Int): This function creates a new ArrayList containing elements from fromIndex (inclusive) to toIndex (exclusive) of the original ArrayList.
    val originalList = ArrayList<Int>()
    originalList.addAll(listOf(1, 2, 3, 4, 5))
    val subList = originalList.subList(1, 4) // Creates a new ArrayList [2, 3, 4]
    print("$originalList")
    println()


}