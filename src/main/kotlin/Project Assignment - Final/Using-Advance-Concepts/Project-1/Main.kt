package `Project Assignment - Final`.`Using-Advance-Concepts`.`Project-1`

fun main() {
    val myRobot = MorningRobot("MyMorningRobot")

    // Set the alarm for weekdays, skipping Saturday and Sunday
    myRobot.setAlarm("7:00 AM", listOf("Saturday", "Sunday"))

    // Make coffee preferences for today
    myRobot.makeCoffee(withMilk = true, sugarLevel = 2)

    // Heat water for bathing
    myRobot.heatWater(40)

    // Define the timetable for books to pack
    val timetable = mapOf(
        "Monday" to listOf("Math", "History"),
        "Tuesday" to listOf("Science", "English"),
        "Wednesday" to listOf("Physics"),
        "Thursday" to listOf("Chemistry", "Geography"),
        "Friday" to listOf("Literature")
    )
    myRobot.packBag(timetable)

    // Define meal preferences for the week
    val mealPreferences = mapOf(
        "Breakfast" to listOf("Pancakes", "Omelette", "Cereal"),
        "Lunch" to listOf("Sandwich", "Salad", "Pizza")
    )
    myRobot.cookMeals(mealPreferences)

    // Iron clothes for the chosen outfit
    myRobot.ironClothes("Shirt and Trousers")
}
