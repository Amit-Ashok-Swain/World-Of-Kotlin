package `OOP-Object-Oriented-Programming`.`Coding-Practice`.`2`.Inheritance.`Coding-Practice-1`
/*
Create a parent class Car and functions speedUp() and applyBrake().
Now create two different child classes inheriting class Car.
Also, create objects for both of the child classes and use the functions that were created inside the parent class.
 */
fun main() {
    val sportsCar = SportsCar()
    val sedan = SedanCar()

    sportsCar.speedUp(80)
    sportsCar.raceMode()


    sedan.applyBrake(30)
    sedan.ecoMode()
}

/*
open class Car{
   fun speedUp(){
       println("The car is speeding up")
   }
   fun applyBrakes(){
       println("Brakes are applied")
   }
}

class Hyundai: Car(){

}

class Honda: Car(){

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