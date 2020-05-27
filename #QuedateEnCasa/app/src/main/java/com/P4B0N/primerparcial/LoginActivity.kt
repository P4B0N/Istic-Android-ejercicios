package com.P4B0N.primerparcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnAcceder.setOnClickListener{
            val intentoDos = Intent(this, PerfilActivity::class.java)
            startActivity(intentoDos)
            Toast.makeText(this, "Bienvenido \uD83D\uDE42 !!!", Toast.LENGTH_LONG).show()
        }
        btnRegistrarse.setOnClickListener{
            val unIntento = Intent(this, RegistroActivity::class.java)
            startActivity(unIntento)
        }
    }
}

