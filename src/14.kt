//call a function that is going to return dynamically a created function
package demo
fun main(args: Array<String>) {
    val mult3 = makeMathFunc(3) //function that multiplies by 3
    // now value of mult3 is --- fun mult3(num3: Int) { return num3 * 3}  ---
    // since 3 is hardcoded in a way because it was in teh makeMathFunc
    println("5 * 3 = ${mult3(5)}")
}


//return a custom function that is going to multiply the value times the value that's passed in
fun makeMathFunc(num1: Int) : (Int) -> Int = { num3 -> num1 * num3}
//(Int) -> Int //Function will take Int as an argument, and will return an Int
//define in {}

//for = {} in {}, the values taken as arg in (Int) are assigned to values left of ->
//then function definition after ->
//last (or single) statement is returned

