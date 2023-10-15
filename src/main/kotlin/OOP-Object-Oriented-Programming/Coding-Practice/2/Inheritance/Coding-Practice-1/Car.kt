package `OOP-Object-Oriented-Programming`.`Coding-Practice`.`2`.Inheritance.`Coding-Practice-1`

// Parent class
open class Car {
    var speed = 0

    fun speedUp(increment: Int) {
        speed += increment
        println("Speeding up by $increment. Current speed: $speed km/h")
    }

    fun applyBrake(decrement: Int) {
        speed -= decrement
        println("Applying brake, slowing down by $decrement. Current speed: $speed km/h")
    }
}