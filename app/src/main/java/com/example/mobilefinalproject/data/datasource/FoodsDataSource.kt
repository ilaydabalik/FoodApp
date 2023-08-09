package com.example.mobilefinalproject.data.datasource

import android.util.Log
import com.example.mobilefinalproject.data.entity.Foods
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FoodsDataSource(var fdao : FoodsDataSource) {

    suspend fun kaydet(ad:String,fiyat:String){

        val yeniFood = Foods(0,ad,resim,fiyat)
        fdao.kaydet()

        //Burada logda görüyorum ama normalde sepete göndermem lazım
        //Log.e("Sipariş Kaydet","$ad - $fiyat")
    }

    suspend fun ara(aramaKelimesi:String){
        Log.e("Yemek Ara",aramaKelimesi)
    }

    suspend fun sil(id:Int){
        Log.e("Yemek Sil",id.toString())
    }

    suspend fun foodsYukle() : List<Foods> =
        withContext(Dispatchers.IO){
            return@withContext fdao.foodsYukle()
        }


}