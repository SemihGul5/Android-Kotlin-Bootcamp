package com.example.glidekullanimi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.example.glidekullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
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
        resimGoster("kofte.png")
        binding.buttonResim1.setOnClickListener {
            resimGoster("ayran.png")
        }
        binding.buttonResim2.setOnClickListener {
            resimGoster("su.png")
        }


    }
    fun resimGoster(resim:String){
        val url="http://kasimadalan.pe.hu/yemekler/resimler/$resim"
        Glide.with(this).load(url).override(200,200).into(binding.imageView)
    }
}