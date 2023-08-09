package com.example.mobilefinalproject.room

import com.example.mobilefinalproject.data.entity.Foods

@Dao
interface FoodDao {

    @Query("SELECT * FROM foods")
    suspend fun foodsYukle() : List<Foods>

    @Insert
    suspend fun kaydet(food:Foods)

    @Update
    suspend fun guncelle(food: Foods)

    @Delete
    suspend fun sil(food: Foods)

    @Query("SELECT * FROM foods WHERE food_name like '%'||:aramaKelimesi||'%'")
    suspend fun ara(aramaKelimesi:Strin ) : List<Foods>


}