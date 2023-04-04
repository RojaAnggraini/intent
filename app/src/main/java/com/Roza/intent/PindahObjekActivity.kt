package com.Roza.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.ibrah.intent.R

class PindahObjekActivity : AppCompatActivity() {

    private lateinit var tvPenerimaObjek : TextView

    companion object {
        const val EXTRA_MOTORCYCLE ="extra_motorcycle"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pindah_objek)

        tvPenerimaObjek = findViewById(R.id.tv_penerima_objek)

        val motorcycle: Motorcycle = intent.getParcelableExtra<Motorcycle>(EXTRA_MOTORCYCLE) as Motorcycle
        val text ="Merk : ${motorcycle.merk.toString()} \nTahun : ${motorcycle.tahun.toString()} \nPlat : ${motorcycle.plat.toString()}"
        tvPenerimaObjek.text = text
    }
}