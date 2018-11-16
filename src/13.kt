//Higher order function - function that either accepts or returns another function

package demo

fun main(args: Array<String>) {
    //filter is an collection operator

    val numList = 1..20

    val evenList = numList.filter { it % 2 == 0 }
    //function has only one parameter, so no need to declare it. Rather use 'it'
    evenList.forEach { n -> println("$n") }
}