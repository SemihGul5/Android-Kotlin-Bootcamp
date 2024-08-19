package com.abrebo.filmlerapp.data.repo

import com.abrebo.filmlerapp.data.datasource.FilmlerDataSource
import com.abrebo.filmlerapp.data.model.Filmler

class Repository {
    var dataSource=FilmlerDataSource()

    suspend fun filmleriYukle():List<Filmler> = dataSource.filmleriYukle()
}