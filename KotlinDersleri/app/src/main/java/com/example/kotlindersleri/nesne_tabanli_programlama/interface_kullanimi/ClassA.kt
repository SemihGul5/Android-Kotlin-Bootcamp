package com.example.kotlindersleri.nesne_tabanli_programlama.interface_kullanimi

class ClassA : MyInterface {
    override val degisken: Int = 10

    override fun metod1() {
        println("Metod 1 çalıştı")
    }

    override fun metod2(): String {
        return "Metod 2 çalıştı"
    }
}