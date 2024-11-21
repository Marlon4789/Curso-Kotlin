package com.may.cursokotlin.exercise1

fun main(){
   println( showAlertMessage(78))
}

fun showAlertMessage(value: Int?) = when(value){
    0 -> "No hay mensajes"
    in 1..99 -> "Tienes $value mensajes"
    !in 1..99 -> "Tiene mas de 99+ mensajes"
    else -> "No valido..."

}