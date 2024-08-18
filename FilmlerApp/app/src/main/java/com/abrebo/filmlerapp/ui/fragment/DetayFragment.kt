package com.abrebo.filmlerapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.abrebo.filmlerapp.R
import com.abrebo.filmlerapp.databinding.FragmentDetayBinding

class DetayFragment : Fragment() {
    private lateinit var binding:FragmentDetayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding=FragmentDetayBinding.inflate(inflater, container, false)

        //val bundle:DetayFragmentArgs by navArgs()
        val bundle=DetayFragmentArgs.fromBundle(requireArguments())
        val film=bundle.film

        binding.imageViewFilm.setImageResource(resources.getIdentifier(film.resim,"drawable",requireContext().packageName))
        binding.textViewFiyat.text="${film.fiyat} TL"


        return binding.root
    }

}