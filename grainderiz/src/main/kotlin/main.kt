import kotlin.math.exp

fun main(args: Array<String>) {

    var grainsRiz : Double = 1.0
    var case : Int = 1
    fun expoRiz(n : Double) : Double {
        return n*2
    }
    println("case 1 : 1 grain de riz")

    while (case < 64) {
        grainsRiz = expoRiz(grainsRiz)
        case ++
        println("case $case : $grainsRiz grains de riz")

    }

}