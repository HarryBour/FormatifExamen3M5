package org.example

import java.io.File
fun main (args: Array<String>){
    if(args.isEmpty()){ // ou tu peux mettre .isEmpty() ou .size != 1
        println("Veuillez mettre un argument")
        return
    }
    val fichier = File(args[0])
    if(!fichier.exists()){
        println("Fichier does not exists!")
        return
    }
    var somme = 0

    val lignes = fichier.readLines()
    for (ligne in lignes){
        println(ligne)
    val nombre = ligne.toIntOrNull()
        if(nombre != null){
            somme += nombre
        }
    }
    println("Somme : $somme")
}