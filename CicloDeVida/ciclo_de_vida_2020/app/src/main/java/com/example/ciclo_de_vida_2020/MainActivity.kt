package com.example.ciclo_de_vida_2020

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*;
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txtNombre=findViewById<TextView>(R.id.txtNombre)
        val txtMultilinea=findViewById<TextView>(R.id.txtMultilinea)
        val btnGuardar=findViewById<Button>(R.id.btnGuardar)

        btnGuardar.setOnClickListener {
            try {
                val archivo = OutputStreamWriter(openFileOutput("datos.txt", Activity.MODE_APPEND))
                archivo.write(txtNombre.text.toString()+ "\n")
                archivo.flush()
                archivo.close()
            } catch (e: IOException) {

            }
            Toast.makeText(this, "Guardando...",Toast.LENGTH_SHORT).show()
            CargarListado()
            }
    }

    private fun CargarListado()
    {
        if (fileList().contains("datos.txt")) {
            try {
                val archivo = InputStreamReader(openFileInput("datos.txt"))
                val br = BufferedReader(archivo)
                var linea = br.readLine()
                val listado = StringBuilder()//solo para mostrarlo
                while (linea != null) {
                    listado.append(linea + " \n ")
                    linea = br.readLine()
                }
                br.close()
                archivo.close()
                this.txtMultilinea.setText(listado)
            } catch (e: IOException) {
            }
        }

    }
    override fun onStart() {
        super.onStart()
        CargarListado()
    }

    override fun onResume() {
        super.onResume()

    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
