package com.abrebo.kisilerapp.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.abrebo.kisilerapp.data.repo.KisilerRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class KisiDetayViewModel: ViewModel() {
    var repository=KisilerRepository()

    fun guncelle(kisi_id:Int,kisi_ad:String,kisi_tel:String){
        CoroutineScope(Dispatchers.Main).launch {
            repository.guncelle(kisi_id, kisi_ad, kisi_tel)
        }
    }
}