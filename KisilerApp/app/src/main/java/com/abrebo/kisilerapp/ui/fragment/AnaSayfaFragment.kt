package com.abrebo.kisilerapp.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.navigation.Navigation
import androidx.navigation.Navigator
import com.abrebo.kisilerapp.R
import com.abrebo.kisilerapp.data.model.Kisiler
import com.abrebo.kisilerapp.databinding.FragmentAnaSayfaBinding
import com.abrebo.kisilerapp.ui.adapter.KisilerAdapter

class AnaSayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnaSayfaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding=FragmentAnaSayfaBinding.inflate(inflater, container, false)

        binding.floatingActionButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_anaSayfaFragment_to_kisiKayitFragment)
        }

        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String?): Boolean {
                if(p0!=null){
                    ara(p0)
                }
                return true
            }

            override fun onQueryTextChange(p0: String?): Boolean {
                if (p0!=null){
                    ara(p0)
                }
                return true
            }

        })
        val kisilerListesi=ArrayList<Kisiler>()
        val kisi1=Kisiler(1,"Ali","1111")
        val kisi2=Kisiler(2,"Veli","2222")
        val kisi3=Kisiler(1,"Deli","3333")
        kisilerListesi.add(kisi1)
        kisilerListesi.add(kisi2)
        kisilerListesi.add(kisi3)

        val adapter=KisilerAdapter(requireContext(),kisilerListesi)
        binding.recyclerView.adapter=adapter



        return binding.root
    }
    fun ara(aramaKelimesi:String){
        Log.e("Mesaj",aramaKelimesi)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}