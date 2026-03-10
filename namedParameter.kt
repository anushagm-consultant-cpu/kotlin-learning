class House(val height:Double,val color:String,val price:Int=50000){
    
    fun print(){
        println("House [height=$height , color=$color, price=$price]")
    }
    
}

fun main() {
    val house=House(height = 4.5,color = "Blue",price = 1500000)
    val redHouse = 	House(color="Red", height = 4.7, price =231234)
    val yellowhouse =House(3.7,"yellow")
    
    house.print()
    redHouse.print()
    yellowhouse.print()
}
