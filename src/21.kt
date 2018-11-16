//classes

package demo

fun main(args: Array<String>) {

    //creating an Animal object
    val bowser = Animal("bow", 20.0, 13.5)
    bowser.getInfo()
}

//no static methods
//classes are going to be marked as final by default unless they are marked as open

open class Animal(val name: String, //defining attributes
                  var height: Double,
                  var weight: Double) {
    //object is going to initialized in an init function
    //This is going to be where you will verify if a value is okay or not
    //create a regex that is going to match for a number any place inside of a string
    //making it invalid to have number in animals name
    init {//defining valid values for the attributes
        val regex = Regex(".*\\d+.*")  //creating regex for checking to see if there is number in string

        //if following requirements won't match, an illegal argument exception is going to be thrown

        // require(requirement) {if requirement didn't match, do this}
        require(!name.matches(regex)) {"Animal name can't contain numbers"}
        //above requirement is that name does not match regex. If it matches, then exception in curly braces

        require(height > 0) {"Height must be greater than 0"}
        require(weight > 0) {"Weight must be greater than 0"}

    }

    //methods
    //Use 'open' if wanted to provide for the option to overwrite methods

    open fun getInfo(): Unit{
        println("$name is $height tall and weighs $weight")
    }
}