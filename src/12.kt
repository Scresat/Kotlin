package demo

fun main(args: Array<String>) {
    //factorial using recursion
    println("5! = ${fact(3)}")
}

fun fact(x: Int) : Int {

    tailrec fun factTail(y: Int, z: Int) : Int
    //takes two arguments, value to be multiplied with and previous multiplication
    {
        if (y == 0) //if value to be multiplied with is zero, stop, and return current multiplicatioin
            return z
    else
            return factTail(y - 1, y * z)
    }

    return factTail(x, 1) //
}
