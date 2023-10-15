package `Coding-Practice`

/*
 Compare the length of two strings, a = “Internshala” and b = “Trainings”
 and print “Length is same” if it is same
 and print “Length is different” if it is different.
 */

fun main() {
    val a = "Internshala"
    val b = "Trainings"
    // if-else and logical operator
    if(a.length == b.length){
        println("Length is same")
    }else{
        println("Length is different")
    }
    // if-else using string 'equals' functions
    if(a.length.equals(b.length)){
        println("Length is same")
    }else{
        println("Length is different")
    }
   // Using when
    when{
        a.length==b.length ->  println("Length is same")
    else ->  println("Length is different")
    }

    when{
        a.length.equals(b.length) ->  println("Length is same")
        else ->  println("Length is different")
    }

    when(a.length==b.length){
        true-> println("Length is same")
        else -> println("Length is different")
    }

    when(a.length.equals(b.length)){
        true-> println("Length is same")
        else -> println("Length is different")
    }
}