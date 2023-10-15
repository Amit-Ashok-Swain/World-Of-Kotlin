fun main() {

    //block of code 1
    var a = 20 // global variable

    for( i in 10 downTo 1){

        // block of code 2

        a+=1

        var b = 5 // local variable
        println(i)
    }

    println("The new value of a is $a")
}

/*
The Scope of a variable is the visibility of a particular variable within a piece of code.

The scope of a variable is only within the block inside which it is defined
 */