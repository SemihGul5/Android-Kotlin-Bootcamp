package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    val f = Fonksiyonlar()

    f.selamla1()

    val gelenSonuc = f.selamla2()
    println("Gelen Sonuç : $gelenSonuc")

    f.selamla3("Zeynep")

    val gelenToplam = f.toplama(10,20)
    println("Gelen Toplam : $gelenToplam")

    f.carp(2,10,"Zeynep")
}