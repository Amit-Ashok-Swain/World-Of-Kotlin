package `Project Assignment - Final`.`Using-Classes-and-Objects`

fun main() {
    val morningTasks = MorningTasks()

    morningTasks.ringAlarm("7:00 AM", listOf("Saturday", "Sunday"))
    morningTasks.makeCoffee(CoffeePreferences(true, 1))
    morningTasks.heatWater(40, true)
    morningTasks.packBag(listOf("Math", "History", "English"))
    morningTasks.cookMeals(listOf("Pancakes", "Omelette", "Cereal"), listOf("Sandwich", "Salad", "Pizza"))
    morningTasks.ironClothes(listOf("Shirt", "Trousers", "Dress"))

}