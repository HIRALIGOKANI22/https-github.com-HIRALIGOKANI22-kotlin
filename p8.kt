//calculate all arithmathic operation
fun main(args: Array<String>) {
    print("Enter First No:")
    val no1= readLine()!!.toInt()

    print("Enter Second No:")
    val no2= readLine()!!.toInt()

    val sum = no1 + no2
    val sub = no1 - no2
    val mul = no1 * no2
    val div = no1 / no2

    println("Total is: $sum")
    println("Minus is: $sub")
    println("Multi is: $mul")
    println("Divide is: $div")
}

