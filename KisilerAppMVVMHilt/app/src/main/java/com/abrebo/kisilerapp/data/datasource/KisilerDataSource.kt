package com.abrebo.kisilerapp.data.datasource

import android.util.Log
import com.abrebo.kisilerapp.data.model.Kisiler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class KisilerDataSource {

    suspend fun kisileriYukle(): List<Kisiler> =
        withContext(Dispatchers.IO){
            val kisilerListesi=ArrayList<Kisiler>()
            val kisi1=Kisiler(1,"Ali","1111")
            val kisi2=Kisiler(2,"Veli","2222")
            val kisi3=Kisiler(1,"Deli","3333")
            kisilerListesi.add(kisi1)
            kisilerListesi.add(kisi2)
            kisilerListesi.add(kisi3)

            return@withContext kisilerListesi
        }

    suspend fun ara(aramaKelimesi:String): List<Kisiler> =
        withContext(Dispatchers.IO){
            val kisilerListesi=ArrayList<Kisiler>()
            val kisi1=Kisiler(1,"Ali","1111")
            kisilerListesi.add(kisi1)
            return@withContext kisilerListesi
        }

    suspend fun kaydet(kisi_ad:String,kisi_tel:String){
        Log.e("Mesaj","$kisi_ad - $kisi_tel")
    }

    suspend fun guncelle(kisi_id:Int,kisi_ad:String,kisi_tel:String){
        Log.e("Mesaj","$kisi_id - $kisi_ad - $kisi_tel")
    }

    suspend fun sil(kisiId: Int) {
        Log.e("Mesaj","$kisiId")
    }
}