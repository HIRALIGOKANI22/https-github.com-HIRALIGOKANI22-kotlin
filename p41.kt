//Null Array and declaring array
fun main(args: Array<String>) {
    val no = arrayOfNulls<String>(5)
    no[0] = "one"
    no[1] = "Three"
    for (i in no)
    {
        println(i)
    }
}

