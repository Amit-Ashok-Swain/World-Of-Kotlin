package `OOP-Object-Oriented-Programming`.`OOPS-Codes`.`2`.Inheritance.`2`.`Overriding-Methods`.`Example-1`

class Cats(legs: Int, color : String, var purrs : Boolean? = null ?: false, var name : String? = null ?: "Name Not Available") : Animals(legs, color) {

    override fun eat(){
        println("$name eat pet food")
    }

    override fun sleep(){
        println("$name sleeps on cat-bed")
    }

    override fun classificationMessage(){
        println("This is Cat's Category : ")
    }

    override fun sound(){
        if(purrs==true){
            println("$name purrs")
        }else{
            println("$name doesn't purrs")
        }
    }
}