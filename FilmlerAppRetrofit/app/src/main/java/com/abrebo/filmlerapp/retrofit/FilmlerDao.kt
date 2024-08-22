package com.abrebo.filmlerapp.retrofit

import com.abrebo.filmlerapp.data.model.FilmlerCevap
import retrofit2.http.GET

interface FilmlerDao {
    //http://kasimadalan.pe.hu/filmler_yeni/tum_filmler.php

    @GET("filmler_yeni/tum_filmler.php")
    suspend fun filmleriYukle():FilmlerCevap
}