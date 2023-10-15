package `OOP-Object-Oriented-Programming`.`Coding-Practice`.`Data-Classes`

/*
Store a list of ten students in a mutable list.
Each student entry should have a name, roll number, and percentage marks.
Make functions inside the class Student to print the values of each student in a separate line
and then make Student class as data class and directly print the values.
 */

fun main() {
    // write your code here
    val student1 = Student("Amit Swain", 1, 45.2)
    val student2 = Student("Rahul Roy",2,95.3)
    val student3 = Student("Ashish Kumar",3,85.35)
    val student4 = Student("Pushpa Raj",4,92.26)
    val student5 = Student("Shubham Shetty",5,75.3)
    val student6 = Student("Virat Kohli",6, 97.2)
    val student7 = Student("Rohit Sharma",7,96.48)
    val student8 = Student("Hardik Pandya",8,91.25)
    val student9 = Student("Ravindra Jadeja",9,87.36)
    val student10 = Student("Jasprit Bumrah",10,94.80)

    var studentsList = mutableListOf(student1,student2)

    studentsList.addAll(listOf(student3,student4,student5,student6,student7,student8,student9, student10))
    println("-----------------------------------------------------------------")

    for(students in studentsList){
        students.printStudentsData()
        println()
        println("-----------------------------------------------------------------")
        println()
    }
}

/*
// Using simple class
class Student(val name: String, val rollNumber: Int, val percentageMarks: Double) {

   fun printValues(){
       println("Name: $name, Roll Number: $rollNumber, Percentage: $percentageMarks")
   }
}

fun main() {
   val studentList = mutableListOf<Student>()
   studentList.add(Student("Cristina", 1290, 78.5))
   studentList.add(Student("Mark", 1291, 88.25))
   studentList.add(Student("Lea", 1292, 71.0))
   studentList.add(Student("Jack", 1293, 78.5))
   studentList.add(Student("Anies", 1294, 78.5))
   studentList.add(Student("Danielle", 1295, 78.5))
   studentList.add(Student("Sandra", 1296, 78.5))
   studentList.add(Student("Katina", 1297, 78.5))
   studentList.add(Student("Edgar", 1298, 78.5))
   studentList.add(Student("Felix", 1299, 78.5))

   for (i in studentList){
       i.printValues()
   }
}

// Data class implementation
//
// Uncomment the below code and comment the above to run this

data class Student(val name: String, val rollNumber: Int, val percentageMarks: Double)

fun main() {
   val studentList = mutableListOf<Student>()
   studentList.add(Student("Cristina", 1290, 78.5))
   studentList.add(Student("Mark", 1291, 88.25))
   studentList.add(Student("Lea", 1292, 71.0))
   studentList.add(Student("Jack", 1293, 78.5))
   studentList.add(Student("Anies", 1294, 78.5))
   studentList.add(Student("Danielle", 1295, 78.5))
   studentList.add(Student("Sandra", 1296, 78.5))
   studentList.add(Student("Katina", 1297, 78.5))
   studentList.add(Student("Edgar", 1298, 78.5))
   studentList.add(Student("Felix", 1299, 78.5))

   for (i in studentList){
       println(i)
   }
}

 */