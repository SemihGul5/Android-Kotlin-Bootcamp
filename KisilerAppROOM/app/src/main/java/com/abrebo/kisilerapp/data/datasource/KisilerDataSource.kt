package com.abrebo.kisilerapp.data.datasource

import android.util.Log
import com.abrebo.kisilerapp.data.model.Kisiler
import com.abrebo.kisilerapp.room.KisilerDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class KisilerDataSource(var kisilerDao: KisilerDao) {

    suspend fun kisileriYukle(): List<Kisiler> =
        withContext(Dispatchers.IO){
            return@withContext kisilerDao.kisileriYukle()
        }

    suspend fun ara(aramaKelimesi:String): List<Kisiler> =
        withContext(Dispatchers.IO){
            return@withContext kisilerDao.ara(aramaKelimesi)
        }

    suspend fun kaydet(kisi_ad:String,kisi_tel:String){
        val kisi=Kisiler(0,kisi_ad,kisi_tel)
        kisilerDao.kaydet(kisi)
    }

    suspend fun guncelle(kisi_id:Int,kisi_ad:String,kisi_tel:String){
        val kisi=Kisiler(kisi_id,kisi_ad,kisi_tel)
        kisilerDao.guncelle(kisi)
    }

    suspend fun sil(kisiId: Int) {
        val kisi=Kisiler(kisiId,"","")
        kisilerDao.sil(kisi)
    }
}