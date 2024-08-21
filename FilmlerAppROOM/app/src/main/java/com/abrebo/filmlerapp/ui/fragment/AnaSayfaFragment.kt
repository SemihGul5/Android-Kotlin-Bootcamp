package com.abrebo.filmlerapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.abrebo.filmlerapp.R
import com.abrebo.filmlerapp.data.model.Filmler
import com.abrebo.filmlerapp.databinding.FragmentAnaSayfaBinding
import com.abrebo.filmlerapp.ui.adapter.FilmlerAdapter
import com.abrebo.filmlerapp.ui.viewmodel.AnaSayfaViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AnaSayfaFragment : Fragment() {
    private lateinit var binding:FragmentAnaSayfaBinding
    private lateinit var viewModel:AnaSayfaViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel:AnaSayfaViewModel by viewModels()
        viewModel=tempViewModel
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_ana_sayfa, container, false)

        binding.anasayfaToolbarBaslik="Ana Sayfa"


        viewModel.filmlerListesi.observe(viewLifecycleOwner){
            val filmlerListesi=it
            val adapter=FilmlerAdapter(requireContext(),filmlerListesi)
            binding.filmlerAdapter=adapter
        }






        return binding.root
    }

}