package `OOP-Object-Oriented-Programming`.`OOPS-Codes`.`2`.Inheritance.`2`.`Overriding-Methods`.`Example-1`

class Dogs(legs: Int, color: String, var barks : Boolean?=null ?: false, var smells : Boolean?=null ?: false, var name : String? = null ?: "Name Not Available") : Animals(legs, color) {

    override fun eat(){
        println("$name eats pedigree")
    }

    override fun sleep(){
        println("$name sleeps on mat")
    }

    override fun classificationMessage(){
        println("This is Dog's Category : ")
    }

    override fun sound() {
        when (barks) {
            true -> println("$name barks looking at strangers")
            else -> println("$name doesn't barks looking at strangers")
        }
    }

    fun smells(){
        when(smells){
            true -> println("$name smells the peoples")
            else -> println("$name doesn't smells the peoples")
        }
    }

}