package com.abrebo.filmlerapp.di

import com.abrebo.filmlerapp.data.datasource.FilmlerDataSource
import com.abrebo.filmlerapp.data.repo.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideDataSource():FilmlerDataSource{
        return FilmlerDataSource()
    }

    @Provides
    @Singleton
    fun provideRepository(dataSource: FilmlerDataSource):Repository{
        return Repository(dataSource)
    }
}