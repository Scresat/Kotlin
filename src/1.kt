package demo

fun main(args : Array<String>) {
    println("Hello, world!")
    //kt finds the type of variable on it's own
    val name = "satyam" //immutable variable

    var myAge = 19 //mutable

    var bigInt: Int = Int.MAX_VALUE //declaring type of var
    var smallInt: Int = Int.MIN_VALUE

    println("Biggest Int : $bigInt")
    println("Smallest Int : " + smallInt)

    //Long Double Float Boolean Short Byte Char

    //loss of precision when working with floating point numbers

    var dblNum1: Double = 1.1111111111111111
    var dblNum2: Double = 1.1111111111111111

    println("Sum : " + (dblNum1 + dblNum2))
}