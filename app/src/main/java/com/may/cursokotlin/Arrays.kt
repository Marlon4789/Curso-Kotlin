package com.may.cursokotlin

fun main(){
    val names = arrayOf("toby", "sara", "jose", "maria")


   var showResult= namesFun(names.size)
   println(showResult + names[2])
}

fun namesFun (names:Int) = when(names){
    in 1..3 -> "hay 3 datos" else -> "hay mas datos"
}