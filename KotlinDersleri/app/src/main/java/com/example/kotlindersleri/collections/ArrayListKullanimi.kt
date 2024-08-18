package com.example.kotlindersleri.collections

fun main() {
    //Tanımlama
    val sayilar = ArrayList<Int>()
    val meyveler = ArrayList<String>()

    //Veri ekleme
    meyveler.add("Elma")//0.
    meyveler.add("Muz")//1.
    meyveler.add("Kiraz")//2.
    println(meyveler)

    //Güncelleme
    meyveler[1] = "Yeni Muz"
    println(meyveler)

    //Insert
    meyveler.add(1,"Portakal")
    println(meyveler)

    //Okuma İşlemi
    println(meyveler[3])
    println(meyveler.get(2))

    println("Boyut : ${meyveler.size}")
    println("Boyut : ${meyveler.count()}")
    println("Boş kontrol : ${meyveler.isEmpty()}")
    println("İçeriyor mu : ${meyveler.contains("Kirazx")}")

    meyveler.reverse()
    println(meyveler)

    meyveler.sort()
    println(meyveler)

    for (meyve in meyveler){
        println("Sonuç : $meyve")
    }

    for ( (indeks,meyve) in meyveler.withIndex()){//enumareted()
        println("$indeks. -> $meyve")
    }

    meyveler.removeAt(2)
    println(meyveler)

    meyveler.clear()
    println(meyveler)
}