package com.P4B0N.primerparcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.P4B0N.primerparcial.R
import kotlinx.android.synthetic.main.activity_a_jugar.*


class AJugarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a_jugar)

        btnContador.setOnClickListener{
            val unIntento = Intent(this, ContadorActivity ::class.java)
            startActivity(unIntento)
            Toast.makeText(this, "Vamos a contar cosas!!!", Toast.LENGTH_LONG).show()
        }
        btnAdNum.setOnClickListener{
            val unIntento = Intent(this, NumSecActivity ::class.java)
            startActivity(unIntento)
            Toast.makeText(this, "Vamos a adivinar el número!!!", Toast.LENGTH_LONG).show()
        }
    }
}