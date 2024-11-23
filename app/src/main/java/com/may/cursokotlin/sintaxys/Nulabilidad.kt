package com.may.cursokotlin.sintaxys

fun main(){
    // La nulabilidad la representamos así "?"
    // quiere decir que si no es null muestra algo
    // pero si lo es, muestra otra cosa

    var name: String? = "Andres"

    println(name?.get(2) ?: "el dato es null...")
}