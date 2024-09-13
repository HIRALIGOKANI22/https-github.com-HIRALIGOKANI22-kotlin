//Enter Character and print it asscii
fun main(args: Array<String>) {

    //  dyanamic Input
    print("Enter Character:")
    val dc = readLine()!!.firstOrNull()
    val c1 = dc?.toInt()
    println("Acsii is: $c1")


    //Static Input
    val sc = 'a'
    val c2 = sc.code
    println("Acsii is: $c2")
}

