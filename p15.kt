//check Positive and negative

import java.util.Scanner
fun main(args: Array<String>) {
    val s1 = Scanner(System.`in`)

    print("Enter NO:")
    val no= s1.nextInt()

    when
    {
        no > 0 ->
            println("Positivr")
        no < 0 ->
            println("Negative")
        else ->
            println("Zero")

    }

}

