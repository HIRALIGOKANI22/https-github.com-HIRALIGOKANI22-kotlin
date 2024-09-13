//to store condition in variable

import java.util.Scanner
fun main(args: Array<String>) {
    val s1 = Scanner(System.`in`)

    print("Enter Year:")
    val y= s1.nextInt()

    val type= if(y % 4 == 0)
    {
        "Leap Year"
    }
    else
    {
       "Leap Year"
    }
    println("$y is $type Year")
}

