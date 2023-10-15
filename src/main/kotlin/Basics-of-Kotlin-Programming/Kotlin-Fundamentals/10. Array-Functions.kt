fun main() {

    // size
    val numbers : IntArray = intArrayOf(1,2,3,4,5)
    val size = numbers.size

    println(size)

    // get
    val fruits = arrayOf("Apple","Banana", "Orange")
    val element = fruits[1]

    println(element)

    // set
    val unsetNumbers = arrayOf(6,7,8,9,10)
    unsetNumbers[2] = 14

    for(i in unsetNumbers){
        print("$i ")
    }
    println()

    // toList function
    val arr : IntArray = intArrayOf(11,12,13,14,15)
    val integerList = arr.toList()

    println(integerList)

    //copyOf function - This function creates a new array of the specified size, copying elements from the original array. It is often used to resize arrays.

    val originalArray = intArrayOf(1,2,3,4,5)
    val newArray = originalArray.copyOf(7)

    for (i in newArray){
        print("$i ")
    }
    println()

    // copyOfRange function - It creates a new array by copying a range of elements from the original array.

    val newArrayRange = originalArray.copyOfRange(1,4) // copy from range 1st index till (4-1)th index

    for (i in newArrayRange){
        print("$i ")
    }
    println()

    //sliceArray function - This function returns a new array containing elements at the specified indices.
    val subArray = originalArray.sliceArray(1..3)

    for (i in subArray){
        print("$i ")
    }
     println()

    //filter(predicate: (T) -> Boolean): It creates a new array containing only the elements that satisfy the given predicate.

    val evenNumbers = originalArray.filter{ it%2 == 0}

    for (i in evenNumbers){
        print("$i ")
    }
    println()

  //forEach(action: (T) -> Unit): This function iterates through the array and performs the given action on each element.

    originalArray.forEach { print("$it ") }

    println()

    // sort(): It sorts the array in ascending order.

    val unsortedArray : IntArray = intArrayOf(5, 2, 4, 1, 3, 9 ,6, 8, 7, 10)
    unsortedArray.sort()
    for (i in unsortedArray)
    print("$i ")

    println()

    // joinToString(): This function converts an array to a string with elements separated by a specified delimiter.

    val fruitArray = arrayOf("Apple","Banana","Coconut","Orange","Papaya","Dragon-Fruit","Kiwi","Avocado")

    val resultFruitArray = fruitArray.joinToString(separator = "-")

    for (i in resultFruitArray){
        print("$i")
    }
    println()
    for (i in resultFruitArray){
        print("$i ")
    }
    println()

    // distinct(): It returns a new array with duplicate elements removed.

    val duplicateArray = intArrayOf(1, 2, 2, 3, 4, 4, 4, 5)

    val distinctArray = duplicateArray.distinct()

    for (i in distinctArray){
        print("$i ")
    }
    println()

    //any(predicate: (T) -> Boolean) and all(predicate: (T) -> Boolean): These functions check if any or all elements in the array satisfy a given predicate and return a Boolean result.

    val hasEven = originalArray.any { it % 2 == 0 } // Returns true
    val allEven = originalArray.all { it % 2 == 0 } // Returns false

    println(hasEven)
    println(allEven)

    //contains(element: T): It checks whether the array contains a specific element and returns a Boolean result.

    val containsBanana = "Banana" in fruitArray

    val containsPapaya = fruitArray.contains("Papaya")

    val containsPineapple = fruitArray.contains("Pineapple")

    println(containsBanana)
    println(containsPapaya)
    println(containsPineapple)

    //indexOf(element: T) and lastIndexOf(element: T): These functions return the index of the first and last occurrence of the specified element in the array, or -1 if the element is not found.

    val numberingArray = intArrayOf(1, 2, 3, 2, 4)
    val firstIndex = numbers.indexOf(2) // Returns 1
    val lastIndex = numbers.lastIndexOf(2) // Returns 3

    println(firstIndex)
    println(lastIndex)

    //drop(n: Int): This function returns a new array with the first n elements removed.

    val newUpdatedArray = originalArray.drop(2) // Creates a new array [3, 4, 5]

    for (i in newUpdatedArray){
        println("$i ")
    }
    println()
    
}