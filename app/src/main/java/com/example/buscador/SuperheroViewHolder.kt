package com.example.buscador

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.buscador.databinding.ItemSuperheroBinding

class SuperheroViewHolder (view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemSuperheroBinding.bind(view)

    fun bind(SuperheroItemResponse: SuperheroItemResponse){
        binding.tvSuperheroName.text = SuperheroItemResponse.name
    }
}