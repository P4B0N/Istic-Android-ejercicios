package com.p4b0n.pasartxt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_recibe_tx_t.*

class recibeTxT : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recibe_tx_t)

        val texto = findViewById<TextView>(R.id.txtRecibe)
        recogerExtras()
    }

    fun recogerExtras() {

        val extras= getIntent().getExtras()
        val s = extras?.getString("texto")
        txtRecibe.setText(s)

    }
}