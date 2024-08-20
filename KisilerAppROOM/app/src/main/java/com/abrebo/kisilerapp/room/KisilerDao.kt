package com.abrebo.kisilerapp.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.abrebo.kisilerapp.data.model.Kisiler

@Dao
interface KisilerDao {

    @Query("SELECT * FROM kisiler")
    suspend fun kisileriYukle():List<Kisiler>

    @Insert
    suspend fun kaydet(kisiler: Kisiler)

    @Update
    suspend fun guncelle(kisiler: Kisiler)

    @Delete
    suspend fun sil(kisiler: Kisiler)

    @Query("SELECT * FROM kisiler WHERE kisi_ad like '%' ||:aramaKelimesi|| '%' ")
    suspend fun ara(aramaKelimesi:String):List<Kisiler>
}