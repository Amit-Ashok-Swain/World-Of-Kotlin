package `Project Assignment - Final`.`Using-Interface`

fun main() {

    val myRobot = Robot("MyRobot")


    myRobot.ringAlarm("7:00 AM", listOf("Saturday", "Sunday"))
    myRobot.makeCoffee(CoffeePreferences(true, 1))
    myRobot.heatWater(40, true)
    myRobot.packBag(listOf("Math", "History", "English"))
    myRobot.cookMeals(listOf("Pancakes", "Omelette", "Cereal"), listOf("Sandwich", "Salad", "Pizza"))
    myRobot.ironClothes(listOf("Shirt", "Trousers", "Dress"))

}
