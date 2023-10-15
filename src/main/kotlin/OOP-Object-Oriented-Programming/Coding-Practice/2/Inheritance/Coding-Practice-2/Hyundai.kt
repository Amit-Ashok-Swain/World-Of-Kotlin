package `OOP-Object-Oriented-Programming`.`Coding-Practice`.`2`.Inheritance.`Coding-Practice-2`

// Child class 1
class Hyundai : Car("Hyundai", "Blue") {
    fun ecoMode() {
        applyBrake(20) // Hyundais have an eco mode that applies brakes gently
        println("$brandName Car is in eco mode.")
    }
}