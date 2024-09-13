//Total using scanner
import java.util.*
fun main(args: Array<String>) {
    val s1 = Scanner(System.`in`)

    print("Enter First No:")
    val no1= s1.nextInt()

    print("Enter Second No:")
    val no2= s1.nextInt()

    val tot = no1 + no2

    println("Total is: $tot")
}

