package com.example.helloworld

fun main() {

//    var name :String = "Denis"
//    name = null -> compilation error
    var nullableName : String? = "Denis"
//    nullableName = null
//    println(nullableName)

//    var len = name.length
    var len2 = nullableName?.length
//    println(nullableName?.toLowerCase())
//    nullableName?.let {println(it.length)}

    // ?: Elvis operator
    val name = nullableName ?: "Guest" // if nullablename is empty than use "Guest"
    println("name is $name")

    nullableName!!.toLowerCase() //Kotlin null pointer exception
    println(nullableName)


//    val wifesAge: String? = user?.wife?.age ?: 0 //safe call operator in a chain
/*
    if(nullableName != null){
        var len2 = nullableName.length
    } else {
        null
    }
  */
}