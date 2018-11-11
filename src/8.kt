//conditionals

// > < >= <= == !=
// && || !

package demo

fun main(args: Array<String>) {
    val age = 8 //immutable

    if (age < 5) {
        println("Go to preschool")
    } else if(age == 5) {
        println("Go to kindergarten")
    } else if( (age > 5) && (age <= 17))  {
        val grade = age - 5
        println("Go to grade $grade")
    } else {
        println("Go to college")
    }

    // like switch
    when(age) {
        0, 1, 2, 3, 4 -> println("Go to preschool")

        5 -> println("Go to kindergarten")

        in 6..17 -> {
            val grade = age - 5
            println("Go to grade $grade")
        } //range

        else -> println("Go to college")   //default value
    }

}