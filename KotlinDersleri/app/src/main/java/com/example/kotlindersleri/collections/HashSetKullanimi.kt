package com.example.kotlindersleri.collections

fun main() {
    val meyveler = HashSet<String>()

    meyveler.add("Elma")
    meyveler.add("Kiraz")
    meyveler.add("Muz")
    println(meyveler)

    meyveler.add("Amasya Elması")
    println(meyveler)

    println(meyveler.elementAt(1))
    println(meyveler.size)
    println(meyveler.isEmpty())

    for (m in meyveler){
        println("Sonuç : $m")
    }

    for ((i,m) in meyveler.withIndex()){
        println("$i. -> $m")
    }

    meyveler.remove("Elma")
    println(meyveler)

    meyveler.clear()
    println(meyveler)
}