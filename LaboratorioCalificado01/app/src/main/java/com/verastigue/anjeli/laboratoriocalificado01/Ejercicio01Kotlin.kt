package com.verastigue.anjeli.laboratoriocalificado01

// Definimos una clase llamada Ejercicio01Kotlin
class Ejercicio01Kotlin {
    // Definimos una función llamada encontrarMayor que recibe tres números enteros
    fun encontrarMayor(a: Int, b: Int, c: Int): Int {
        // Inicializamos una variable 'mayor' con el primer número 'a'
        var mayor = a

        // Comparamos si 'b' es mayor que 'mayor'
        if (b > mayor) {
            // Si 'b' es mayor, actualizamos el valor de 'mayor' con 'b'
            mayor = b
        }

        // Comparamos si 'c' es mayor que el valor actual de 'mayor'
        if (c > mayor) {
            // Si 'c' es mayor, actualizamos el valor de 'mayor' con 'c'
            mayor = c
        }

        // Retornamos el número que es el mayor de los tres
        return mayor
    }
}
// Función principal para probar que el algoritmo funcione
fun main() {
    // Creamos una instancia de la clase Ejercicio01Kotlin
    val ejercicio = Ejercicio01Kotlin()
    // Probamos el método con los datos de ejemplo
    println(ejercicio.encontrarMayor(5, 12, 3))  // Salida esperada: 12
    println(ejercicio.encontrarMayor(9, 4, 9))   // Salida esperada: 9
}

