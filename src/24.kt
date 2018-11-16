//Null Safety

//Null safety is build directly into kotlin

fun main() {
    //by default you cannot assign null
    // error : var nullval: String = null

    //you can allow for a null value to be assigned by putting a ?
    var nullval: String? = null

    //function may return null and the situation when that occurs, using ?

    fun returnNull() : String? { //when the function can return null
        return null
    }

    //kotlin is going to provide for the opportunity of a null value if an if statement is going
    //to protect it from danger

    var nullVal2 = returnNull()

    //using smart cast
    if (nullVal2 != null) {
        nullVal2.length
    }
    //above is valid because I am aware of existence of null in this case

    //!! using a force operator to force a null assignment
    var nullVal3 = nullVal2!!.length

    //?: elvis operator to assign a default value if the value could be null
    var nullVal4: String = returnNull() ?: "No Name"
}
