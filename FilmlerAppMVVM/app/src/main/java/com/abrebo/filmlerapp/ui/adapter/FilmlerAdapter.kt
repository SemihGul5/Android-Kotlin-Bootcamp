package com.abrebo.filmlerapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.abrebo.filmlerapp.R
import com.abrebo.filmlerapp.data.model.Filmler
import com.abrebo.filmlerapp.databinding.CardTasarimBinding
import com.abrebo.filmlerapp.databinding.FragmentAnaSayfaBinding
import com.abrebo.filmlerapp.ui.fragment.AnaSayfaFragmentDirections
import com.google.android.material.snackbar.Snackbar

class FilmlerAdapter(var mcontext:Context,var filmListesi:List<Filmler>):RecyclerView.Adapter<FilmlerAdapter.CardTasarimHolder>() {

    inner class CardTasarimHolder(var binding:CardTasarimBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimHolder {
        val binding:CardTasarimBinding= DataBindingUtil.inflate(LayoutInflater.from(mcontext),R.layout.card_tasarim, parent, false)
        return CardTasarimHolder(binding)
    }

    override fun getItemCount(): Int {
        return filmListesi.size
    }

    override fun onBindViewHolder(holder: CardTasarimHolder, position: Int) {
        val film=filmListesi.get(position)
        val t=holder.binding
        t.filmNesnesi=film
        t.imageView.setImageResource(mcontext.resources.getIdentifier(film.resim,"drawable",mcontext.packageName))


        t.buttonSepet.setOnClickListener {
            Snackbar.make(it,"${film.ad} sepete eklendi",Snackbar.LENGTH_SHORT).show()
        }
        t.cardView.setOnClickListener {
            val gecis=AnaSayfaFragmentDirections.actionAnaSayfaFragmentToDetayFragment(film)
            Navigation.findNavController(it).navigate(gecis)
        }


    }

}