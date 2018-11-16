//Exception Handling

package demo
import java.util.Scanner

fun main(args: Array<String>) {
    var choice = 'y'
    val reader = Scanner(System.`in`) //reader object of Scanner class is created, backticks used `
    while (choice == 'y')
    {
        println("Enter a Number : ")
        var divisor = reader.nextInt() //takes input

        try {
            if (divisor == 0) {
                throw IllegalArgumentException("Can't divide by zero")
            } else {
                println("5 / $divisor = ${5 / divisor}")
            }
        } catch (e: IllegalArgumentException) {
            println("${e.message}")
        }
        print("would you like to continue : ")

        val readChar = readLine()!!
        choice = readChar.get(0)  //or readChar[0] or reacChar.single()
    }
}