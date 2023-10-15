package `Coding-Practice`
/*
Check whether a number (given number = 100), is greater than or equal to 100,
less than 100 and greater than 50,
or less than or equal to 50.
 */
fun main() {

    //if-else ladder
    val num = 100
    if(num>=100){
        println("Number is greater than or equal to 100")
    }else if (num>50 && num<100){
        println("Number is less than 100 and greater than 50")
    }else if(num<=50){
        println("Number is less than or equal to 50")
    }else{
        println("Not in range")
    }


    // Using 'in' statement

    if(num>=100){
        println("Number is greater than or equal to 100")
    }else if(num in 51..99){
        println("Number is less than 100 and greater than 50")
    }else if(num<=50){
        println("Number is less than or equal to 50")
    }else{
        println("Not in range")
    }
}