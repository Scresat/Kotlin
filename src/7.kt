//ranges - starting and ending values and do all sorts of calculations in between

package demo

fun main(args: Array<String>) {

    val oneTo10 = 1..10
    val alpha = "A".."Z"

    println("R in Alpha : ${"R" in alpha}")

    val tenTo1 = 10.downTo(1)

    val twoTo20 = 2.rangeTo(20)

    //stepthrough range
    val range3 = oneTo10.step(3)

    for (x in range3) println("Range 3 : $x")

    for (x in tenTo1.reversed()) println("Reverse 10 to 1 : $x")


}