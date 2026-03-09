package com.example.myapplication

import org.junit.Test

class FirstClass {
    var name: String = "Anusha"
    var age: Int = 22

    fun printDetails() {
        println("Name: $name")
        println("age: $age")
    }
}

class FirstClassTest {
    @Test
    fun testFirstClass() {
        val first = FirstClass()
        first.printDetails()
    }
}
