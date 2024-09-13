import java.util.Scanner

//check odd or even using scanner
fun main(args: Array<String>) {
    val s1 = Scanner(System.`in`)

    print("Enter No:")
    var no=s1.nextInt()

    if(no % 2 == 0)
    {
        println("$no No is even")
    }
    else
    {
        println("$no is odd")
    }

}

