package com.example.mobilefinalproject.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.mobilefinalproject.data.repo.FoodsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UrunDetayViewModel @Inject constructor(var frepo:FoodsRepository) : ViewModel() {

    fun kaydet(ad:String,fiyat:String){

        CoroutineScope(Dispatchers.Main).launch {
            frepo.kaydet(ad,fiyat)
        }

    }

}