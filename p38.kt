//mutable list
fun main(args: Array<String>) {
    val no = mutableListOf("one","two","three","Four")
        println(no)
        no.remove("two")
        no.add("Five")
        println(no)
}

