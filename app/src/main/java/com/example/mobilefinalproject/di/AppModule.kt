package com.example.mobilefinalproject.di

import android.content.Context
import com.example.mobilefinalproject.data.datasource.FoodsDataSource
import com.example.mobilefinalproject.data.repo.FoodsRepository
import com.example.mobilefinalproject.room.FoodDao
import com.example.mobilefinalproject.room.Veritabani
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

    fun provideFoodsRepository(fds:FoodsDataSource) : FoodsRepository{
        return FoodsRepository(fds)
    }

    @Provides
    @Singleton
    fun provideFoodsDataSource(kdao : FoodDao) : FoodsDataSource{
        return FoodsDataSource(kdao)
    }

    @Provides
    @Singleton
    fun provideFoodsDao(@ApplicationContext context: Context) : FoodDao{
        val vt = Room.databaseBuilder(context,Veritabani::class.java,"foods.sqlite").createFromAsset("foods.sqlite").build()
        return vt.getFoodsDao()
    }

}