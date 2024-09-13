//Prime or not

fun main(args: Array<String>) {
    print("Enter Number:")
    var no = readLine()!!.toInt()

    var flag = false
    for (i in 2..no - 1) {
        if (no % i == 0) {
            flag = true
            break
        }
    }
    if (!flag == true) {
        println("Prime")
    }
    else{
        println("Not Prime")
    }
}

