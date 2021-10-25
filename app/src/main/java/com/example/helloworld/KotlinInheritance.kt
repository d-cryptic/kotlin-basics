package com.example.helloworld

//The class that inherits the features of another class is called the sub class or child class or derived class
// and the class whose features are inherited is called the super class or parent class or base class

class Vehicle{
//    properties
//   methods
}

//sealed Car:Vehicle() - not working

//sub class, child class or derived class of vehicle
//Super class, parent class, base class of  car
//open class Car : Vehicle(){

//}

open class Cart(val name: String, val brand: String){
    open var range: Double = 0.0
    fun extendRange(amount: Double){
        if(amount > 0){
            range+=amount
        }
    }

    open fun drive(distance: Double){
        println("Drove for $distance KM")
    }
}


//Sub class, child class, derived class of Car
class ElectricCar(name:String, brand: String, batteryLife: Double): Cart(name, brand){

    var chargerType = "Type1"

    override var range = batteryLife*6

    override fun drive(distance: Double){
        println("Drove for $distance KM on electricity")
    }

    fun drive(){
        println("Drove for $range KM on electricity")
    }
}

//Any class inherits from the Any class

fun main(){
    var audiA3 = Cart("A3", "Audi")
    var teslaS =ElectricCar("S-Model", "Tesla", 85.0)
    teslaS.chargerType = "type 2"
    teslaS.extendRange(200.0)
    teslaS.drive()

//    Polymorphism
    audiA3.drive(200.0)
    teslaS.drive(200.0)
}