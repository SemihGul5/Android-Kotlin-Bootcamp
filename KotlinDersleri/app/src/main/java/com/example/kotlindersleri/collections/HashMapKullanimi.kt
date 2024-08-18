package com.example.kotlindersleri.collections

fun main() {
    //Dictionary
    val iller = HashMap<Int,String>()
    iller.put(16,"BURSA")
    iller.put(34,"İSTANBUL")
    iller[6] = "ANKARA"
    println(iller)

    println(iller.get(16))

    iller.put(16,"YENİ BURSA")
    println(iller)

    println(iller.size)
    println(iller.isEmpty())

    for((anahtar,deger) in iller){
        println("$anahtar -> $deger")
    }

    iller.remove(34)
    println(iller)

    iller.clear()
    println(iller)
}