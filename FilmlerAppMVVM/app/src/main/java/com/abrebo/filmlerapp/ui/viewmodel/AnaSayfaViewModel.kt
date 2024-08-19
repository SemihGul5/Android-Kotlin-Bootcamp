package com.abrebo.filmlerapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.abrebo.filmlerapp.data.model.Filmler
import com.abrebo.filmlerapp.data.repo.Repository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AnaSayfaViewModel:ViewModel() {
    var repo=Repository()
    var filmlerListesi=MutableLiveData<List<Filmler>>()


    init {
        filmleriYukle()
    }

    fun filmleriYukle(){
        CoroutineScope(Dispatchers.Main).launch {
            filmlerListesi.value=repo.filmleriYukle()
        }
    }
}