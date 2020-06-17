package com.P4B0N.primerparcial

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_registro.*


class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        setup()

   }

    private fun setup() {
        title = "Login"

        btnAcceder.setOnClickListener {
            if (etEmailL.text.isNotEmpty() && etPassL.text.isNotEmpty()) {
                FirebaseAuth.getInstance()
                    .signInWithEmailAndPassword(etEmailL.text.toString(),etPassL.text.toString())
                    .addOnCompleteListener {

                        if (it.isSuccessful) {
                            showPerfil(it.result?.user?.email ?: "")

                        } else {
                            showAlert()
                        }
                    }
            }
            else{
                showAlert()
            }
        }
        btnRegistrarse.setOnClickListener {
            val unIntento = Intent(this,RegistroActivity::class.java)
            startActivity(unIntento)
        }
    }

    private fun showAlert() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("Falló el acceso, intente nuevamente...")
        builder.setPositiveButton("Aceptar",null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    private fun showPerfil(email: String) {
        val perfilIntent = Intent(this,PerfilActivity::class.java).apply {
            putExtra("email",email)
        }
        startActivity(perfilIntent)
    }
}

/*          btnRegistrarse.setOnClickListener {
            val unIntento = Intent(this,RegistroActivity::class.java)
            startActivity(unIntento)
        }

            btnAcceder.setOnClickListener{
            val intentoDos = Intent(this, PerfilActivity::class.java)
            startActivity(intentoDos)
            Toast.makeText(this, "Bienvenido \uD83D\uDE42 !!!", Toast.LENGTH_LONG).show()
        }*/