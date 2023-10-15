package `OOP-Object-Oriented-Programming`.`Coding-Practice`.`3`.Interface

// Create a class that implements the interface and overrides the functions
class Sports : Games {
    override fun football() {
        println("Playing football")
    }

    override fun cricket() {
        println("Playing cricket")
    }

    override fun basketball() {
        println("Playing basketball")
    }
}