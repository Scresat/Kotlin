//inheritance

package demo

fun main(args: Array<String>) {
    val bowser = Ani("bowser", 20.0, 13.5)
    bowser.getInfo()

    val spot = Dog("Spot", 20.0, 14.5, "Paul Smith")
    spot.getInfo()
}

open class Ani(val name: String, var height: Double, var weight: Double) {
    init {
        val regex = Regex(".*\\d+.*")

        require(!name.matches(regex)) {"Animal name can't contain numbers"}
        require(height > 0) {"Height must be greater than 0"}
        require(weight > 0) {"Weight must be greater than 0"}
    }

    open fun getInfo(): Unit {
        println("$name is $height tall and weighs $weight")
    }
}

//create a new class -dog and it is going to inherit
//no open, so no inheritance from dog
class Dog(name: String,
          height: Double,
          weight: Double,
          var owner: String) : Ani(name, height, weight) {
                                    //name height and weight be initialized over inside of animal

    override fun getInfo(): Unit{
        println("$name is $height tall and weighs $weight and is owned by $owner")
    }
}
//Created 'Dog' which inherits from Ani