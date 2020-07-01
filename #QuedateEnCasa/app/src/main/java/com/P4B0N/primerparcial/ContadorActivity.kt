package com.P4B0N.primerparcial

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
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
            val intentoDos = Intent(this, AJugarActivity::class.java)
            startActivity(intentoDos)
            Toast.makeText(this, "Que te diviertas \uD83E\uDD73 !!!", Toast.LENGTH_SHORT).show()
        }
        btnInfoC.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Información")
            builder.setMessage("Ésto es un contador de objetos." +
                    " Al pulsar el boton CONTAR sumara de a uno en el display")
            builder.setPositiveButton("Gracias!!!",null)
            val dialog: AlertDialog = builder.create()
            dialog.show()
        }
    }
}