package com.P4B0N.primerparcial

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_quien_soy.*

class QuienSoyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quien_soy)

        val intentoDos=Intent(this, LoginActivity ::class.java)
        startActivity(intentoDos)

        btnQuienSoy.setOnClickListener{
            val unIntento = Intent(this, QuienSoyActivity::class.java)
            startActivity(unIntento)

        }
    }
}
