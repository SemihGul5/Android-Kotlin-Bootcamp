package com.abrebo.kisilerapp.data.repo

import com.abrebo.kisilerapp.data.datasource.KisilerDataSource
import com.abrebo.kisilerapp.data.model.Kisiler

class KisilerRepository {
    var kisilerDataSource=KisilerDataSource()

    suspend fun kaydet(kisi_ad:String,kisi_tel:String) = kisilerDataSource.kaydet(kisi_ad, kisi_tel)
    suspend fun guncelle(kisi_id:Int,kisi_ad:String,kisi_tel:String) =kisilerDataSource.guncelle(kisi_id, kisi_ad, kisi_tel)
    suspend fun sil(kisiId: Int) = kisilerDataSource.sil(kisiId)
    suspend fun kisileriYukle(): List<Kisiler> =kisilerDataSource.kisileriYukle()
    suspend fun ara(aramaKelimesi:String): List<Kisiler> = kisilerDataSource.ara(aramaKelimesi)
}