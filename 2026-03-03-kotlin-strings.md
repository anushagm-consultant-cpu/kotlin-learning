**TYPE CONVERSIONS IN KOTLIN:**

To Convert to Byte>>>>toByte()
To Convert to Short>>>toShort()
To Convert to Integer>>>toInt()
To Convert to Long>>>toLong()
To Convert to Float>>>toFloat()
To Convert to Double>>>toDouble()


fun main(args:Array<String>){
var x:Byte=127
var y:Int=x.toInt()
var z:Double=y.toDouble()

println(x)//127
println(y)//127
println(z)//127.0
}

Larger to small datatype—>data loss

fun main(args:Array<String>){

    var a:Double =132.32
    var b:Int=a.toInt()
    var c:Byte=b.toByte()
    
    println(a)//132.32
    println(b)//132
    println(c)//-124
}


**String Datatypes :**

Kotlin String Essentials 
1. Templates: Use `$variable` or `${expression}`. 
2. Raw Strings: Use `"""` for multi-line text. 
3. Properties: `.length`, `.reversed()`, and indexing like `str[0]`.
   
```
val name= "Anu"
println("Hi Im a $name!")
 ``` 

**Detailed String Data Type Content**
• String Templates: Use `$variable` for simple variables or `${expression}` for math/logic/functions. 
• Escaped Strings: Uses standard double quotes (`" "`). Supports escape characters like `\n` (new line) and `\t` (tab). 
• Raw Strings: Uses triple quotes (`""" """`). Preserves formatting and multi-line text without needing escape characters. 

Common Functions: 
• `.length`: Gets character count. 
• `.reversed()`: Reverses the string. 
• `.uppercase()` / `.lowercase()`: Changes casing. 
• `string[index]`: Access specific characters (starts at 0). 

``` 
val name = "Kotlin" println("Template: ${name.uppercase()} has ${name.length} letters") 
val raw = """ 
Line 1 
Line 2
      """ 
```

**Functions:**

##Code reuseability 

A Kotlin function can be defined as the block of code,which is used to hold data or information.

The Kotlin functions are defined with the fun keyword



fun info() {
       
    println("This is a kotlin function")
}

info()-->name of the function

A Kotlin function is used to divide a program into small modules.
 
A function can easily be invoked by making a call,and to make a call we use the name of the function with parentheses.



**Function parameters:**

Functions can also accept the data or information passed to them.

The information or data is passed in the form parameters.
These parameters are specified after the name of the function.

fun calc(a:Int,b:Int,c:Int){
    println((a+b+c)/3)
}

fun main() {
       
    val a=477
    val b=495
    val c=470
    
    calc(a,b,c)
    
    
}


**Function returning values:**

 A Function can also return values, to return a value or values,return keyword is used.

After the function parentheses the return type is specified.

fun calc(a:Int,b:Int):Int
{
  Var sum:Int=0
sum=a+b
return sum
}

fun main() {
       
    val a=477
    val b=495
    val c=470
       
    var k=calc(a,b,c)
    
    println(k)
}

Int is the return type

**Function with no return type**

Fun cal(num:Int):Unit
{
	println(“Hello”)
}

In kotlin, if the function is not returning anything then we don’t need to specify any return type.

Still if we want to mention the return type, then we can add Unit as the return type.

Like we use void in java,in kotlin we use Unit

