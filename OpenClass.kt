open class Person(open val name:String, open var age:Int){
    
    init{
        println("Object was created")
    }
    
    fun speak(){
        println("Hello")
    }
    
    fun greet(name:String){
        println("Hello $name")
        
    }
 
}

class Student(override val name:String,override var age:Int,val studentId : Long):Person(name,age){
    fun isIntelligent()=true
}
class Employee(override val name:String,override var age:Int):Person(name,age){
    fun receivePayment(){
        println("Received payment")
    }
}

fun main() {
    
    val student = Student("Anu",22,11)
    student.speak()
    student.greet("ABHI")
    println("Name : ${student.name}")
    println("Age : ${student.age}")
    println("Id : ${student.studentId}")
    
    
    println(student.isIntelligent())
    
    println("\n")
    
    val employee = Employee("Mary",32)
    employee.greet("sai")
    
    employee.receivePayment()
}
