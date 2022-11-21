package com.example.restaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.restaurante.databinding.ActivityMainBinding
import com.example.restaurante.databinding.ActivitySignupBinding
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.getField


class SignUpActivity : AppCompatActivity() {

    lateinit var binding: ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivitySignupBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val db=FirebaseFirestore.getInstance()

        binding.btnregistrar.setOnClickListener {
            if(binding.etpassword.text.isNotBlank() && binding.etusername.text.isNotBlank() && binding.etufullsername.text.isNotBlank()){
                val datos = hashMapOf(
                    "Nombre" to binding.etufullsername.text.toString(),
                    "Password" to binding.etpassword.text.toString()
                )
                db.collection("usuarios")
                    .document(binding.etusername.text.toString())
                    .set(datos)
                    .addOnSuccessListener { resultado->
                        Toast.makeText(this, "Registro exitoso", Toast.LENGTH_LONG).show()
                    }
                    .addOnFailureListener { exception ->
                        Toast.makeText(this, "Error al registrar usuario", Toast.LENGTH_LONG).show()
                    }


            }
            else if (binding.etpassword.text.isBlank()){
                Toast.makeText(this, "Password invalida", Toast.LENGTH_LONG).show()
            }
            else if (binding.etusername.text.isBlank()){
                Toast.makeText(this, "Username invalido", Toast.LENGTH_LONG).show()
            }
            else if (binding.etufullsername.text.isBlank()){
                Toast.makeText(this, "Full username invalido", Toast.LENGTH_LONG).show()
            }
        }
    }
}