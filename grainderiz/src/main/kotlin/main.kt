import kotlin.math.exp

fun main(args: Array<String>) {
    var total : Double = 1.0
    var grainsRiz : Double = 1.0
    var case : Int = 1
    fun expoRiz(n : Double) : Double {
        return n*2
    }


    while (case < 64) {
        grainsRiz = expoRiz(grainsRiz)
        case ++
        println("case $case : $grainsRiz grains de riz")
        total += grainsRiz
        println("total = $total")
    }

    println(total)
}
/**
import java.math.BigInteger

var grzRizCompteur : BigInteger = BigInteger.ZERO
var grzRizTotal : BigInteger = BigInteger.ZERO
fun main() {
    for(i in 1..64){
        // 2^(i-1)
        grzRizCompteur = BigInteger("2").pow(i-1)
        grzRizTotal = grzRizTotal.add( grzRizCompteur)
        println("Pour la case $i nous avons $grzRizCompteur")
    }
    println("En totalité il y a $grzRizTotal")
} **/