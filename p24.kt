//Reverse Number

fun main(args: Array<String>) {
    print("Enter Number:")
    var no = readLine()!!.toInt()

    var tot = 0
    var rem = 0

    while (no > 0)
    {
        rem = no % 10
        tot = tot * 10 +rem
        no = no / 10

    }
    println("Reverse of Digit :$tot")
}

