package com.example.mobilefinalproject.ui.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.mobilefinalproject.data.entity.Foods
import com.example.mobilefinalproject.databinding.CardTasarimBinding
import com.example.mobilefinalproject.ui.fragment.AnasayfaFragmentDirections
import com.google.android.material.snackbar.Snackbar

class FoodsAdapter(var mContext:Context,var foodsListesi:List<Foods>)
    : RecyclerView.Adapter<FoodsAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(var tasarim:CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val food = foodsListesi.get(position)
        val t = holder.tasarim


        t.imageViewYemek.setImageResource(mContext.resources.getIdentifier(food.resim,"drawable",mContext.packageName))

        t.textViewUrun.text = food.ad
        t.textViewFiyat.text = "${food.fiyat} ₺"


        t.cardViewYemek.setOnClickListener {
            val gecis = AnasayfaFragmentDirections.urunDetayGecis(food = food)
            Navigation.findNavController(it).navigate(gecis)
        }
    }

    override fun getItemCount(): Int {
        return foodsListesi.size
    }
}