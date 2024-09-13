//Multiplication Table

import java.util.Scanner

fun main(args: Array<String>) {
    val s1 = Scanner(System.`in`)

    print("Enter Number :")
    val no= s1.nextInt()

    var ans = 0
    for (i in 1 .. 10)
    {
        ans = no * i
        println("$no * $i = $ans")
    }
}

