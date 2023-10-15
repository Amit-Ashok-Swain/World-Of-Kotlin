package `OOP-Object-Oriented-Programming`.`Coding-Practice`.`2`.Inheritance.`Coding-Practice-3`

open class Car(val brandName: String, val color: String) {
    fun speedUp() {
        println("$brandName Car in $color is speeding up")
    }

    fun applyBrakes() {
        println("$brandName Car in $color is applying brakes")
    }

    open fun maxSpeed() {
        println("Maximum speed of $brandName is 100 kmph")
    }
}