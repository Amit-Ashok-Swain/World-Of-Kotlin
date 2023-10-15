package `OOP-Object-Oriented-Programming`.`OOPS-Codes`.Inheritance

class Dogs(legs: Int, color: String, var bark : Boolean? = null ?: false) : Animals(legs, color) {
    fun bark(){
        println("Dogs bark!")
    }
}