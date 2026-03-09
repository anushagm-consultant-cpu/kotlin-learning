package com.example.myapplication

import org.junit.Test

class CarTest{
@Test
    fun testCar(){
        val car1=Car()
        car1.name="Toyota"
        car1.model="Camry"
        car1.color="Red"
        car1.doors=4

        println("Name = ${car1.name}")
        println("Model = ${car1.model}")
        println("Color = ${car1.color}")
        println("Doors = ${car1.doors}")

        car1.move()
        car1.stop()

    println("\n")

    val car2=Car()
    car2.name="Honda"
    car2.model="Civic"
    car2.color="Blue"
    car2.doors=2

    println("Name = ${car2.name}")
    println("Model = ${car2.model}")
    println("Color = ${car2.color}")
    println("Doors = ${car2.doors}")

    car2.move()
    car2.stop()


    }
}

class Car {
    var name=""
    var model=""
    var color=""
    var doors=0


    fun move(){
        println("The car $name is moving")
    }

    fun stop(){
        println("The car $name is stopped")
    }

    }
