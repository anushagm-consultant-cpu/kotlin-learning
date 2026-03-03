Kotlin

What is Kotlin?
Kotlin is a modern, trending programming language that was released in 2016 by JetBrains.
It has become very popular since it is compatible with JAVA. which means that Java code (and libraries) can be used in Kotlin programs.

Kotlin is used for:
Mobile applications (specially Android apps)
Web development
Server side applications
Data science
And much, much more!

Variables: val vs var
The choice between fixed and changeable data.
val (Value): Read-only. Use this by default for cleaner, safer code.
var (Variable): Mutable. Use only when you know the value must change.
Null Safety: Add ? to a type to allow it to hold a null value.


val id = 101    // Cannot change
var status = "Idle"   // Can change
var name: String? = null // Nullable variable


Data Types:

Integers
Int, Long
Long requires an L suffix (e.g., 10L).

Decimals
Float, Double
Double is the default; Float needs an f.

Boolean
Boolean
Only true or false.

Text
String, Char
Use $ for templates: "Hello $name".


Operators: 
Arithmetic & Assignment
Standard: +, -, *, /, %
Augmented: +=, -=, *=, /=
Comparison & Logic
Equality: == (checks value), === (checks if same object in memory).
Comparison: <, >, <=, >=
Logical: && (And), || (Or), ! (Not).


Range Operator
.. (inclusive): 1..5 is 1, 2, 3, 4, 5.
until (exclusive): 1 until 5 is 1, 2, 3, 4.
