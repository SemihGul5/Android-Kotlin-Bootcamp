package com.abrebo.kisilerapp.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.abrebo.kisilerapp.data.repo.KisilerRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class KisiKayitViewModel @Inject constructor(var repository: KisilerRepository): ViewModel() {

    fun kaydet(kisi_ad:String,kisi_tel:String){
        CoroutineScope(Dispatchers.Main).launch {
            repository.kaydet(kisi_ad, kisi_tel)
        }
    }



}