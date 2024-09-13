import java.util.Scanner

//Swap using scanner
fun main(args: Array<String>) {
    val s1 = Scanner(System.`in`)

    print("Enter First No:")
    var no1=s1.nextInt()

    print("Enter Second No:")
    var no2=s1.nextInt()

    println("Before Swapping...")
    println("First No is: $no1")
    println("Second No is: $no2")


    val temp = no1
    no1 = no2
    no2 = temp

    println("After Swapping...")
    println("First No is: $no1")
    println("Second No is: $no2")
}

