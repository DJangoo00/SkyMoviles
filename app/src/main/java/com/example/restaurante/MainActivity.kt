package com.example.restaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.restaurante.databinding.ActivityMainBinding
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.getField


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val db:FirebaseFirestore=FirebaseFirestore.getInstance()

        binding.btningresar.setOnClickListener{
            if (binding.etusername.text.isNotBlank() && binding.etpassword.text.isNotBlank()){
                db.collection("usuarios")
                    .document(binding.etusername.text.toString())
                    .get()
                    .addOnSuccessListener {
                        if (binding.etpassword.text.toString() == it.getField("Password")){
                            val iniciarmenu = Intent(this, MenuActivity::class.java)
                            startActivity(iniciarmenu)
                        }
                    }
                    .addOnFailureListener {
                        Toast.makeText(this, "Error al iniciar sesion", Toast.LENGTH_LONG).show()
                    }

            }
            else{
                Toast.makeText(this, "Complete los campos de usuario y password", Toast.LENGTH_LONG).show()
            }
                    }
    }


}