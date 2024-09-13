//check Leap year or not using scanner

import java.util.Scanner
fun main(args: Array<String>) {
    val s1 = Scanner(System.`in`)

    print("Enter Year:")
    var y=s1.nextInt()

    if(y % 4 == 0)
    {
        println("$y is Leap Year")
    }
    else
    {
        println("$y is not Leap Year")
    }

}

