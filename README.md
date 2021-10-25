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
14. Comparison Operators - `==`, `!=`, `<`, `>`, `<=`, `>=`
15. String Template: `println("... $variable")`
16. String Interpolation - String template with expression: `prinln("... ${expression})`
17. Increment operator - `++i` - first increase than return; `i++` - first return than increment
18. Decrement operator - `--i` - first increase than return; `i--` - first return than decrease
19. Both increment and decrement operator are expressions
20. `\n` escape character - new line

<hr/>

### If else
<pre>
if(condition){
  statement
} else if(condition) {
  statement
} else{
  statement
}
</pre>

<hr/>

### When expressions
<pre>
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
</pre>

<pre>
var month = 3
    when(month){
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
[comment]: <> (        in 12..2 -> println&#40;"Winter"&#41; - use downto)
[comment]: <> (        in 12 downTo 2 -> println&#40;"Winter"&#41; - but all cases have been covered)
        12, 1, 2 -> println("Winter")
        else -> println("Invalid season")
    }
</pre>

<pre>
var age = 20
    when(age){
        !in 0..20 -> println("now you can drink in the usa")
        in 18..20 -> println("you may vote now")
        16, 17 -> println("you may drive now")
        else -> println("you are too young")
    }
</pre>

<hr/>

### `is` keyword
<pre>
 var x : Any = 13.37
    when(x) {
        is Int -> println("$x is an Int")
        !is Double -> println("$x is not a Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }
</pre>

<hr/>

### While loop
<pre>
var initialization
while(condition){
  statement
  increment or decrement
}
</pre>

### Do while loop
<pre>
var init
do{
  statement
  increment/decrement
} while(condition)
</pre>

<hr/>

### For loops
<pre>
  for(num in 1..10){
        println("$num")
    }
</pre>

<pre>
    for(i in 1 until 10){
[comment]: <> (        range)
        println("$i")
    }
</pre>


<pre>
for(i in 10 downTo 1 step 2){
[comment]: <> (same as for &#40;i in 10.downTo&#40;1&#41;.step&#40;2&#41;&#41;)
        println("$i ")
    }
</pre>


<hr/>

Some more topics to learn:
1. Elvis operator ?.
2. Safe call operator
3. Nullable value
4. !!. forcing value
5. Chain safe call operator

<hr/>

## OOPS

### Classes and Objects 

#### Scope

- Shadowing - try to avoid shadowing for two reasons
1. you code becomes hard to read as two different things have the same name, which leads to confusion
2. once shadowed, you can no longer access the original variable within a scope.

