//mutable list

fun main(args: Array<String>) {
    val no = mutableListOf("one","Two","Three")
    println(no)

    no.remove("Two")
    no.add("Four")
    println(no)
}

