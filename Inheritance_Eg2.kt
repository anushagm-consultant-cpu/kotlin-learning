open class Vehicle(val brand:String){
     fun honk(){
        println("beep beep")
    }
     open fun drive(){
         println("The vehicle is moving.")
     }
}

class ElectricCar(brand : String,var battery:Int):Vehicle(brand){
    override fun drive(){
        println("The $brand is gliding silently for $battery km.")
    }
}

fun main() {
 
    val v1=ElectricCar("Breeza",92)
    v1.honk()
    v1.drive()
}
