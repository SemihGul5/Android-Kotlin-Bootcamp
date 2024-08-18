package com.abrebo.kisilerapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.abrebo.kisilerapp.data.model.Kisiler
import com.abrebo.kisilerapp.data.repo.KisilerRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AnaSayfaViewModel: ViewModel() {
    var repository=KisilerRepository()
    var kisilerListesi=MutableLiveData<List<Kisiler>>()

    init {
        kisileriYukle()
    }

    fun sil(kisiId: Int){
        CoroutineScope(Dispatchers.Main).launch {
            repository.sil(kisiId)
            kisileriYukle()
        }
    }

    fun kisileriYukle() {
        CoroutineScope(Dispatchers.Main).launch {
           kisilerListesi.value= repository.kisileriYukle()
        }
    }
    fun ara(aramaKelimesi:String){
        CoroutineScope(Dispatchers.Main).launch {
            kisilerListesi.value=repository.ara(aramaKelimesi)
        }
    }
}