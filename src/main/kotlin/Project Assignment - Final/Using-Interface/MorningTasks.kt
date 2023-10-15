package `Project Assignment - Final`.`Using-Interface`

interface MorningTasks {
    fun ringAlarm(alarmTime: String, skipDays: List<String>)
    fun makeCoffee(preferences: CoffeePreferences)
    fun heatWater(temperature: Int, willBatheToday: Boolean)
    fun packBag(books: List<String>)
    fun cookMeals(breakfastOptions: List<String>, lunchOptions: List<String>)
    fun ironClothes(clothes: List<String>)
}