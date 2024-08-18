package com.example.kotlindersleri.ileri

import java.lang.Exception

fun main() {
    //1.Compile error
    val x = 10
    //x = 300

    //2.Exception : Runtime Error
    val a = 10
    val b = 2

    try {
        println("Sonuç : ${a / b}")
        println("İşlem Tamam")
    }catch (e:Exception){
        println("İkinci sayı sıfır olamaz.")
    }

}