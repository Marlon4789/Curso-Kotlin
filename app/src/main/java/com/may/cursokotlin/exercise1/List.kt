package com.may.cursokotlin.exercise1

fun main(){

    immutableList()
}

fun immutableList(){
    // Lista de solo lectura
    val readOnly:List<String> = listOf("toby", "sara", "jose", "maria", "camila")

    println(readOnly.size)
    println(readOnly)
    println(readOnly[1])

    // Buscar el primero y el ultimo de una lista
    println(readOnly.first())
    println(readOnly.last())

    // Filtrar
    val example = readOnly.filter { it.contains("a") }
    println(example)

    // Iterar
    readOnly.forEach { weekday -> println(weekday) }

}