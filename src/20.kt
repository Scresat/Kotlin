//maps

package demo

fun main(args: Array<String>) {
    //map is modifiable collection tha is going to hold key value pair

    //map types - mutable and immutable
    val map = mutableMapOf<Int, Any?>()   //created a map
    //above, key is an integer and value is anything

    //creating map with values intially
    val map2 = mutableMapOf(1 to "Satyam", 2 to 25)  //key value pair mapping without <>

    map[5] = "malcolm"
    map[45] = "Reese"
    map.forEach {x, _ -> println("key : $x Value : ${map[x]}")}
    //second parameter in forEach is _ since it is never used, only x is used
    //two parameters are (key, value) key is x and value above is _
    //if used y instead of _ map[x] can be changed to only y
    
    println("Map Size : ${map.size}")

    //putting a key value pair
    map.put(3, "Hal")
    map.forEach {x, _ -> println("key : $x Value : ${map[x]}")}

}

