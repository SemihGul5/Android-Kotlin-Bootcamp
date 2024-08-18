package com.abrebo.kisilerapp.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.abrebo.kisilerapp.R
import com.abrebo.kisilerapp.databinding.FragmentKisiDetayBinding

class KisiDetayFragment : Fragment() {
    private lateinit var binding:FragmentKisiDetayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding=FragmentKisiDetayBinding.inflate(inflater, container, false)

        val bundle:KisiDetayFragmentArgs by navArgs()
        val kisi=bundle.Kisi
        binding.editTextKisiAd.setText(kisi.kisi_ad)
        binding.editTextKisiTel.setText(kisi.kisi_tel)


        binding.buttonGuncelle.setOnClickListener {
            val ad=binding.editTextKisiAd.text.toString()
            val tel=binding.editTextKisiTel.text.toString()
            val id=kisi.kisi_id
            guncelle(id,ad,tel)
        }



        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
    fun guncelle(kisi_id:Int,kisi_ad:String,kisi_tel:String){
        Log.e("Mesaj","$kisi_id - $kisi_ad - $kisi_tel")

    }

}