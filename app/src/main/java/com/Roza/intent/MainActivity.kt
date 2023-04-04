package com.Roza.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.ibrah.intent.R

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnIntent :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIntent = findViewById(R.id.btnlogin)
        val btnIntentData = findViewById<Button>(R.id.btnregister)
        val btnIntentObject = findViewById<Button>(R.id.btn_pindah_objek)



        btnIntent.setOnClickListener(this)
        btnIntentData.setOnClickListener(this)
        btnIntentObject.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btnlogin -> run {
                val intenbiasa = Intent(this@MainActivity, MainActivity2::class.java)
                startActivity(intenbiasa)
            }
            R.id.btnregister -> run {
                val intentdata = Intent(this@MainActivity, PindahActivity::class.java)
                intentdata.putExtra(PindahActivity.EXTRA_TEXT, "Selamat Datang di Menu Register")
                startActivity(intentdata)
            }
            R.id.btn_pindah_objek -> run {
                val motorcycle = Motorcycle(
                    "Yamaha YZF-R1",
                    2020,
                    "BM 2030 SAR"
                )
                val intentObjek = Intent(this@MainActivity, PindahObjekActivity::class.java)
                intentObjek.putExtra(PindahObjekActivity.EXTRA_MOTORCYCLE, motorcycle)
                startActivity(intentObjek)
            }

        }
    }
}