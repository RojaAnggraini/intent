package com.Roza.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.ibrah.intent.R

class PindahActivity : AppCompatActivity() {
    companion object{

        const val EXTRA_TEXT = "extra_text"
    }

    private lateinit var tvPenerima : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pindah)


        tvPenerima = findViewById(R.id.tv_terima_data)

        val tvReceived = intent.getStringExtra(EXTRA_TEXT)
        val text = "Text yang dikirim : $tvReceived"

        tvPenerima.text = text
    }
}