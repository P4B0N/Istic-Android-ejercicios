package com.p4b0n.pasartxt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val texto = findViewById<EditText>(R.id.txtEnvia)
        //val boton = findViewById<Button>(R.id.btnEnviar)

        btnEnviar.setOnClickListener(object: OnClickListener {
            override fun onClick(v:View) {
                lanzarActivity(v, texto.getText().toString())
            }
        })
    }

    fun lanzarActivity(v:View, texto:String) {
        val i = Intent(this, recibeTxT::class.java)

        if (texto == "" || texto == null)
            i.putExtra("texto", "NO INGRESÓ TEXTO")
        else
            i.putExtra("texto", texto)
        startActivity(i)
    }
}
