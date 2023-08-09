package com.example.mobilefinalproject.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.mobilefinalproject.R
import com.example.mobilefinalproject.data.entity.Foods
import com.example.mobilefinalproject.databinding.FragmentAnasayfaBinding
import com.example.mobilefinalproject.databinding.FragmentSepetBinding
import com.example.mobilefinalproject.ui.adapter.FoodsAdapter
import com.example.mobilefinalproject.ui.viewmodel.AnasayfaViewModel
import com.example.mobilefinalproject.ui.viewmodel.SepetViewModel
import com.example.mobilefinalproject.ui.viewmodel.UrunDetayViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SepetFragment : Fragment() {

    private lateinit var binding: FragmentSepetBinding
    private lateinit var viewModel: SepetViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_sepet, container, false)
        binding.sepetFragment = this
        binding.sepetToolbarBaslik = "Sepet"
        (activity as AppCompatActivity).setSupportActionBar(binding.toolbarSepet)

        //binding.rvSepet.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)

        val foodList = ArrayList<Foods>()
        val f1 = Foods(1,"Ayran","ayran",15)
        foodList.add(f1)

        val adapter = FoodsAdapter(requireContext(), foodList)
        binding.foodsAdapter = adapter

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        val tempViewModel: SepetViewModel by viewModels()
        viewModel = tempViewModel
    }

    fun sepetTikla(){

    }

}