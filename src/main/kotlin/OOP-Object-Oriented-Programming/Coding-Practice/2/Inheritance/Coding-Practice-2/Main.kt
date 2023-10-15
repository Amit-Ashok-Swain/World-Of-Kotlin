package `OOP-Object-Oriented-Programming`.`Coding-Practice`.`2`.Inheritance.`Coding-Practice-2`
/*
In the previous class Car give the properties as brandName and color.
Initialise the brandName as Hyundai and Honda for the respective classes.
 */
fun main() {
    val hyundaiCar = Hyundai()
    val hondaCar = Honda()

    hyundaiCar.speedUp(80)
    hondaCar.applyBrake(30)

    hyundaiCar.ecoMode()
    hondaCar.sportMode()
}
/*
open class Car(val brandName: String, val color: String) {

   fun speedUp() {
       println("The car is speeding up")
   }

   fun applyBrakes() {
       println("Brakes are applied")
   }
}

class Hyundai(brandName: String = "Hyundai", color: String = "Black") : Car(brandName, color) {

}

class Honda(brandName: String = "Honda", color: String = "White") : Car(brandName, color) {

}

fun main(){
   val hyundai = Hyundai()
   hyundai.speedUp()
   hyundai.applyBrakes()

   val honda = Honda()
   honda.speedUp()
   honda.applyBrakes()
}
 */