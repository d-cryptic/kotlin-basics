package com.example.helloworld

import java.lang.IllegalArgumentException

fun main(){
    var myCar = Car()
//    myCar.owner
    println("brand is : ${myCar.myBrand}")
    myCar.maxSpeed = 200
    println("Maxspeed is ${myCar.maxSpeed }")
//    myCar.model = "M3"
    println("Model is ${myCar.myModel}")
}

class Car(){
    // Initialize the variable later on
    lateinit var owner: String

    val myBrand: String = "BMW"

//        Custom getter
    get(){
        return field.toLowerCase()
    }

    var maxSpeed: Int = 250
        get() = field
        set(value){
            field = if(value > 0) value else throw IllegalArgumentException("Maximum speed cannont be less than 0")
        }

    var myModel : String = "MS"
        private set


    init{
        this.myModel = "M3"
        this.owner = "Frank"
    }
}

//field - vacant field helps you to get the values of getter
// value - value given to the method when we use setter