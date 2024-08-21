package com.abrebo.filmlerapp.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.abrebo.filmlerapp.data.model.Filmler

@Database(entities = [Filmler::class], version = 1)
abstract class Database:RoomDatabase() {

    abstract fun getFilmlerDao():FilmlerDao

}