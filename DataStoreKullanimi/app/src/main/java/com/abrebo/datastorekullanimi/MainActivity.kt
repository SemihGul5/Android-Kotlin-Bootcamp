package com.abrebo.datastorekullanimi

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.abrebo.datastorekullanimi.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val appPref=AppPref(this)
        CoroutineScope(Dispatchers.Main).launch {
            // kayıt işlemleri
            appPref.kayitAd("Ali")
            appPref.kayitYas(23)
            appPref.kayitBoy(1.78)
            appPref.kayitBekar(true)

            val liste=HashSet<String>()
            liste.add("Veli")
            liste.add("Deli")

            appPref.kayitArkadasListe(liste)

            //silme işlemleri
            appPref.silAd()

            //okuma işlemleri
            val gelenAd=appPref.okuAd()
            Log.e("Gelen Ad:",gelenAd)

            val gelenListe=appPref.okuArkadasListe()
            if (gelenListe != null){
                for(i in gelenListe){
                    Log.e("Gelen Arkadaş: ", gelenListe.toString())
                }
            }

            var acilisSayisi=appPref.okuSayac()
            appPref.kayitSayac(++acilisSayisi)
            binding.textViewSayac.text="Açılış sayısı: $acilisSayisi"




        }






    }
}