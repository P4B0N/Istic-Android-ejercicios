package com.P4B0N.primerparcial

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import kotlinx.android.synthetic.main.activity_contador.*

class ContadorActivity : AppCompatActivity() {
    var contador = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contador)

        txtContador.bringToFront()

        btnContar.setOnClickListener {
            txtContador.text = (contador++).toString()
        }

        btnVolverC.setOnClickListener{
            val intentoDos = Intent(this, AJugarActivity ::class.java)
            startActivity(intentoDos)
            Toast.makeText(this, "Que te diviertas \uD83D\uDE42 !!!", Toast.LENGTH_LONG).show()
        }
    }
}