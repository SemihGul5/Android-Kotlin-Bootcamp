package com.abrebo.kisilerapp.ui.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.abrebo.kisilerapp.R
import com.abrebo.kisilerapp.data.model.Kisiler
import com.abrebo.kisilerapp.databinding.CardTasarimBinding
import com.abrebo.kisilerapp.databinding.FragmentAnaSayfaBinding
import com.abrebo.kisilerapp.ui.fragment.AnaSayfaFragmentDirections
import com.abrebo.kisilerapp.ui.viewmodel.AnaSayfaViewModel
import com.abrebo.kisilerapp.util.gecisYap
import com.google.android.material.snackbar.Snackbar

class KisilerAdapter(var mContext:Context, var kisilerListesi:List<Kisiler>,var viewModel:AnaSayfaViewModel)
    :RecyclerView.Adapter<KisilerAdapter.CardTasarimHolder>() {

    inner class CardTasarimHolder(var binding: CardTasarimBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimHolder {
        val binding:CardTasarimBinding= DataBindingUtil.inflate(LayoutInflater.from(mContext),R.layout.card_tasarim, parent, false)
        return CardTasarimHolder(binding)
    }

    override fun getItemCount(): Int {
        return kisilerListesi.size
    }

    override fun onBindViewHolder(holder: CardTasarimHolder, position: Int) {
        val kisi=kisilerListesi.get(position)
        val t=holder.binding

        t.kisiNesnesi=kisi


        t.imageViewSil.setOnClickListener {
            Snackbar.make(it,"${kisi.kisi_ad} silinsin mi?",Snackbar.LENGTH_LONG)
                .setAction("EVET"){
                    viewModel.sil(kisi.kisi_id)
                }
                .show()

        }
        t.cardView.setOnClickListener {
            val gecis=AnaSayfaFragmentDirections.actionAnaSayfaFragmentToKisiDetayFragment(kisi)
            Navigation.gecisYap(it,gecis)
        }
    }

}