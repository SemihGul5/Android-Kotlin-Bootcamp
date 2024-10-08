package com.abrebo.kisilerapp.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.abrebo.kisilerapp.R
import com.abrebo.kisilerapp.databinding.FragmentKisiKayitBinding
import com.abrebo.kisilerapp.ui.viewmodel.KisiKayitViewModel

class KisiKayitFragment : Fragment() {
    private lateinit var binding:FragmentKisiKayitBinding
    private lateinit var viewModel:KisiKayitViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel:KisiKayitViewModel by viewModels()
        viewModel=tempViewModel
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_kisi_kayit, container, false)
        binding.kisiKayitFragment=this
        binding.kisiKayitToolbarBaslik="Kişi Kayıt"



        return binding.root
    }
    fun buttonKaydet(kisi_ad:String,kisi_tel:String){
        viewModel.kaydet(kisi_ad, kisi_tel)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}