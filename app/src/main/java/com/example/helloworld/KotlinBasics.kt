package com.example.helloworld

fun main() {
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
}
