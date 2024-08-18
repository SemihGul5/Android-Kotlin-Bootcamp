package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    //Nesne oluşturma
    val bmw = Araba("Kırmızı",0,false)

    //Okuma
    bmw.bilgiAl()

    //Veri atama
    bmw.renk = "Mavi"
    bmw.hiz = 10
    bmw.calisiyorMu = true

    bmw.bilgiAl()
    bmw.durdur()
    bmw.bilgiAl()
    bmw.calistir()
    bmw.bilgiAl()
    bmw.hizlan(50)
    bmw.bilgiAl()
    bmw.yavasla(15)
    bmw.bilgiAl()


    val sahin = Araba("Beyaz",100,true)

    sahin.bilgiAl()
    sahin.durdur()
    sahin.bilgiAl()
    sahin.calistir()
    sahin.bilgiAl()
    sahin.hizlan(100)
    sahin.bilgiAl()
    sahin.yavasla(40)
    sahin.bilgiAl()
}