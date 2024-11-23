package com.may.cursokotlin.sintaxys

fun main(){

    mutable()
    //immutableList()
}

fun mutable(){
    val animals:MutableList<String> = mutableListOf("perro", "zorro", "aguila")

    // añadir valores
    animals.add(0, "tiburon")

    // si es vacio
    if (animals.isEmpty()){
        println("No hay animales...")
    }else if (animals.isNotEmpty()){
        animals.forEach { println(it) }
        println("Existen ${animals.size} animales: $animals")
    }

    println(animals)
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