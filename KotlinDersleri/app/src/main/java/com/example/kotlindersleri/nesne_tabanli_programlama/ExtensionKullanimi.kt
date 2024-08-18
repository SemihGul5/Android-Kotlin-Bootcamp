package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    val sonuc = 5 carpi 2
    println("Gelen Sonuç : $sonuc")
}

infix fun Int.carpi(sayi:Int) : Int {
    return this * sayi//this = Int sınıfı
}