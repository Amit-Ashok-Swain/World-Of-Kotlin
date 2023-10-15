package `Coding-Practice`
/*
Given a list = [1, null, 2, 4, null, 6, 8, 10, null].
Insert the number 12 to the number at index 7 and
then print out the complete list without any exceptions or null values in the output.
 */
fun main() {
  val list = arrayListOf(1, null, 2, 4, null, 6, 8, 10, null)
    list[7] = 12
    print(list.filterNotNull())
}