package com.P4B0N.primerparcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_registro.*


class RegistroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        btnRegistro.setOnClickListener{
            val unIntento = Intent(this, LoginActivity ::class.java)
            startActivity(unIntento)
            Toast.makeText(this, "Gracias por registrarse", Toast.LENGTH_LONG).show()
        }
    }
}