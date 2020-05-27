package com.P4B0N.primerparcial

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_perfil.*

class PerfilActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)


        btnAJugar.setOnClickListener{
            val intentoDos = Intent(this, AJugarActivity::class.java)
            startActivity(intentoDos)
            Toast.makeText(this, "Que te diviertas \uD83E\uDD73 !!!", Toast.LENGTH_LONG).show()
        }
        btnRegistro.setOnClickListener {
            val uri = Uri.parse("http://www.google.com/")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
    }
}
