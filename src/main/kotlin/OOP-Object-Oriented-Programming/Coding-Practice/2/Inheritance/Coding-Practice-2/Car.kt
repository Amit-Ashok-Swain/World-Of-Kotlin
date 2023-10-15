package `OOP-Object-Oriented-Programming`.`Coding-Practice`.`2`.Inheritance.`Coding-Practice-2`

// Parent class
open class Car(val brandName: String, val color: String) {
    var speed = 0

    fun speedUp(increment: Int) {
        speed += increment
        println("$brandName Car is speeding up by $increment. Current speed: $speed km/h")
    }

    fun applyBrake(decrement: Int) {
        speed -= decrement
        println("$brandName Car is applying brake, slowing down by $decrement. Current speed: $speed km/h")
    }
}