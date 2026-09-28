package org.example

import org.jsoup.Jsoup

fun main (){
    val document = Jsoup.connect("https://info.cegepmontpetit.ca/3M5-Intro-Mobile/testbot/courrielsDansA.html").get()
    val liens = document.select("a")

for (lien in liens){
    val href = lien.attr("href")
    if (href.startsWith("mailto:")){
        val nom = lien.text()
        val courriel = href.removePrefix("mailto:")
    println("$nom a pour $courriel")
    }
}
}