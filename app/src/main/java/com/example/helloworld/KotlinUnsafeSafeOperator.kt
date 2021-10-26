package com.example.helloworld

// unsafe cast operator : as
/*
* sometimes it is not posssible to case a variable and it throws an exception, this is called an unsafe cast.
* The unsafe cast is performed by the infix operator as.
* */


//Example
/*
* A nullable string (String?) cannot be cast to non nullable string (String), this throws an exception
*
* fun main(args: Array<String>){
*   val obj: Any? = null
*   val str: String = obj as String
*   println(str)
* }
*
* // output: exception in thread "main" kotlin.TypeCastException: null cannot be cast to non-null type kotlin String.
* */


//Generates a ClassCastException
/*
* Trying to cast an integer value of the Any type into a string type leads to a ClassCastException
*
* val obj: Any = 123
* val str: String = obj as String
*
* // Throws java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
* */


// nullable to casting to work
/*
* Source and target variable needs to be a nullable for casting to work
*
* fun main(args: Array<String>){
*   val obj: Any? = "String unsafe cast"
*   val str: String? = obj as String? //Works
*   println(str)
* }
*
* // Output: String unsafe cast
* */


//Safe cast operator : as?
/*
* as? provides a safe cast operation to safely cast to a type
* It returns a null if casting is not possible rather than throwing an ClassCastException exception
* */

// Example of safe cast operator
/*
* fun main(args: Array<String>){
*   val location: Any = "Kotlin"
*   val safeString: String? = location as? String
*   val safeInt: Int? = location as? Int
*   println(safeString)
*   println(safeInt)
* }
*
* // output - kotlin
*             null
* */

