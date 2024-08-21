package com.abrebo.filmlerapp.room

import androidx.room.Dao
import androidx.room.Query
import com.abrebo.filmlerapp.data.model.Filmler

@Dao
interface FilmlerDao {

    @Query("SELECT * FROM filmler")
    suspend fun filmleriYukle():List<Filmler>
}