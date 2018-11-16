//collection operators - work on any type of collections - Array, List, Maps, etc

package demo

fun main(args: Array<String>) {
    //Sum all the values in the list

    //reduce {}
    val numList = 1..5
    numList.forEach{n -> println("$n")}
    val listSum = numList.reduce { x, y -> x + y} //return type of it is Int
    println("Reduce sum = $listSum")

    //fold() {} - takes an initial value to start with
    val listSumFold = numList.fold(5) {x, y -> x + y}
    println("Fold Sum = $listSumFold")

    //Check if any (at least one) value in the condition meet a condition
    val oddList = arrayOf(1, 3, 5, 7, 9)
    println("Evens in 1, 3, 5, 7, 9 : ${oddList.any {it % 2 == 0} }") //return true or false

    //check if all values in a collection meets a condition
    println("All odd in 1, 3, 5, 7, 9 : ${ oddList.all {it % 2 != 0} }")

    //return a list of values that meet a certain condition
    val big3 = numList.filter {n -> n > 3} //returns elements which are greater than 3
    //val big3 = numList.filter {it > 3}
    big3.forEach {n -> println("Greater than 3 = $n")}

    //Perform an action on every single value and return a new list
    val times2 = numList.map {it * 2}
    times2.forEach {println("Times 2 = $it")}
    //times2.forEach { n -> println("Times 2 = $n") }
}