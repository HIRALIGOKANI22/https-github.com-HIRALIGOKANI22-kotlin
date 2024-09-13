//Enter differ no and total it

import java.util.Scanner

fun main(args: Array<String>) {
    val s1 = Scanner(System.`in`)

    print("How Many Number are Inputed :")
    val no= s1.nextInt()

    var tot = 0
    for (i in 1 .. no)
    {
        print("Enter No:")
        val sno = s1.nextInt()

        tot = tot + sno
    }
    println("Total is: $tot")
}

