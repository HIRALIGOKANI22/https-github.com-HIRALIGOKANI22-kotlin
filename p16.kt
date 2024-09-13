//sum of natural no using loop

import java.util.Scanner
fun main(args: Array<String>) {
    val s1 = Scanner(System.`in`)

    print("Enter NO:")
    val no= s1.nextInt()

    var tot = 0
    for (i in 1..no)
    {
        tot = tot + i
    }
    println("Total is: $tot")
}

