package com.abrebo.kisilerapp.di

import com.abrebo.kisilerapp.data.datasource.KisilerDataSource
import com.abrebo.kisilerapp.data.repo.KisilerRepository
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
    fun provideDataSource(): KisilerDataSource{
        return  KisilerDataSource()
    }

    @Provides
    @Singleton
    fun provideRepository(kds:KisilerDataSource): KisilerRepository{
        return KisilerRepository(kds)
    }
}