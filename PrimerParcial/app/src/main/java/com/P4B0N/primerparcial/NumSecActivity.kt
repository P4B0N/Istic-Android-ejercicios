package com.P4B0N.primerparcial

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_num_sec.*

class NumSecActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val numeroSecreto = (Math.random() * 100).toInt()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_num_sec)

        btnVerificar.setOnClickListener {
            if (numeroSecreto.toString() == txtNumeroIngresado.text.toString())
            {
                Toast.makeText(this, "Sos un genio adivinaste el número secreto", Toast.LENGTH_LONG).show()
            }
            else
            {
                if (numeroSecreto.toString() < txtNumeroIngresado.text.toString())
                {
                    Toast.makeText(this,"El número secreto es menor",Toast.LENGTH_LONG).show()
                }
                else
                {
                    Toast.makeText(this, "El número secreto es mayor", Toast.LENGTH_LONG).show()
                }
            }
        }

        btnVolverN.setOnClickListener{
            val intentoDos = Intent(this, AJugarActivity ::class.java)
            startActivity(intentoDos)
            Toast.makeText(this, "Que te diviertas \uD83D\uDE42 !!!", Toast.LENGTH_LONG).show()
        }
    }
}