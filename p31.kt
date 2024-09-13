//list with an object or custom object

data class Stud1(val rno:Int,val nm:String,val mk:Int)
fun main(args: Array<String>) {
    val s = listOf(Stud1(1,"aaa",98),Stud1(2,"Bbb",87))

    for (i in s)
    {
        println("${i.rno} - ${i.nm} - ${i.mk}")
    }
}

