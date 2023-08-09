package com.example.mobilefinalproject.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.example.mobilefinalproject.R
import com.example.mobilefinalproject.databinding.FragmentAnasayfaBinding
import com.example.mobilefinalproject.databinding.FragmentSepetBinding
import com.example.mobilefinalproject.databinding.FragmentUrunDetayBinding
import com.example.mobilefinalproject.ui.viewmodel.AnasayfaViewModel
import com.example.mobilefinalproject.ui.viewmodel.SepetViewModel
import com.example.mobilefinalproject.ui.viewmodel.UrunDetayViewModel
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UrunDetayFragment : Fragment() {

    private lateinit var binding: FragmentUrunDetayBinding
    private lateinit var viewModel: UrunDetayViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =  DataBindingUtil.inflate(inflater,R.layout.fragment_urun_detay, container, false)

        val bundle : UrunDetayFragmentArgs by navArgs()
        val food = bundle.food

        binding.ivFood.setImageResource(resources.getIdentifier(food.resim,"drawable",requireContext().packageName))

        binding.urunDetayFragment = this
        binding.toolbarUrunDetay.title = food.ad

        binding.tvAd.text = food.ad
        binding.tvFiyat.text = "${food.fiyat} ₺"

        binding.btnSepet.setOnClickListener {
            Snackbar.make(it,"${food.ad} sepete eklendi", Snackbar.LENGTH_SHORT).show()
        }

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        val tempViewModel:UrunDetayViewModel by viewModels()
        viewModel = tempViewModel
    }

    fun kaydet(ad:String,fiyat:String){

        //Burada logda görüyorum ama normalde sepete göndermem lazım
        viewModel.kaydet(ad,fiyat)
    }

}