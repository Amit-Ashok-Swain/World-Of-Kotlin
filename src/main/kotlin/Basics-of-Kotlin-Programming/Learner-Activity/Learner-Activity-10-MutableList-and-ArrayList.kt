package `Learner-Activity`

/*
Under the covers, both mutableListOf() and arrayListOf() create an instance of ArrayList. ArrayList is a class that happens to implement the MutableList interface.

The only difference is that arrayListOf() returns the ArrayList as an actual ArrayList. mutableListOf() returns a MutableList, so the actual ArrayList is "disguised" as just the parts that are described by the MutableList interface.

The difference, in practice, is that ArrayList has a few methods that are not part of the MutableList interface (trimToSize and ensureCapacity).

The difference, philosophically, is that the MutableList only cares about the "behavior" of the object being returned. It just returns "something that acts like a MutableList". The ArrayList cares about the "structure" of the object. It allows you to directly manipulate the memory allocated by the object (trimToSize).

The rule of thumb is that you should prefer the interface version of things (mutableListOf()) unless you actually have a reason to care about the exact details of the underlying structure.

Or, in other words, if you don't know which one you want, choose mutableListOf first.
 */

/*
The only difference between the two is communicating your intent.

When you write val a = mutableListOf(), you're saying "I want a mutable list, and I don't particularly care about the implementation". When you write, instead, val a = ArrayList(), you're saying "I specifically want an ArrayList".

In practice, in the current implementation of Kotlin compiling to the JVM, calling mutableListOf will produce an ArrayList, and there's no difference in behaviour: once the list is built, everything will behave the same.

Now, let's say that a future version of Kotlin changes mutableListOf to return a different type of list.

Likelier than not, the Kotlin team would only make that change if they figure the new implementation works better for most use cases. mutableListOf would then have you using that new list implementation transparently, and you'd get that better behaviour for free. Go with mutableListOf if that sounds like your case.

On the other hand, maybe you spent a bunch of time thinking about your problem, and figured that ArrayList really is the best fit for your problem, and you don't want to risk getting moved to something sub-optimal. Then you probably want to either use ArrayList directly, or use the arrayListOf factory function (an ArrayList-specific analogue to mutableListOf).
 */

/*
mutableListOf<T>() is an inline function invocation that returns a MutableList<T>. As of today, mutableListOf does return an instance of ArrayList.

ArrayList<String>() is a constructor invocation and cannot be inlined.

In other words, given:

 val a = mutableListOf<String>()
 val b = ArrayList<String>()
a is of type MutableList<String>
b is of type ArrayList<String>
At runtime, both a and b will hold an instance of ArrayList.

Note that inlining is particularly useful when combined with type reification, which justifies the existence of listOf, mutableListOf and the like.
 */
/*
1. ArrayList<T>()
We can create an ArrayList implementation of the mutable list simply by using a constructor:

val arrayList = ArrayList<String>()
arrayList.add("Kotlin")
arrayList.add("Java")

This is Kotlin’s implementation of dynamic arrays.

2. mutableListOf<T>()
We can also create a mutable list by using a dedicated method:

val mutableList = mutableListOf<String>()
mutableList.add("Kotlin")
mutableList.add("Java")

Let’s peek at the current (Kotlin 1.4.10) implementation of the mutableListOf<T>() method:

/*
 * Returns an empty new [MutableList].
 * @sample samples.collections.Collections.Lists.emptyMutableList
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public inline fun <T> mutableListOf(): MutableList<T> = ArrayList()

As we can see, it simply returns an instance of ArrayList<T>(), which is the default implementation of List. So the implementation details of the mutable list have been abstracted away for us.

3. Conclusion
In this quick article, we saw two ways to create a mutable list in Kotlin.

Our first approach explicitly creates an instance of a particular class by calling its constructor — ArrayList<T>().

In the second approach, we just want a mutable list and don’t really care about the implementation, and therefore, we can’t make any assumptions about the actual implementation used under-the-hood.

However, as we noted, both approaches have the same result in the current version of Kotlin, as both will create an ArrayList.
*/
/*
List and array are two popular collections supported by Kotlin. By definition, both these collections allocate sequential memory location. In this article, we will take an example to demonstrate the difference between these two types of collections.

1. Array:

Attribute -

a. Implementation - Array is implemented using Array<T> class
b. Mutable - Array<T> is mutable, i.e., the values can be changed.
c. Size - Array is of fixed size. It cannot increase and decrease in size.
d. Performance - 	Use it for better performance, as array is optimized for different primitive data types such as IntArray[], DoubleArray[].

2. List

Attribute -

a. Implementation - List<T> or MutableList<T> interfaces are used to implement a List in Kotlin
b. Mutable - List<T> is immutable in nature. In order to create a mutable list, MutableList<T> interface needs to be used.
c. Size - MutableList<T> do have 'add' and 'remove' functions in order to increase or decrease the size of the MutableList.
d. Performance - Use it for better accessibility in the code. As the size is dynamic in nature, hence good memory management.

*/
fun main(args: Array<String>) {

    val a = arrayOf(1, 2, 3)

    // Printing all the values of array a
    println("The Array contains:")
    a.forEach{
        println(it)
    }


    val names = listOf("stud1", "stud2", "stud3")

    // Printing all the values of list names
    println("The List contains: ")
    names.forEach {
        println(it)
    }


    var days: MutableList<String> = mutableListOf(
        "Monday", "Tuesday", "Wednesday",
        "Thursday", "Friday", "Saturday", "Sunday"
    )

    // Printing all the values of MutableList list
    println("Given Mutable List contains:")
    days.forEach{
        print(it)
    }

    println("Mutable List after modification:")
    days.forEach{
        print(it + ", ")
    }

}