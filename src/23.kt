//interface

package inter

fun main(args: Array<String>) {
    val tweety = Bird("tweety", true)
    tweety.fly(20.0)
}

//Going to provide for the option to make something flyable

/*Interface is just a contract that states that all fields
and methods in class must implement if it implements the interface
 */

interface flyable {
    //anybody wants to use the interface is going to have a field inside of it called flies which a boolean
    var flies: Boolean
    //it also is going to have a fly method inside of 1+4it that is going to receive a distanceMilesFlown Double
    //and it is not going to do anything
    fun fly(distanceMilesFlown: Double) : Unit
}

//create a bird class that is going to implement that
class Bird constructor(val name: String, override var flies: Boolean = true) : flyable {
    override fun fly(distanceMilesFlown: Double) :Unit {
        if (flies) {
            println("$name flies $distanceMilesFlown")
        }
    }
}