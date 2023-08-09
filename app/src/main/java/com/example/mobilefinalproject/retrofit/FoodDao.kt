package com.example.mobilefinalproject.retrofit

import com.example.mobilefinalproject.data.entity.FoodCevap

interface FoodDao {

    //http://kasimdalan.pe.hu/yemekler/tumYemekleriGetir.php

    @GET(yemekler/tumYemekleriGetir.php)
    suspend fun foodYukle() : FoodCevap


}