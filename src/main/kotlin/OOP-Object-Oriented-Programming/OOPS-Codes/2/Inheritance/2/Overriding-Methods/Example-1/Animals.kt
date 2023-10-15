package `OOP-Object-Oriented-Programming`.`OOPS-Codes`.`2`.Inheritance.`2`.`Overriding-Methods`.`Example-1`

open class Animals(var legs: Int? = null ?: 0, var color: String? = null?:"Color Not Available") {

    fun welcomeMessage(){
        println("Welcome to Animals Zone!")
    }

    open fun classificationMessage(){
        println(" This is Animal Category : ")
    }

    open fun eat(){
        println("Animals eat food")
    }

    open fun sleep(){
        println("Animals sleep")
    }

    open fun sound(){
        println("Animals make sound")
    }

    fun thankYouMessage(){
        println("Thank you for visiting Animals Zone. Have a great day!")
    }
}