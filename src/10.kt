//functions

package demo

fun main(args: Array<String>) {
    fun add(num1: Int, num2: Int) : Int = num1 + num2
    //fxn name, arguments, return type, definition

    println("5 + 8 = ${add(5, 8)}")

    //functions with default values
    fun subtract(num1: Int = 5, num2: Int = 4) = num1 - num2 //return type Int not needed for single line functions
    println("5 - 4 = ${subtract()}")

    //named parameters

    println("5 - 4 = ${subtract(5, 4)}")
    println("4 - 5 = ${subtract(num2 = 5, num1 = 4)}")

    //For returning nothing, using Unit
    fun sayHello(name: String) : Unit = println("Hello, $name")

    sayHello("satyam")

    val (two, three) = nextTwo(1)
    println("1 $two $three")
}

//function that returns two values - using Pair<Type, Type> for return after the colon :

fun nextTwo(num: Int) : Pair<Int, Int> {
    return Pair(num + 1, num + 2)
}