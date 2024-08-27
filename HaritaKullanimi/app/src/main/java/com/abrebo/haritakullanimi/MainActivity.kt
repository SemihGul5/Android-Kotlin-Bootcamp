package com.abrebo.haritakullanimi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.abrebo.haritakullanimi.databinding.ActivityMainBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MainActivity : AppCompatActivity(),OnMapReadyCallback {
    private lateinit var binding:ActivityMainBinding
    private lateinit var mMap:GoogleMap
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

        val mapFragment=supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

        binding.buttonKonumaGit.setOnClickListener {
            val konum=LatLng(41.064785,28.7856463)
            mMap.addMarker(MarkerOptions().position(konum).title("İstanbul")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.resim)))
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(konum,15f))
            mMap.mapType=GoogleMap.MAP_TYPE_SATELLITE
        }


    }

    override fun onMapReady(p0: GoogleMap) {
        mMap=p0
        val konum=LatLng(38.064785,29.7856463)
        mMap.addMarker(MarkerOptions().position(konum).title("Ankara"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(konum,13f))
    }
}