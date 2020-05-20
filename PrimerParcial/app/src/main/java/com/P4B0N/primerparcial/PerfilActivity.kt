package com.P4B0N.primerparcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_perfil.*

class PerfilActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)

        btnAJugar.setOnClickListener{
            val intentoDos = Intent(this, AJugarActivity ::class.java)
            startActivity(intentoDos)
            Toast.makeText(this, "Que te diviertas \uD83D\uDE42 !!!", Toast.LENGTH_LONG).show()
        }
    }
}
