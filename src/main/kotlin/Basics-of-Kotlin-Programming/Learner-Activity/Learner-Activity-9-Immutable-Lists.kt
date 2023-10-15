package `Learner-Activity`

fun main() {

    // get function
    val myList = listOf("Apple", "Banana", "Orange")

    val element1 = myList.get(1)
    val element2 = myList[0]

    println(element1)
    println(element2)

    // indexOf function
    val index = myList.indexOf("Orange")

    println(index)

    val myList1 = listOf("Apple", "Banana", "Orange", "Banana", "Papaya")

    // lastIndexOf function
     val lastIndex = myList1.lastIndexOf("Banana")

    println(lastIndex)

    val myNumList = listOf(1,2,3,4,5,6,7,8,9,10,25,22,48,98)

    //subList function - This function creates a new list containing elements from fromIndex (inclusive) to toIndex (exclusive) of the original list.
    val subList = myNumList.subList(2,8) // it prints till (8-1)th index

    println(subList)

    //contains function
    val containsBanana = myList.contains("Banana") // returns true or false

    println(containsBanana)

    // size function
    val size = myList.size

    println(size)

    //isEmpty function

    // check for empty
    val stringList = listOf<String>()
    val isEmpty = stringList.isEmpty()

    // check for non-empty
    val stringList1 = listOf<String>("My","Name","is","Amit")
    val isEmpty1 = stringList1.isEmpty()

    println(isEmpty)
    println(isEmpty1)

    // distinct function -  It returns a new list with duplicate elements removed.
    val myDistinctList = myList1.distinct()

    println(myDistinctList) // returns all the unique elements in the list

    //min and max function
    val numbersList = listOf(3, 1, 4, 1, 5, 9, 2, 6, 5)

    val min = numbersList.min() // returns minimum of list

    val max = numbersList.max() // returns maximum of list

    println(min)
    println(max)

    // first and last function
    val firstElement = myList.first() // returns first element in list
    val lastElement = myList.last() // returns last element in list

    println(firstElement)
    println(lastElement)

    // drop function
    val myNewNumList = myNumList.drop(3) // drops first 3 elements from list

    println(myNewNumList)

    //filter function (predicate: (T) -> Boolean) - It returns a new list containing only the elements that satisfy the given predicate.
    val evenNumbers = myNumList.filter { it % 2 ==0 }
    val oddNumbers = myNumList.filter { it %2 !=0 }

    println(evenNumbers)
    println(oddNumbers)

    // map function (transform: (T) -> R) -  This function creates a new list by applying the provided transformation function to each element of the original list.
    val lengthsOfMyList = myList.map { it.length }

    println(lengthsOfMyList)

    // sorted function - It returns a new list with elements sorted in their natural order.
    val myUnsortedList = listOf(3,1,4,1,5,9,2,6,5)

    val sortedList = myUnsortedList.sorted()

    // joinToString function - This function converts a list to a string with elements separated by a specified delimiter.
    val separatedByCommas = myList.joinToString(separator = " - ")

    println(separatedByCommas)

    // all and any function predicate: (T) -> Boolean) - These functions check if all or any elements in the list satisfy a given predicate and return a Boolean result.

    val allEven = myNumList.all { it % 2 == 0 } // checks all the numbers in the list are even and returns true or false

    val anyEven = myNumList.any { it % 2 == 0} // checks whether any the numbers in the list are even and returns true or false

    println(allEven)
    println(anyEven)
}