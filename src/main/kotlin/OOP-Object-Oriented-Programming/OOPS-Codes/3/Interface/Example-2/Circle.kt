package `OOP-Object-Oriented-Programming`.`OOPS-Codes`.`3`.Interface.`Example-2`

// Create a class that implements the interface
class Circle(private val radius: Double) : Shape {
    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun perimeter(): Double {
        return 2 * Math.PI * radius
    }
}