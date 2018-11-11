package demo

fun main(args: Array<String>) {
    var myArray = arrayOf(1, 1.23, "Malcolm")

    println(myArray[2])

    myArray[1] = 3.14

    for (element in myArray) {
        println(element)
    }

    println("Array length : ${myArray.size}")

    println("Malcolm in array : ${myArray.contains("Malcolm")}")

    var partArray = myArray.copyOfRange(0, 1)

    println("${partArray.first()}")

    println("Index of Malcolm : ${myArray.indexOf("Malcolm")}")

    //collections

    //array of squares

    var sqArray = Array(5, { x -> x * x }) //arg 1 is array size

    //above, for each of the index value x, it's gonna put x*x in the array

    //type specific arrays

    var arr2: Array<Int> = arrayOf(1, 2, 3)

}