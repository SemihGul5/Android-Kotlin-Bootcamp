package com.abrebo.kisilerapp.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.abrebo.kisilerapp.data.model.Kisiler

@Database(entities = [Kisiler::class], version = 1)
abstract class Veritabani:RoomDatabase() {
    abstract fun getKisilerDao():KisilerDao
}