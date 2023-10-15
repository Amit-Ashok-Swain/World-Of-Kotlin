package `Project Assignment - Final`.`Using-Advance-Concepts`.`Project-2`


fun main() {
    val myRobot = Robot("MorningRobot")

    // Set alarm
    myRobot.ringAlarm("7:00 AM", listOf("Saturday", "Sunday"))

    // Make coffee
    val coffeePreferences = Coffee("Black", 2)
    myRobot.makeCoffee(coffeePreferences)

    // Heat water
    myRobot.heatWater(40)

    // Pack your bag
    val booksToPack = arrayListOf("Mathematics", "Physics", "Chemistry", "IT","English","Electronics")
    myRobot.packBag(booksToPack)

    // Cook meals
    val breakfastOptions = arrayListOf("Oatmeal", "Sandwich", "Cereal")
    val lunchOptions = arrayListOf("Biryani", "Paratha", "Dal-Rice")
    myRobot.cookMeals(breakfastOptions, lunchOptions)

    // Iron clothes
    myRobot.ironClothes("Formal attire")
}