package com.example.mobilefinalproject.room

import com.example.mobilefinalproject.data.entity.Foods

@Database(entities = [Foods::class], version = 1)
abstract class Veritabani : RoomDatabase() {

    abstract  fun getFoodsDao() : FoodDao

}