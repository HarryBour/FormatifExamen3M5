package org.example
import org.jsoup.Jsoup
fun main() {
    val document = Jsoup.connect("https://info.cegepmontpetit.ca/3M5-Intro-Mobile/testbot/lotr.html").get()
    val images = document.select("img")
    for(image in images) {
        val src = image.attr("src")
        val alt = image.attr("alt")
        println("$src >> $alt")
    }
}