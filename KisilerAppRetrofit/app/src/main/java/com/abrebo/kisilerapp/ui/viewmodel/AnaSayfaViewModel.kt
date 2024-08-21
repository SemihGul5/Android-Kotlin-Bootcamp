package com.abrebo.kisilerapp.ui.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.abrebo.kisilerapp.data.model.Kisiler
import com.abrebo.kisilerapp.data.repo.KisilerRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AnaSayfaViewModel @Inject constructor(var repository: KisilerRepository): ViewModel() {

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
            try {
                kisilerListesi.value= repository.kisileriYukle()
            }catch (e:Exception){
                Log.e("Hata",e.message!!)
            }

        }
    }
    fun ara(aramaKelimesi:String){
        CoroutineScope(Dispatchers.Main).launch {
            try {
                kisilerListesi.value=repository.ara(aramaKelimesi)
            }catch (e:Exception){
                Log.e("Hata",e.message!!)
            }

        }
    }
}