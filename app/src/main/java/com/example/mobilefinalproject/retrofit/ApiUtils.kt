package com.example.mobilefinalproject.retrofit

import com.example.mobilefinalproject.data.entity.Foods

class ApiUtils {
    companion object{
        val BASE_URL =  "//kasimdalan.pe.hu/"

        fun getFoodsDao() : FoodDao{
            return RetrofirClient.getClient(BASE_URL).create(FoodDao::class.java)
        }
    }
}