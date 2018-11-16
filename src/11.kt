package demo

fun main(args: Array<String>) {
    //Send a variable number of parameters
    println("${getSum(1,2,3,4,5)}")

    //command and define function literals
    val multiply = {num1: Int, num2: Int -> num1 * num2}

    println("5 * 3 = ${multiply(5, 3)}")


}


fun getSum(vararg nums: Int): Int
{
    var sum = 0

    nums.forEach {n -> sum += n }
    //for (x in nums) sum += x
    return sum
}