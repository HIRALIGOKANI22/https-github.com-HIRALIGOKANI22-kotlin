//list with an object / custom object

public final data class Stud(val rno:Int,val nm:String,val mk:Int)

fun main() {
    val St = listOf(Stud(101,"AAA",84))

    for (i in St)
    {
        println("${i.rno}-${i.nm}-${i.mk}")
    }
}

