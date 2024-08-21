package com.abrebo.filmlerapp.di

import android.content.Context
import androidx.room.Room
import com.abrebo.filmlerapp.data.datasource.FilmlerDataSource
import com.abrebo.filmlerapp.data.repo.Repository
import com.abrebo.filmlerapp.room.Database
import com.abrebo.filmlerapp.room.FilmlerDao
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
    fun provideFilmlerDao(@ApplicationContext context: Context):FilmlerDao{
        val db=Room.databaseBuilder(context, Database::class.java,"filmler.sqlite")
            .createFromAsset("filmler.sqlite").build()
        return db.getFilmlerDao()
    }
}