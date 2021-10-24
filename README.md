# OOPS

### The 5 basic concepts
1. variables and types
2. control flows
3. functions
4. collections
5. classes and objects (including inheritances)

### variables and types
- A variable is a location in memory (storage)
- To indicate the storage area, each variable should be given a unique name (identifier)

*** Variable Example ***
<pre>
fun main(args: Array<String>){
    var age = 15
    println(age) //output will be 15
}
</pre>


### Control flows
- Control flows allow
    - to do something conditionally
    - to repeatedly run code (conditionally)
    
*** Example ***
<pre>
fun main(args: Array<String>){
    var age = 17
    if(age>=21)
        println("you may vote now!")
}
</pre>



### Functions
- Functions enable us
    - to separate code
    - to run code blocks when needed
    
*** Example ***
<pre>
fun main(args: Array<String>){
    myFunction()
}

fun myFunction(){
    println("my function was called")
}
</pre>


### Collections
- Collections enable us to
    - store multiple elements in one place
    - iterate through multiple elements (with the help fo control flows)
    

### Classes
- Allow us to 
    - create our own data types
    - keep the data members and methods together in one place
    - write more readable and maintainable code
    - work better in a team


<hr/>

# Basics

1. `var` - can be changed
2. `val` - cant be changed
3. `//` - single line comment
4. `/* .... */` - multi line comment
5. Kotlin is a typed language - will know what type of variable is assigned
6. byte - 8bit, short - 16 bit, int - 32 bit, long, 64 bit
7. Default = type int => type interference
8. Floating point number types: Float (32 bits), Double (64 bit)
9. Float - var a = 12.34F
10. Boolean - represent logical values - true and false
11. Arithmetic operators - `+`, `-`, `/`, `*`, `%`, `+=`, `-=`, `*=`, `/=`, `%=` 
12. `variableName.toInt()`
13. `var variableName: DataType`
  - `var a: Int`
  - `var b: Double`
  - `var c: String`
  - `var d: Boolean`