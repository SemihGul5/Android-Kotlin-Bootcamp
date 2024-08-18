package com.abrebo.filmlerapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.abrebo.filmlerapp.R
import com.abrebo.filmlerapp.data.model.Filmler
import com.abrebo.filmlerapp.databinding.FragmentAnaSayfaBinding
import com.abrebo.filmlerapp.ui.adapter.FilmlerAdapter

class AnaSayfaFragment : Fragment() {
    private lateinit var binding:FragmentAnaSayfaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding=FragmentAnaSayfaBinding.inflate(inflater, container, false)


        val filmlerListesi=ArrayList<Filmler>()
        val f1=Filmler(1,"Django","django",24)
        val f2=Filmler(1,"Interstellar","interstellar",32)
        val f3=Filmler(1,"Inception","inception",16)
        val f4=Filmler(1,"The Hateful Eight","thehatefuleight",28)
        val f5=Filmler(1,"The Pianist","thepianist",18)
        val f6=Filmler(1,"Anadoluda","anadoluda",10)
        filmlerListesi.add(f1)
        filmlerListesi.add(f2)
        filmlerListesi.add(f3)
        filmlerListesi.add(f4)
        filmlerListesi.add(f5)
        filmlerListesi.add(f6)

        val adapter=FilmlerAdapter(requireContext(),filmlerListesi)
        binding.recyclerView.adapter=adapter





        return binding.root
    }

}