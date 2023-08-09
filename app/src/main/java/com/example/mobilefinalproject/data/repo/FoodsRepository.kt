package com.example.mobilefinalproject.data.repo

import android.util.Log
import com.example.mobilefinalproject.data.datasource.FoodsDataSource
import com.example.mobilefinalproject.data.entity.Foods

class FoodsRepository(var fds:FoodsDataSource) {


    suspend fun kaydet(ad:String,fiyat:String) = fds.kaydet(ad,fiyat)

    suspend fun ara(aramaKelimesi: String) = fds.ara(aramaKelimesi)

    suspend fun sil(id:Int) = fds.sil(id)

    //suspend fun foodsYukle() : List<Foods> = fds.foodsYukle()

}