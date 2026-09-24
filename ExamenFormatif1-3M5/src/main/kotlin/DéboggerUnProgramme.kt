package org.example

fun main(args: Array<String>) {
    var nombre:Int = lireNombre()
}

fun lireNombre() : Int{
    var question = "Veuillez entrer un nombre : "
    while (true){
        println(question)
        var lecture: String = readln()
        var nombre = lecture.toIntOrNull()
        if (nombre != null)
        {
            println("Merci votre nombre est : $nombre")
            return nombre
        }
        else {
            println("Ceci n'est pas un nombre, veuillez entrer un nombre : ")
        }


}
    }  // le probleme de ce code est que la fonction n'avais pas de condition si le nombre etait un chiffre. J'ai mis un condition if else pour voir si c'est un nombre entier