package com.P4B0N.primerparcial

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_perfil.*

class PerfilActivity : AppCompatActivity() {

    /*private lateinit var database: DatabaseReference// ...
    private lateinit var postReference: DatabaseReference
    private var postListener: ValueEventListener? = null*/


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)

        btnAJugar.setOnClickListener {
            val intentoDos = Intent(this,AJugarActivity::class.java)
            startActivity(intentoDos)
            Toast.makeText(this,"Que te diviertas \uD83E\uDD73 !!!",Toast.LENGTH_SHORT).show()
        }
        btnActPerf.setOnClickListener {
            Toast.makeText(this,"Gracias por actualizar tu perfil, ahora a divertirse \uD83E\uDD73 !!!",Toast.LENGTH_SHORT).show()

            //val intento = Intent(this,AJugarActivity::class.java)
            //startActivity(intento)
            //val uri = Uri.parse("http://www.google.com/")
            //val intent = Intent(Intent.ACTION_VIEW,uri)
            //startActivity(intent)
        }
    }
}
/*
        //val Nombre=findViewById<TextView>(R.id.txtName)
        //al Apellido=findViewById<TextView>(R.id.txtLastName)
        //val Email=findViewById<TextView>(R.id.txtEmail)
        //val Telefono=findViewById<TextView>(R.id.txtTel)

        postReference = FirebaseDatabase.getInstance().reference
            .child("Usuarios")

        //val btnActPerf=findViewById<Button>(R.id.btnActPerf)

        btnActPerf.setOnClickListener {
                // [START initialize_database_ref]
                database = FirebaseDatabase.getInstance().reference
                // [END initialize_database_ref]
                val postKey = database.child("Usuarios").push().key

                if (postKey == null) {
                    // Log.w("error", "Couldn't get push key for posts")
                    Toast.makeText(this, "error", Toast.LENGTH_SHORT).show()

                }

                val Nombre=this.txtName.getText().toString()
                val Apellido=this.txtLastName.getText().toString()
                val Email=this.txtEmail.getText().toString()
                val Telefono= this.txtTel.getText().toString()
                val post = Post(Nombre, Apellido, Email, Telefono)
                val postValues = post.toMap()

                val childUpdates = HashMap<String, Any>()
                childUpdates["/Usuarios/$postKey"] = postValues
                childUpdates["/Usuarios/$Email/$postKey"] = postValues

                database.updateChildren(childUpdates)
            }

        btnAJugar.setOnClickListener{
            val intentoDos = Intent(this, AJugarActivity::class.java)
            startActivity(intentoDos)
            Toast.makeText(this, "Que te diviertas \uD83E\uDD73 !!!", Toast.LENGTH_LONG).show()
            }
        }
        public override fun onStart() {
            super.onStart()

            // Add value event listener to the post
            // [START post_value_event_listener]
            val postListener = object : ValueEventListener {
                @SuppressLint("WrongConstant","ShowToast")
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    // Get Post object and use the values to update the UI
                    val post = dataSnapshot.getValue(Post::class.java)
                    // [START_EXCLUDE]
                    post?.let {
                        Toast.makeText(this@PerfilActivity,"llego",1)

                    }
                    // [END_EXCLUDE]
                }

                @SuppressLint("WrongConstant","ShowToast")
                override fun onCancelled(databaseError: DatabaseError) {
                    // Getting Post failed, log a message

                    Toast.makeText(this@PerfilActivity,"error",1)
                    // [END_EXCLUDE]
                }
            }
            postReference.addValueEventListener(postListener)
            // [END post_value_event_listener]

            // Keep copy of post listener so we can remove it when app stops
            this.postListener = postListener

            // Listen for comments

        }
    }



    // [START post_class]
    @IgnoreExtraProperties
    data class Post(
        var Nombre: String? = "",
        var Apellido: String? = "",
        var Email: String? = "",
        var Telefono: String? = ""
    ){

        // [START post_to_map]
        @Exclude
        fun toMap(): Map<String, Any?> {
            return mapOf(
                "Nombre" to Nombre,
                "Apellido" to Apellido,
                "Email" to Email,
                "Telefono" to Telefono

            )
        }
        // [END post_to_map]
    }
// [END post_class]}

*/
