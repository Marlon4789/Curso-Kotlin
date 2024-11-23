package com.may.cursokotlin.sintaxys

fun main(){
    println("hello world")

    // Variables numericas
    val edad:Int = 23
    val num:Long = 4558965233
    val num2:Float = 78.90f
    val num3:Double = 1258.32566

    // Variables alfanumericas
    val charExample:Char = '@'
    val texto:String = "Soy un texto"
    val texto2 = "hola $texto y me gusta hacerlo..."
    println(texto2)

    // Booleanos
    val boolean:Boolean = true
    val boolean2:Boolean = true

    // Convertir el tipo de dato
    // toInt
    // toFloat
    // toString
    val cantidad:Int = 20
    val compra:Float = 45.90f
    val resultado = compra + cantidad.toFloat()
    println(resultado)

    // Llmar la función
    sumar()
    showEdad(45)

    var resultadoResta:Int = showResta(15, 7)
    println(resultadoResta)

    var resultadoMultiplicar:Int = showMultiplicar(3, 4)
    println(resultadoMultiplicar)
}

// Funciones

// Funciones basicas
fun sumar(){
    println(23*3)
}

// Funciones con parametros de entrada
fun showEdad(inputEdad:Int){
    println("Tengo $inputEdad años")
}

// Funciones con parametros de salida, defoult, simplificar sintaxis
fun showResta(num1:Int=0, num2:Int=0): Int {
    return num1 - num2
}
fun showMultiplicar(numero1:Int=0, numero2:Int=0) = numero1 * numero2