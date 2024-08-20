package com.abrebo.kisilerapp.di

import android.content.Context
import androidx.room.Room
import com.abrebo.kisilerapp.data.datasource.KisilerDataSource
import com.abrebo.kisilerapp.data.repo.KisilerRepository
import com.abrebo.kisilerapp.room.KisilerDao
import com.abrebo.kisilerapp.room.Veritabani
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
    fun provideDataSource(kisilerDao: KisilerDao): KisilerDataSource{
        return  KisilerDataSource(kisilerDao)
    }

    @Provides
    @Singleton
    fun provideRepository(kds:KisilerDataSource): KisilerRepository{
        return KisilerRepository(kds)
    }

    @Provides
    @Singleton
    fun provideKisilerDao(@ApplicationContext context: Context): KisilerDao{
        val vt=Room.databaseBuilder(context,Veritabani::class.java,"rehber.sqlite")
            .createFromAsset("rehber.sqlite").build()
        return vt.getKisilerDao()
    }
}