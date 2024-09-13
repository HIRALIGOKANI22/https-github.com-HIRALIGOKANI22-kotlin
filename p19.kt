//Factorial NO

import java.util.Scanner

fun main(args: Array<String>) {
    val s1 = Scanner(System.`in`)

    print("Enter Number :")
    val no= s1.nextInt()

    var fact = 1
    for (i in 1 .. no)
    {
       fact = fact * i
    }
    println("Total is: $fact")
}

