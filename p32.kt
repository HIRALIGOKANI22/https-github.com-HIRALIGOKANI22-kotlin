//using filter

fun main(args: Array<String>) {
    val no = listOf(1,2,3,4,5,6,7,8,9)
    val eno = no.filter { it % 2 == 0}
    println(eno)
}

