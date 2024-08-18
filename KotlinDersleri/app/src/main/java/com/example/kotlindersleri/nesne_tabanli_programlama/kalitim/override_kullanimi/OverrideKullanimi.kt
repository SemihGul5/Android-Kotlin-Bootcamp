package com.example.kotlindersleri.nesne_tabanli_programlama.kalitim.override_kullanimi

fun main() {
    val hayvan = Hayvan()
    val memeli = Memeli()
    val kedi = Kedi()
    val kopek = Kopek()

    hayvan.sesCikar()//Kalıtım yok , kendi sınıfına erişti
    memeli.sesCikar()//Kalıtım var , üst sınıfın metodunu kullandı
    kedi.sesCikar()//Kalıtım var ,kendi metodunu kullandı
    kopek.sesCikar()//Kalıtım var ,kendi metodunu kullandı
}