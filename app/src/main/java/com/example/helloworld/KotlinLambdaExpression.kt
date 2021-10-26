package com.example.helloworld

//What is Lambda expression?

/*
* Lambda (Expression) is a function which has no name
* Lambda expression and anonymous functions are 'function literals', i.e. functions that are not declared, but passed immediately as an expression
* Lambda is defined with curly braces {} which takes variables as a parameter (if any) and a body of a function
* The body of a function is written after the variable (if amy) followed by -> operator
* Syntax: {variable(s) -> body_of_lambda}
* */

//Normal function: addition of two numbers
/*We create a function addNumber() passing two arguments (a,b).
 * addNumber(5,10) //Let say passing the values are a=5 and b=10;
 * fun addNumber(a:Int, b:Int){
 * val add = a+b
 * println(add)
 * }
 */

//Lambda expression: addition of two numbers
/*
* val sum: (Int, Int) -> Int = {a:Int, b: Int -> a+b}
* println(sum(10,5))
*
* // even shorter
* val sum = {a:Int, b:Int -> println(a+B)}
* sum(10,5)
* */

//Visibility Modifiers
//are the keywords which are used to restrict the use of classes, interfaces, methods, and properties of Kotlin

//What is a visibility modifier
/*
* Visibility modifiers are the keywords which are used to restrict the use of classes, interfaces, methods, and properties in Kotlin
* These modifiers are used at multiple places such as class header or method body
* Visibility Modifiers are categorized into four different types:Int
* public, private, protected, internal
* */

// Public Modifier
/*
* A public modified element is accessible from everywhere in the project
* It is a default modifier in Kotlin. If any class, interface, etc. are not specified with any access/ visibility modifier then that class, interface etc. is used in a public scope
* All public declarations can be places at the top of the file
* If a member of a class is not specified then it is by default public
* */


//Syntax of Public Modifier
/*
* public class Example{}
* class Demo{}
* public fun hello()
* fun demo()
* public val x = 5
* val y = 10
* */



//Private Modifier
/*
* A private modifier allows the element to be accessible only within the block in which properties, fields, etc. are declared.
* The private modifier declaration does not allow access outside the scope
* A private package can be accessible within that specific file
* */

//Syntax private modifier
/*
* private class Example{
*   private val x = 1
*   private doSomething(){}
* }
*
* In above class example, val x and functino doSomething() are declared as private. the class "Example" is accessible from the same source file, "val x" and "fun doSomething()" are accessible within example class.
* */

//Internal modifier
/*
* The internal modifier is feature in Kotlin, which is not available in Java
* The internal modifier makes teh field visible only inside the module in which it is implemented.
* All the fields are declared as internal which are accessible only inside the module in which they are implemented
* */

//Syntax internal modifier
/*
* internal class Example{
*   internal val x = 5
*   internal fun getValue(){}
* }
*   internal val y = 10
* */


// Open keyword
/*
* In kotlin all classes are final by default, so they can't be inherited by default
* in java, it's opposite, there you have to make your class final explicitly
* so to make a class inheritable to other classes you must mark it with the open keyword, else you get an error "type is final so can't be inherited
* */


//Protected modifier
/*
* A protected modifier with a class or an interface allows visibility to its class or subclass only
* A protected declaration (when overridden) in its subclass is also protected unless it is explicitly changed.
* The protected modifier cannot be declared at top level (for packages)
* */

//Syntax of protected modifier

/*
* open class Base{
*   protected val i = 0
* }
*
* class Derived: Base(){
*   fun getValue(): Int{
*       return i
*   }
* }
* */


// Overriding of protected types
/*
* open class Base{
*   open protected val i = 5
* }
*
* class Another: Base(){
*   fun getValue():Int {
*       return i
*   }
*   override val i = 10
* }
* */



//Example of visibility modifier

open class Base() {
    var a = 1 // public by default
    private var b = 2 // private to Base class
    protected open val c = 3 // visible to the Base and the Derived class
    internal val d = 4 // visible inside the same module
    protected fun e() {} // visible to the Base and the Derived class
}

class Derived: Base(){
//    a, c, d, and e() of the base class are visible
//    b is not visible
    override val c = 9 // c is protected
}

fun main(args: Array<String>){
    val base = Base()
//    base.a and base.d are visible
//    base.b, base.c and base.e() are not visible
    val derived = Derived()
//    derived.c is not visible
}