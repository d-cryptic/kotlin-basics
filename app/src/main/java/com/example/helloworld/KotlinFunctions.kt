package com.example.helloworld

fun main(){
    //    Functions
    myFunction()

//    argument (value passed to function)
    var result = addUp( 5,  3)
    println("result is $result")

    var result1 = avg(5.3, 13.37)
    println("result is $result1")


//    Nullables - billion dollar mistake


}

fun avg(a: Double, b: Double) : Double{
    return (a+b)/2
}

// Method - a method is a function within a class
// Parameter (input)
fun addUp(a: Int, b: Int) : Int{
    return a+b
}

fun myFunction(){
    println("Called from myFunction")
}