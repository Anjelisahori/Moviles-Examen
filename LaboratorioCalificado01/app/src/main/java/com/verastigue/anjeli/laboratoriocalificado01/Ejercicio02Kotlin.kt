package com.verastigue.anjeli.laboratoriocalificado01


// Definimos una clase llamada Ejercicio02Kotlin
class Ejercicio02Kotlin {

    // Definimos una función llamada esPalindromo que recibe una palabra como parámetro
    fun esPalindromo(palabra: String): Boolean {
        // Eliminamos los espacios en blanco y convertimos todas las letras a minúsculas
        val palabraLimpia = palabra.replace(" ", "").lowercase()

        // Invertimos la palabra limpia
        val palabraInvertida = palabraLimpia.reversed()

        // Comparamos si la palabra limpia original es igual a la palabra invertida
        return palabraLimpia == palabraInvertida
    }
}

// Función principal para probar que el algoritmo funcione
fun main() {
    // Creamos una instancia de la clase Ejercicio02Kotlin
    val ejercicio = Ejercicio02Kotlin()

    // Probamos el método con los datos de ejemplo
    println(ejercicio.esPalindromo("Racecar"))  // Salida esperada: true
    println(ejercicio.esPalindromo("Kotlin"))   // Salida esperada: false
}
