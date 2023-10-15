package `OOP-Object-Oriented-Programming`.`Coding-Practice`.`2`.Inheritance.`Coding-Practice-3`
/*
In the previous example, create an open function maxSpeed() in the parent class Car.
Now override this function in the child classes and print the message as
“Maximum speed of Hyundai is 120 kmph” and “Maximum speed of Honda is 150 kmph”.
 */

fun main() {
    val hyundai = Hyundai()
    hyundai.speedUp()
    hyundai.applyBrakes()
    hyundai.maxSpeed()

    val honda = Honda()
    honda.speedUp()
    honda.applyBrakes()
    honda.maxSpeed()
}

/*
open class Car(val brandName: String, val color: String) {

   fun speedUp() {
       println("The car is speeding up")
   }

   fun applyBrakes() {
       println("Brakes are applied")
   }

   open fun maxSpeed(){
       println("I can tell the max speed")
   }
}

class Hyundai(brandName: String = "Hyundai", color: String = "Black") : Car(brandName, color) {
   override fun maxSpeed() {
       println("Maximum speed of Hyundai is 120 kmph")
   }
}

class Honda(brandName: String = "Honda", color: String = "White") : Car(brandName, color) {
   override fun maxSpeed() {
       println("Maximum speed of Honda is 150 kmph")
   }
}

fun main(){
   val hyundai = Hyundai()
   hyundai.maxSpeed()

   val honda = Honda()
   honda.maxSpeed()
}
 */
