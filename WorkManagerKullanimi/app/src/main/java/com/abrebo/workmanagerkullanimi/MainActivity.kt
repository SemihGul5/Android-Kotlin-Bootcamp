package com.abrebo.workmanagerkullanimi

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.work.Constraints
import androidx.work.NetworkType
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import com.abrebo.workmanagerkullanimi.databinding.ActivityMainBinding
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        binding.button.setOnClickListener {
            /*val calismaKosuluInternet=Constraints.Builder()
                .setRequiredNetworkType(NetworkType.CONNECTED)
                .build()

            val istek= OneTimeWorkRequestBuilder<MyWorker>()
                .setInitialDelay(5,TimeUnit.SECONDS)
                .setConstraints(calismaKosuluInternet)
                .build()

            WorkManager.getInstance(this).enqueue(istek)
            WorkManager.getInstance(this).getWorkInfoByIdLiveData(istek.id).observe(this){
                val durum=it.state.name
                Log.e("Arkaplan işlem sonucu",durum)
            }*/

            val istek= PeriodicWorkRequestBuilder<MyWorkerBildirim>(15,TimeUnit.MINUTES)
                .setInitialDelay(10,TimeUnit.SECONDS)
                .build()
            WorkManager.getInstance(this).enqueue(istek)

        }












    }
}