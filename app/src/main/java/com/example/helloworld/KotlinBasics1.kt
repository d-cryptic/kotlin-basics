package com.example.helloworld

fun main(){

//    Mutable variable
//    var myName = "Barun"

//    Immutable variable
//    val myName = "Barun"
//    print("Hello " + myName)

//    Single line comment
    /*
    Multi line comment
     */

//    type string
    val myName = "Barun"
//    type int - 32 bits
    var myAge = 21

//    Integer types: byte - 8bit, short - 16 bit, int - 32 bit, long, 64 bit
    var myByte: Byte = 13
    var myShort : Short = 125
    var myInt: Int = 123123123
    var myLong: Long = 120932342344544

//    Floating point number types: Float (32 bits), Double (64 bit)
    val myFloat: Float = 13.37F
    val myDouble: Double = 3.1243235564322456

//    Booleans
//    var isSunny: Boolean = true
    var isSunny = true
    isSunny = false

//    Characters
    val letterChar = 'A'
    val digitChar = '1'

//    Strings
    val myStr = "Hello World"
    var firstCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]
    println("First Character " + firstCharInStr)

//    Arithmetic Operators -> +, -, /, *, %
    var result = 5+3
    println(result)

    val a = 5.0 //double
    val b = 3
    result = (a/b).toInt()
    println(result)

    var resultDouble: Double
    resultDouble = a/b
    println(resultDouble)

//    Comparison operators
    val isEqual = 5==5
    println("isEqual is $isEqual")

    println("is5greater3 ${5>3}")
    println("is5LowerEqual3 ${5<=3}")

    var myNum = 5
//    Increment decrement operatorm
    myNum++;
    println("myNum $myNum")
    println("myNum ${myNum++}")
    println("MyNum ${++myNum}")

    println("myNum ${myNum--}")
    println("MyNum ${--myNum}")


//    If statements
    var heightPerson1 = 170
    var heightPerson2 = 189
    if(heightPerson1 > heightPerson2){
        println("use raw force")
    } else if(heightPerson1 == heightPerson2){
        println("use your power technique 1337")
    } else{
        println("use technique")
    }

    var season = 3
    when(season){
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid season")
    }

    var month = 3
    when(month){
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
//        in 12..2 -> println("Winter") - use downto
//        in 12 downTo 2 -> println("Winter") - but all cases have been covered
        12, 1, 2 -> println("Winter")
        else -> println("Invalid season")
    }

    var age = 20
    when(age){
        !in 0..20 -> println("now you can drink in the usa")
        in 18..20 -> println("you may vote now")
        16, 17 -> println("you may drive now")
        else -> println("you are too young")
    }

    var x : Any = 13.37
    when(x) {
        is Int -> println("$x is an Int")
        !is Double -> println("$x is not a Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }

//    While Loop - executes a block of code repeatedly as long as a given condition is true
    var x1 = 1
    while(x1 <= 10){
        // code to be executed
        println("$x1")
        x1++
    }
    println("\n while loop is done")

    x1 = 1
    do {
        println("$x1")
        x1++
    } while(x1<=10)
    println("\n do while loop is done")

    var feltTemp = "cold"
    var roomTemp = 10
    while(feltTemp == "cold"){
        roomTemp++
        if(roomTemp == 20){
            feltTemp = "comfy"
            println("It's comfy now")
        }
    }


//    For loops
    for(num in 1..10){
        println("$num")
    }

    for(i in 1 until 10){
//        range
        println("$i")
    }

    println()
    for(i in 10 downTo 1 step 2){
//        same as for (i in 10.downTo(1).step(2))
        println("$i ")
    }



}