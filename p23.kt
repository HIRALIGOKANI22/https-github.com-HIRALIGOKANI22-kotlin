//count the digit in integer no

fun main(args: Array<String>) {
    print("Enter Number:")
    var no = readLine()!!.toInt()

    var c = 0

    while (no > 0)
    {
        no = no / 10
        c++
    }
    println("Number of Digit :$c")
}

