package com.example.helloworld

//The class that inherits the features of another class is called the sub class or child class or derived class
// and the class whose features are inherited is called the super class or parent class or base class

interface Drivable{
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("The drivable is braking")
    }
}

class Vehicle{
//    properties
//   methods
}

//sealed Car:Vehicle() - not working

//sub class, child class or derived class of vehicle
//Super class, parent class, base class of  car
//open class Car : Vehicle(){

//}

open class Cart(override  val maxSpeed: Double,val name: String, val brand: String): Drivable{
    open var range: Double = 0.0
    fun extendRange(amount: Double){
        if(amount > 0){
            range+=amount
        }
    }

//    Shorter version
//    override fun drive(): String = "driving the interface drive"

    override fun drive(): String{
        return "Driving the interface drive"
    }

    open fun drive(distance: Double){
        println("Drove for $distance KM")
    }
}


//Sub class, child class, derived class of Car
class ElectricCar( maxSpeed: Double,name:String, brand: String, batteryLife: Double): Cart(maxSpeed, name, brand){

    var chargerType = "Type1"

    override var range = batteryLife*6

    override fun drive(distance: Double){
        println("Drove for $distance KM on electricity")
    }

    override fun drive(): String{
        return "Drove for $range KM on electricity"
    }

    override fun brake(){
        super.brake()
        println("brake inside of electric car")
    }
}

//Any class inherits from the Any class

fun main(){
    var audiA3 = Cart( 200.0,"A3", "Audi")
    var teslaS =ElectricCar(240.0,"S-Model", "Tesla", 85.0)
    teslaS.chargerType = "type 2"
    teslaS.extendRange(200.0)
    teslaS.drive()
    teslaS.brake()
    audiA3.brake()

//    Polymorphism
    audiA3.drive(200.0)
    teslaS.drive(200.0)
}