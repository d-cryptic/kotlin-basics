package com.example.helloworld

//What is an exception?
/*
 * An exception is  a runtime problem which occurs in the program and leads to program termination
 *running out of memory, array out of bound, condition like divided by zero
 * To handle this type of problem during program execution the technique of exception handling is used
 * exception handling is a technique which handles the runtime problems and maintains the flow of program execution
 */


//Throwable Class
/*
* throw MyException("This throws an exception")
* */

/*
* There are four different keywords used in exception handling. These are:
* try, catch, finally, throw
* */

// Keywords used in exception handling
/*
* try - the try block contains a set of statements which might generate an exception. It must be followed by either catch or finally or both
* catch - the catch block is used to catch the exception thrown from try block
* finally - finally block always execute whether exception is handled or not. So it is used to execute important code statement (like closing buffers)
* throw - the throw keyword is used to throw an exception explicitly
* */


//Unchecked exception
/*
* Unchecked exception is that exception which is thrown due to mistakes in our code
* This exception type extends the RuntimeException class
* The Unchecked expression is checked at run time
* Examples:
* ArithmeticExpression: thrown when we divide a number by zero
* ArrayIndexOutOfBoundExceptions: thrown when an array has been tried to access with incorrect index value
* SecurityException: thrown by the security manager to indicate a security violation
* NullPointerException: thrown when invoking a method or properly on a null object
* */


//Checked Exception
/*
* A checked exception is checked at compile time
* this exception types extends the Throwable class
* Example:
* IOException, SQLException
* */

//try catch
/*
* used for exception handling in the code
* syntax
*
* try{
*   //code that may throw the exception
* } catch(e:SomeException){
*   //code that handles the exception
* }
* */

//Example
/*
* val str = getNumber("10") // the variable 'str' is getting the int value of "10"
* println(str)
*   fun getNumber(str:String):Int{
*       return try{
*           Integer.parseInt(str)
*       } catch (e:ArithmeticExpression){
*           0
*       }
* // output: 10
* */


//Multiple catch blocks
/*
* used when we are using different types of operation in a try block which may cause different exceptions in the try block
*
* Example
*
* fun main(args:Array<String>){
*   try{
*       val a = IntArray(5)
*       a[5] = 10/0
*   } catch(e: ArithmeticExpression){
*       println("arithmetic exception catch")
*   } catch(e: ArrayIndexOutOfBoundExceptions){
*       println("array IndexOutOfBounds exception")
*   } catch(e:Exception){
*       println("parent exception class")
*   }
*   println("code after try catch...")
* }
*
* Output: arithmetic exception catch
* code after try catch
* */

// Nested try-catch block
/*
* used when a block of code generates an exception and within that block another code statement also generates an exception
* Syntax :
*
* try{
*   //code block
*       try{
*           //code block
*       }
*   }
*   catch(e:SomeException){}
* }
* */

//finally block
/*
* finally block - such block which is always executed whether exception is handled or not
* so it is used to execute important code statement
*
* Example
*
* fun main(args: Array<String>){
*   try{
*       val data = 10/5
*       println(data)
*   } catch(e:NullPointerException){
*       println(e)
*   } finally{
*       println("finally block always executes")
* }
*   println("below code")
* }
*
* Output:
* 2
* finally block always executes
* below code...
*
* */


//throw Keyword
/*
* used to throw an explicit exception
* used to throw a custom exception
* to throw an exception object we will use the throw expression
*
* Syntax
* throw SomeException()
*
*
* Exception
* fun main(args: Array<String>){
*   validate(15) // another function
*   println("code after validation check...")
* }
*
* fun validate(age:Int){
*    if(age<18)
*       throw ArithmeticExpression("under age")
*     else
*         println("eligible for drive")
* }
*
* //output - exception in thread "main" java.lang/ArithmeticExpression : under age
* */