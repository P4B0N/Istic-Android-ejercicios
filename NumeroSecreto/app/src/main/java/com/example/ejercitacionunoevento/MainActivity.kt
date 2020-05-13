package com.example.ejercitacionunoevento

import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        val numeroSecreto = (Math.random() * 100).toInt()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnVerificar.setOnClickListener {
            if (numeroSecreto.toString() == txtNumeroIngresado.text.toString())
            {
                Toast.makeText(this, "Sos un genio adivinaste el número secreto", Toast.LENGTH_LONG).show()
            }
            else
            {
                if (numeroSecreto.toString() < txtNumeroIngresado.text.toString())
                {
                    Toast.makeText(this, "El número secreto es menor", Toast.LENGTH_LONG).show()
                }
                else
                {
                    Toast.makeText(this, "El número secreto es mayor", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}
