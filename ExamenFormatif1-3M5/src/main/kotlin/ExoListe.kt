package org.example

fun jourParMois(n: Int): List<Int>  {
    if (n > 12){
        throw IllegalArgumentException("Le nombre de mois ne peut pas dépasser 12.")
    }
    val jours = listOf(31,28,31,30,31,31,30,31,30,31,31,30,31)
    val resultat = mutableListOf<Int>()

    for(i in 0..n){
            resultat.add(jours[i])
    }
    return resultat

}

fun tri (nombres : List<Double>) : List<Double>{
   return nombres.sorted()
}
fun main ()
{
    println(jourParMois(1))
    println(jourParMois(7))
    println(jourParMois(12))

    println(tri(listOf(5.5,9.0,2.1,1.2)))

    try {
        println(jourParMois(13))
    }
    catch (e: Exception){
        println(e.message)
    }
}