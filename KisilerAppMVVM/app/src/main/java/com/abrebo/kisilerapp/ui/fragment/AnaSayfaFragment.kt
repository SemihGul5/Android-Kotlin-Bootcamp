package com.abrebo.kisilerapp.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.navigation.Navigator
import com.abrebo.kisilerapp.R
import com.abrebo.kisilerapp.data.model.Kisiler
import com.abrebo.kisilerapp.databinding.FragmentAnaSayfaBinding
import com.abrebo.kisilerapp.ui.adapter.KisilerAdapter
import com.abrebo.kisilerapp.ui.viewmodel.AnaSayfaViewModel

class AnaSayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnaSayfaBinding
    private lateinit var viewModel:AnaSayfaViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel:AnaSayfaViewModel by viewModels()
        viewModel=tempViewModel
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_ana_sayfa, container, false)
        binding.anaSayfaFragment=this

        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String?): Boolean {
                if(p0!=null){
                    viewModel.ara(p0)
                }
                return true
            }

            override fun onQueryTextChange(p0: String?): Boolean {
                if (p0!=null){
                    viewModel.ara(p0)
                }
                return true
            }

        })

        viewModel.kisilerListesi.observe(viewLifecycleOwner){
            val kisilerListesi=it
            val adapter=KisilerAdapter(requireContext(),kisilerListesi,viewModel)
            binding.adapter=adapter
        }





        return binding.root
    }

    fun fabClicked(it:View){
        Navigation.findNavController(it).navigate(R.id.action_anaSayfaFragment_to_kisiKayitFragment)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onResume() {
        super.onResume()
        viewModel.kisileriYukle()
    }

}