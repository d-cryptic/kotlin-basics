package com.example.helloworld

//Nested class and Inner class
//a class which is created inside another class and a class which is created inside another class with keyword inner


//Nested class
/*
* nested class is such a class which is created inside another class
* In Kotlin, a nested class is by default static, so its data members, and member functions can be accessed without created an object of the class
* Nested classes cannot access the data members of outer classes
* */

//Syntax of nested class
/*
* class OuterClass{
*   // outer class code
*   class NestedClass{
*       // nested class code
*   }
* }
* */

//Nested class example
class OuterClass{
    private var name: String = "Mr X"
    class NestedClass{
        var description: String = "code inside nested class"
        private var id: Int = 101
        fun foo() {
//            print("name is ${name}") // cannot access the outer class member
            println("Id is ${id}")
        }
    }
}


//Inner class
/*
* An inner class is a class which is created inside another class with keyword inner
* In other words, we can say that a nested class which is marked as "inner" is called inner class
* Inner class cannot be declared inside interfaces or non-inner nested class
* The advantage of inner class over nested class is that, it is able to access member of its outer class even it is private
* The inner class keeps a reference to an object of its outer class
* */


//Syntax of inner class
/*
* class OuterClass{
*   // outer class code
*   inner class InnerClass{
*       // inner class code
*   }
* }
* */


//Inner class Example
class OuterClass{
    private var name: String = "Mr X"
    inner class InnerClass{
        var description: String = "code inside inner class"
            private var id: Int = 101
        fun foo(){
            println("name is ${name}") // access the private outer class member
            println("Id is ${id}")
        }
    }
}

//Inner class example
fun main(args: Array<String>){
    println(OuterClass().InnerClass().description) // accessing property
    var obj = OuterClass().InnerClass() // object creation
    obj.foo() //access memeber function

    /* output
    * code inside inner class
    * id is [0]
    * */
}