package `OOP-Object-Oriented-Programming`.`Coding-Practice`.`3`.Interface
/*
Create an interface Games with the functions named as football, cricket and basketball, without any default implementations.
Now create a class named Sports which implements this interface and overrides all the functions while printing a corresponding message for each sport.
 */
fun main() {
    val sports = Sports()

    sports.football() // Playing football
    sports.cricket()  // Playing cricket
    sports.basketball() // Playing basketball
}

/*
interface Games{
   fun football()
   fun cricket()
   fun basketball()
}

class Sports: Games{
   override fun football() {
       println("Football is a sport")
   }

   override fun cricket() {
       println("Cricket is a sport")
   }

   override fun basketball() {
       println("Basketball is a sport")
   }

}

fun main(){

    val sports = Sports()
    sports.football()
    sports.cricket()
    sports.basketball()

}
 */