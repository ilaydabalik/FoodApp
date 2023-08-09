package com.example.mobilefinalproject.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.mobilefinalproject.data.datasource.FoodsDataSource
import com.example.mobilefinalproject.data.repo.FoodsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AnasayfaViewModel @Inject constructor(var frepo:FoodsRepository) : ViewModel(){

    fun ara(aramaKelimesi:String){
        CoroutineScope(Dispatchers.Main).launch {
            frepo.ara(aramaKelimesi)
        }
    }

    fun sil(id:Int){
        CoroutineScope(Dispatchers.Main).launch {
            frepo.sil(id)
            foodYukle()
        }
    }
}