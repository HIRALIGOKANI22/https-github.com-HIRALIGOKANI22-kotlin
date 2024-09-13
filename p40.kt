//Array with loop
fun main(args: Array<String>) {
    val no = arrayOf(1,2,3,4,5)
    println("Second Element"+no[2])
//    modify array
    no[1] = 6
    println("Value is :"+no.joinToString ())
}

