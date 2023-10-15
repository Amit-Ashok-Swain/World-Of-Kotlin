fun main() {
// Problem statement - print all the natural numbers from 1 to 10 using loops

    // using for loop
    for(i in 1..10){
        println(i)
    }

    // using while loop
    var idx =1
    while(idx<=10){
        println(idx)
        idx++
    }

    // using do-while
    var index = 1
    do {
        println(index)
        index++;
    }
        while (index<=10)


    // Using the 'For' Loop to Traverse through an Array

        val nameArray : Array<Char> = arrayOf<Char>('a','m','i','t')
        val wordArray : Array<String> = arrayOf<String>("My","Name","is","Amit")


         // using range(..)
        for(i in 0..nameArray.size-1){
            println("${nameArray[i]}")
        }
         // using until
        for (i in 0 until wordArray.size){
            println("${wordArray[i]}")
        }

    // Incrementing the Iterator

    // Increasing Order

    // using 'for' loop
    for(i in 1..10 step 2){
           println(i)
    }

    // using 'while' loop
    val limit1 = 10
    var j = 1
    while(j<=limit1){
        println(j)
        j+=2
    }

    // using 'do-while' loop
    val limit2 = 20
    var k = 1
    do {
        println(k)
        k+=2
    }
    while (k<=limit2)

    // Decreasing Order

    // using 'for' loop
    for(i in 20 downTo 1){
        println(i)
    }

    // using 'while' loop
    val limit3 = 1
    var a = 20
    while(a>=limit3){
        println(a)
        a-=2
    }

    // using 'do-while' loop
    val limit4 = 1
    var b = 20
    do {
        println(b)
        b-=2
    }
    while (b>=limit4)

}
