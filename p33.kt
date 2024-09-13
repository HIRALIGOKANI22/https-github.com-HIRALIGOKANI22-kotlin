//duplicate array create using map

fun main(args: Array<String>) {
    val no = listOf(1,2,3,4,5,6,7,8,9)
    val no_new = no.map { it * it }
    println(no_new)
}

