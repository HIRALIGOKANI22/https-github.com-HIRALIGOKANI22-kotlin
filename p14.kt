//FIND LARGEST NO GIVEN THREE NO

import java.util.Scanner
fun main(args: Array<String>) {
    val s1 = Scanner(System.`in`)

    print("Enter First NO:")
    val no1= s1.nextInt()

    print("Enter First NO:")
    val no2= s1.nextInt()

    print("Enter First NO:")
    val no3= s1.nextInt()


    if(no1 >= no2 && no1>=no3)
    {
        println("First")
    }
    else if(no2>=no3 && no2>=no1)
    {
       println("Second")
    }
    else
    {
        println("Third")
    }
    when{
        no1 >= no2 && no1 >=no3 ->
            println("First")
        no2 >=no1 && no2 >=no3 ->
            println("Second")
        else ->
            println("Third")
    }
}

