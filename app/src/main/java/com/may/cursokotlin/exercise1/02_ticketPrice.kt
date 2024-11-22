package com.may.cursokotlin.exercise1

/**
 * Las entradas de cine suelen tener un precio diferente según la edad de los espectadores.

En el código inicial que se proporciona en el siguiente fragmento de código, escribe un programa que calcule los precios de estas entradas basados en la edad:

Un precio de entrada infantil de USD 15 para personas de 12 años o menos.
Un precio de entrada estándar de USD 30 para personas de entre 13 y 60 años. Los lunes, un precio estándar con descuento de USD 25 para el mismo grupo etario
Un precio para adultos mayores de USD 20 para personas de 61 años o más (asumimos que la edad máxima de un espectador es de 100 años)
Un valor de -1 para indicar que el precio no es válido cuando un usuario ingresa una edad fuera de las especificaciones

RESULTADO:
- The movie ticket price for a person aged 5 is $15.
- The movie ticket price for a person aged 28 is $25.
- The movie ticket price for a person aged 87 is $20.
 */

fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is  \$${ticketPrice(child,isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior,isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when (age) {
        in 0..12 -> 15
        in 13..60 -> if (isMonday) 25 else 30
        in 61..100 -> 20
        else -> -1
    }
}





// child ticket, $15 de 12 años o menos
// adult ticket, $30 de 13 a 60 años, los lunes.
// adult ticket, precio estandar $25
// sinior ticket, $20 de 61 a 100 años
// un valor -1, indica que no es valido
/*
fun main(){

    val result = ticketPrice(23)
    val resultDay = day(true)

    println("funciona $result y ademas es ${resultDay.toString()}")
}

fun ticketPrice(age:Int): Int{
     return when(age){
        in 1..12 -> 15
        in 13 ..60 -> 30
        in 61..100 -> 20

        else -> -1
    }
}

fun day(value:Boolean): Int{
    when(value){
        true -> 45
        false -> 41
    }
}*/