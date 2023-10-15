package `OOP-Object-Oriented-Programming`.`OOPS-Codes`.Inheritance

class Cats(legs: Int, color: String, var purr: Boolean? = null?: false) : Animals(legs, color){

    fun purr(){
        println("Cats purr")
    }
}