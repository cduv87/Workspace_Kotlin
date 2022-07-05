fun main(args: Array<String>) {


    fun getAverage(list: List<Int>): Double {
        var sum: Long = 0
        for (i in list) {
            sum += i.toLong()
        }
        return if (list.isNotEmpty()) sum.toDouble() / list.size else 0.0
    }

    var list = mutableListOf<Int>()


    do {
        println("Saisir une note :")
        val input = Integer. parseInt(readLine()!!)
        if(input in (0..20)){
        list.add(input)
        val avg = getAverage(list)
        println(" moyenne : $avg")} else {
            if (!input.equals(-1)) {
                println("veuillez saisir une note entre 0 et 20")
            }
        }

    }while(!input.equals(-1))
    val avg = getAverage(list)
    println("Moyenne Finale : $avg")



}

