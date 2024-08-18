package com.example.kotlindersleri.nesne_tabanli_programlama

data class Araba(var renk:String,var hiz:Int,var calisiyorMu:Boolean) {

    init {
        println("******** Constructor çalıştı. *********")
    }

    fun calistir(){//Side effect : Fonksiyon ile sınıfın özelliklerini değiştirebilme.
        calisiyorMu = true
        hiz = 5
    }

    fun durdur(){
        calisiyorMu = false
        hiz = 0
    }

    fun hizlan(kacKm:Int){
        hiz+=kacKm//hiz = hiz + kacKm
    }

    fun yavasla(kacKm:Int){
        hiz-=kacKm//hiz = hiz - kacKm
    }

    fun bilgiAl(){
        println("--------------------------")
        println("Renk         : ${renk}")
        println("Hız          : ${hiz}")
        println("Çalışıyor mu : ${calisiyorMu}")
    }
    //this veya self(Swift) : Bulunduğunuz sınıfı
    //super : Kalıtım varsa üst sınıfı temsil eder
}