//receive a list and a function to use on the list

package demo

fun main(args: Array<String>) {
    val myList = arrayOf(1,2,3,4,5)
    //val mult2 = MakeMult(2)
    val mult2 = { num1: Int -> num1 * 2 }

    mathOnList(myList, mult2)
}

fun mathOnList(numList: Array<Int>, myFunc: (num: Int) -> Int) {
    //function takes array of type int as arg1
    //then takes function as arg2 and stores it in myFunc
    //Function taken as an argument -
    // (num: Int) specifies argFxn takes Int as an arg and store it in num
    // -> Int tells that argFxn returns Int
    for (num in numList) {
        println("MathOnList ${myFunc(num)}")
    }

}


fun MakeMult(num: Int) : (Int) -> Int = {num3 -> num3 * num}