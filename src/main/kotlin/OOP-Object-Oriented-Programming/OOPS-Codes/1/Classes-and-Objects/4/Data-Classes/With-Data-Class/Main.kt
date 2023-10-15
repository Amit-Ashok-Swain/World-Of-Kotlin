package `OOP-Object-Oriented-Programming`.`OOPS-Codes`.`1`.`Classes-and-Objects`.`4`.`Data-Classes`.`With-Data-Class`
/*
Create two objects with the same values and compare them.
 */
fun main() {

    val res1 = Restaurants("McDonald's", 4.1, 200)
    val res2 = Restaurants("Dominos", 3.9, 150)
    val res3 = Restaurants("Burger King", 4.0, 250)
    val res4 = Restaurants("Taco Bell", 4.1, 400)
    val res5 = Restaurants("Subway", 3.5, 300)
    val res6 = Restaurants("Burger King", 4.0, 250)

    var restaurantsList = mutableListOf(res1, res2, res3)

    restaurantsList.addAll(listOf(res4, res5, res6))

    println("*********************************************************************")

    if (res3 == res6) {
        println("Restaurants are same")
    } else {
        println("Restaurants are not same")
    }

    println("*********************************************************************")

    for (res in restaurantsList) {
        println(res)
        println("------------------------------------------------------------")
    }
    println("*********************************************************************")

}