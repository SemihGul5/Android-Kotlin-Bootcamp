package com.abrebo.filmlerapp.di

import android.content.Context
import com.abrebo.filmlerapp.data.datasource.FilmlerDataSource
import com.abrebo.filmlerapp.data.repo.Repository
import com.abrebo.filmlerapp.retrofit.ApiUtils
import com.abrebo.filmlerapp.retrofit.FilmlerDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideDataSource(filmlerDao: FilmlerDao):FilmlerDataSource{
        return FilmlerDataSource(filmlerDao)
    }

    @Provides
    @Singleton
    fun provideRepository(dataSource: FilmlerDataSource):Repository{
        return Repository(dataSource)
    }
    @Provides
    @Singleton
    fun provideFilmlerDao():FilmlerDao{
        return ApiUtils.getFilmlerDao()
    }
}