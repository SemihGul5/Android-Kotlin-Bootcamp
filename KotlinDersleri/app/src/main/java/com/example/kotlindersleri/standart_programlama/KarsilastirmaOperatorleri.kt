package com.example.kotlindersleri.standart_programlama

fun main() {
    val a = 40
    val b = 50

    val x = 90
    val y = 80

    println("a == b : ${a == b}")
    println("a != b : ${a != b}")
    println("a > b  : ${a > b}")
    println("a >= b : ${a >= b}")
    println("a < b  : ${a < b}")
    println("a <= b : ${a <= b}")

    println("a > b || x > y : ${a > b || x > y}")//OR (VEYA) , false - false ise false olur , diğer durumlar hep true olur.
    println("a > b && x > y : ${a > b && x > y}")//AND (VE) , true - true ise true olur , diğer durumlar hep false olur.

}