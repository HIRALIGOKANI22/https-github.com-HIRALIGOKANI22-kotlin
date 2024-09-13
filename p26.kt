//Armstrong or not

fun main(args: Array<String>) {
    print("Enter Number:")
    var no = readLine()!!.toInt()

    var tot = 0
    var rem = 0
    var no1 = no

    while (no > 0)
    {
        rem = no % 10
        tot = tot + (rem*rem*rem)
        no = no / 10
    }
    if (tot == no1)
    {
        println("Armstrong")
    }
    else
    {
        println("Not Armstrong")
    }
}

