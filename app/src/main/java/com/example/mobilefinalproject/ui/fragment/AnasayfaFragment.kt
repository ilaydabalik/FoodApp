package com.example.mobilefinalproject.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.mobilefinalproject.R
import com.example.mobilefinalproject.data.entity.Foods
import com.example.mobilefinalproject.databinding.FragmentAnasayfaBinding
import com.example.mobilefinalproject.ui.adapter.FoodsAdapter
import com.example.mobilefinalproject.ui.viewmodel.AnasayfaViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding
    private lateinit var viewModel: AnasayfaViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.toolbarAnasayfa.title = "YEMEK SÖYLE"

        binding.rvYemek.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        binding.fab.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sepetGecis)
        }

        val foodsListesi = ArrayList<Foods>()
        val f1 = Foods(1,"Ayran","ayran",15)
        val f2 = Foods(2,"Kola","colaa",30)
        val f3 = Foods(3,"Fanta","fanta",30)
        val f4 = Foods(4,"Hamburger","hamburger",150)
        val f5 = Foods(5,"Indian","indian",250)
        val f6 = Foods(6,"Kebap","kebap",250)
        val f7 = Foods(7,"Makarna","makarna",125)
        val f8 = Foods(8,"Margarita","margarita",180)
        val f9 = Foods(9,"Patates Kızartması","patates",50)
        val f10 = Foods(10,"Pizza","pizza",250)
        foodsListesi.add(f1)
        foodsListesi.add(f2)
        foodsListesi.add(f3)
        foodsListesi.add(f4)
        foodsListesi.add(f5)
        foodsListesi.add(f6)
        foodsListesi.add(f7)
        foodsListesi.add(f8)
        foodsListesi.add(f9)
        foodsListesi.add(f10)

        val foodAdapter = FoodsAdapter(requireContext(),foodsListesi)
        binding.rvYemek.adapter = foodAdapter

        return binding.root
    }

    override fun onResume() {
        super.onResume()

        viewModel.foodYukle()
    }





}