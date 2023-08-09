package com.example.mobilefinalproject.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import org.jetbrains.annotations.NotNull
import java.io.Serializable
@Entity("foods")
data class Foods(@PrimaryKey(name = "food_id") @NotNull var id:Int,
                 @ColumnInfo(name = "food_name") @NotNull var ad:String,
                 var resim:String,
                 @ColumnInfo(name = "food_fiyat") @NotNull var fiyat:Int) : Serializable {

}

