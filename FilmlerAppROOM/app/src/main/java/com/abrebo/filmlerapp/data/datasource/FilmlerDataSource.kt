package com.abrebo.filmlerapp.data.datasource

import com.abrebo.filmlerapp.data.model.Filmler
import com.abrebo.filmlerapp.room.FilmlerDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FilmlerDataSource(var filmlerDao: FilmlerDao) {

    suspend fun filmleriYukle():List<Filmler> =
        withContext(Dispatchers.IO){
            return@withContext filmlerDao.filmleriYukle()
        }






}