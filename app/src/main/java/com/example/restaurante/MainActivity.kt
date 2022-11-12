package com.example.restaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.restaurante.databinding.ActivityMainBinding
import com.google.firebase.firestore.FirebaseFirestore


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val db:FirebaseFirestore=FirebaseFirestore.getInstance()

        binding.btningresar.setOnClickListener{
            var datos = ""
            db.collection("usuarios")
                .get()
                .addOnSuccessListener { resultado ->
                    for (documento in resultado){
                        datos += "${documento.id}:${documento.data}\n"
                    }
                    val menu=Intent(this,MenuActivity::class.java)
                    startActivity(menu)
                }
                .addOnFailureListener{
                        excepcion->
                    Toast.makeText(this, "Error al iniciar sesión", Toast.LENGTH_LONG).show()

                }
        }
    }


}