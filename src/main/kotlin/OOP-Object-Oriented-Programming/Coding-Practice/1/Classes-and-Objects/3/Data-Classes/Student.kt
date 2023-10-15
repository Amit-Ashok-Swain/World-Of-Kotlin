package `OOP-Object-Oriented-Programming`.`Coding-Practice`.`Data-Classes`

data class Student(var name : String, var rollNumber : Int, var percentageMarks : Double){

    fun printStudentsData(){
        println("Name : ${name}, Roll No : ${rollNumber}, Percentage Marks : ${percentageMarks}%")
    }
}
