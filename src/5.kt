package demo

fun main(args: Array<String>) {
    val myName = "Satyam Dahiwal"

    val longString = """this is a long
        string"""

    var fName: String = "Satyam"
    var lName = "Dahiwal"

    fName = "sat"

    var fullName = fName + " " + lName

    println("Name : $(fullName)")
    println("1 + 2 = ${1 + 2}")
    println("String Length : ${longString.length}")

    var str1 = "a random string"
    var str2: String = "a random string"

    println("Strings Equal : ${str1.equals(str2)}")  //true or false
    println("Compare : ${str1.compareTo(str2)}")  //returns a number

    println("2nd Index : ${str1.get(2)}")

    println("2nd Index : ${str1[2]}")

    println("Index 2 to 7 : ${str1.subSequence(2,8)}")

    println("Contains random : ${str1.contains("random")}")
}