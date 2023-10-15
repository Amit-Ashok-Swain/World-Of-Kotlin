package `OOP-Object-Oriented-Programming`.`OOPS-Codes`.`3`.Interface

class CallMe : MyInterface, NewInterface{

    override fun hello() {
        println("Function hello is called here")
    }

    override fun greeting() {
        super.greeting()
        println("New greeting can be given here")
    }

    override fun newMethod() {
        println("Function of new Interface")
    }
}