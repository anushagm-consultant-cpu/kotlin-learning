package com.example.myapplication

class FirstClass {
    var name: String = "Kotlin"
    var version: Int = 2

    fun printDetails() {
        println("Name: $name")
        println("Version: $version")
    }
}

fun main() {
    val first = FirstClass()
    first.printDetails()
}
