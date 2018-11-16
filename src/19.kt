//collections

//list

package demo

fun main(args: Array<String>) {
    //mutable list (changable)
    var list1 : MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

    //immutable list (unchangable)
    val list2 : List<Int> = listOf(1, 2, 3, 4, 5)

    //add
    list1.add(6)

    //getting element from list
    println("1st : ${list1.first()}")
    println("last : ${list1.last()}")
    println("2nd : ${list1[2]}")

    list1.forEach {n -> println("$n")}
    //sublist
    var list3 = list1.subList(0, 3)  //index 0, 1, 2 creates a shallow copy - by reference
    list3.forEach{println("$it")}

    //size
    println("Size : ${list1.size}")

    //remove all values
    list3.clear() //removing all values in list
    list3.forEach{println("$it")} //will print nothing

    //remove a particular value
    list1.remove(6) //will remove the element of value 6
    list1.forEach {n -> println("After remove : $n")}

    //ABOVE TWO COMMANDS - CLEAR AND REMOVE - WILL REMOVE VALUES 1, 2, 3 AND 6 FROM LIST1
    //ONLY REMAINING VALUES IN LIST WILL BE 6
    //EVEN THOUGH WE USED CLEAR() ON LIST3, IT ALSO CLEARED THOSE VALUES IN LIST1
    //BECAUSE LIST3 WAS TAKES AS A SUBLIST OF LIST1 AND IT IS BY REFERENCE

    list1.clear()

    //USE FOLLOWING METHOD TO DEEPCOPY
    list1 = mutableListOf(1, 2, 3, 4, 5)

    list3 = list1.subList(0, 3).toMutableList()

    list3.clear()

    list1.forEach{println("Mutable : $it")}

    //remove a value from its index
    list1.removeAt(4)

    //change a value at an index
    list1[2] = 10  //will change value of list1[2] from 3 to 10



}