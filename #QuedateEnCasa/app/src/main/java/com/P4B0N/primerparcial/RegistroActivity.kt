package com.P4B0N.primerparcial

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.gms.tasks.Task
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_registro.*


class RegistroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)


        //Analitycs events
        val analytics = FirebaseAnalytics.getInstance(this)
        val bundle = Bundle()
        bundle.putString("Mensaje","Estamos adentro...")
        analytics.logEvent("Iniciando",bundle)

        //Setup
        setup()
    }

    private fun setup() {

        title = "Registro"

        btnRegistro.setOnClickListener {
            if (etEmail.text.isNotEmpty() && etPass.text.isNotEmpty()) {
                FirebaseAuth.getInstance()
                    .createUserWithEmailAndPassword(etEmail.text.toString(),etPass.text.toString())
                    .addOnCompleteListener {

                        if (it.isSuccessful) {
                            showLogin(it.result?.user?.email ?: "")

                        } else {
                            showAlert()
                        }
                    }
            }else{
                showAlert()
            }
        }

/*        btnAcceder.setOnClickListener {
            if (etEmail.text.isNotEmpty() && etPass.text.isNotEmpty()) {
                FirebaseAuth.getInstance()
                    .signInWithEmailAndPassword(etEmail.text.toString(),etPass.text.toString())
                    .addOnCompleteListener {

                        if (it.isSuccessful) {
                            showPerfil(it.result?.user?.email ?: "")

                        } else {
                            showAlert()
                        }
                    }
            }
        }*/
    }

    private fun showAlert() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("Falló el registro, intente nuevamente...")
        builder.setPositiveButton("Aceptar",null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    private fun showLogin(email: String) {
        val loginIntent = Intent(this,LoginActivity::class.java).apply {
            putExtra("email",email)
        }
        startActivity(loginIntent)
    }

/*    private fun showPerfil(email: String) {
        val perfilIntent = Intent(this,PerfilActivity::class.java).apply {
            putExtra("email",email)
        }
        startActivity(perfilIntent)
    }*/
}






















        /*btnRegistro.setOnClickListener{
            val unIntento = Intent(this, LoginActivity::class.java)
            startActivity(unIntento)
            Toast.makeText(this, "Gracias por registrarse \uD83C\uDF89 ", Toast.LENGTH_LONG).show()
        }*/

