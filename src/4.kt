package demo

fun main(args: Array<String>) {

    var letterGrade: Char = 'A'

    println("A is a Char : ${letterGrade is Char}")
    println("3.14 to an Int : " + (3.14.toInt()))
    println("3.14 to an Int : ${3.14.toInt()}")  //double to an integer
    println("65 to a char : " + (65.toChar()))
    println("A to an Int : " + ('A'.toInt()))
}