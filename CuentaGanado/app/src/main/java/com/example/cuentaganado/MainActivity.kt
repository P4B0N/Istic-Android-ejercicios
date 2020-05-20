package com.example.cuentaganado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val numeroSecreto = (Math.random() * 100).toInt()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //textoFijo.text="Comenzando"
        btnVerificar.setOnClickListener {
            lblAyuda.text = numeroSecreto.toString()
            if (numeroSecreto.toString() == txtNumeroIngresado.text.toString())
            {
                Toast.makeText(this, "sos un genio ", Toast.LENGTH_LONG).show()
            }
            else
            {
                Toast.makeText(this, "No es el numero ", Toast.LENGTH_LONG).show()
            }
        }
    }
}
