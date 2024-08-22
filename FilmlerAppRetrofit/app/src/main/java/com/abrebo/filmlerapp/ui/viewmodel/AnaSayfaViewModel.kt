package com.abrebo.filmlerapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.abrebo.filmlerapp.data.model.Filmler
import com.abrebo.filmlerapp.data.repo.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class AnaSayfaViewModel @Inject constructor(var repo: Repository):ViewModel() {
    var filmlerListesi=MutableLiveData<List<Filmler>>()


    init {
        filmleriYukle()
    }

    fun filmleriYukle(){
        CoroutineScope(Dispatchers.Main).launch {
            try {
                filmlerListesi.value=repo.filmleriYukle()
            }catch (e:Exception){}


        }
    }
}