package com.may.cursokotlin.sintaxys

fun main(){

    condicionales()
    getDay(20)

    // Variable "any" puede ser cualquier dato
    showResult(true)

    println(showAnimal(1))
}

fun condicionales(){
    //if else
    val name:String = "Anonimo"

    if(name.uppercase() == "MARLON"){
        println("La variable correcta es: ${name.uppercase()}")
    }else if(name.lowercase() == "anonimo"){
        println("El nombre es anonimo :)")
    }else{
        println("NO existe los datos...")
    }
}

// condicional when
fun getDay(day:Int){
    when(day){
        1 -> println("lunes")
        2 -> println("martes")
        3 -> println("miercoles")
        4 -> println("jueves")
        5 -> println("viernes")

        // Simplificar
        6,7 -> println("Fin de semana")

        // Rango
        in 8..15 -> println("Llega la quincena!!!!")

        // Operador si no esta "!"
        !in 1..15 -> println("No estuvo trabajando")

        else -> println("No es valido...")
    }

}

// Variable "any" puede ser cualquier dato
fun showResult(value:Any){
    when(value){
        is Int ->println(value+value)
        is String ->println(value)
        is Boolean-> if (value) println("si es booleano")
    }
}

// Forma 1
fun showAnimal(animal:Int):String {
    return when(animal){
        1 -> "Es un gato"
        2 -> "Es un caballo"
        else -> "Algo salio mal..."
    }
}
//forma 2 simplificada
fun showPlace(place:Int) = when(place){
        1 -> "Pereira"
        2 -> "Medellin"
        else -> "Algo salio mal..."
}
