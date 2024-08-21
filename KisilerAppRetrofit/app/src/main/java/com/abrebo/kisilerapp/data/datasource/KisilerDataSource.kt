package com.abrebo.kisilerapp.data.datasource

import android.util.Log
import com.abrebo.kisilerapp.data.model.Kisiler
import com.abrebo.kisilerapp.retrofit.KisilerDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class KisilerDataSource(var kisilerDao: KisilerDao) {

    suspend fun kisileriYukle(): List<Kisiler> =
        withContext(Dispatchers.IO){
            return@withContext kisilerDao.kisileriYukle().kisiler
        }

    suspend fun ara(aramaKelimesi:String): List<Kisiler> =
        withContext(Dispatchers.IO){
            return@withContext kisilerDao.ara(aramaKelimesi).kisiler
        }

    suspend fun kaydet(kisi_ad:String,kisi_tel:String){
        kisilerDao.kaydet(kisi_ad,kisi_tel)
    }

    suspend fun guncelle(kisi_id:Int,kisi_ad:String,kisi_tel:String){
        kisilerDao.guncelle(kisi_id, kisi_ad, kisi_tel)
    }

    suspend fun sil(kisiId: Int) {
        kisilerDao.sil(kisiId)
    }
}