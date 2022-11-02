package com.example.restaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button

class MenuActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu);
    }
    fun platos(btnplato:View){
        val plato=Intent(this,PlatosActivity::class.java)
        startActivity(plato)
    }
    fun bebidas(btnbebida:View){
        val bebida=Intent(this,BebidasActivity::class.java)
        startActivity(bebida)
    }
    fun postres(btnpostre:View){
        val postre=Intent(this,PostreActivity::class.java)
        startActivity(postre)
    }
    fun galerias(btngaleria:View){
        val galeria=Intent(this,GaleriaActivity::class.java)
        startActivity(galeria)
    }
    fun empresa(btnempres:View){
        val empre=Intent(this,EmpresaActivity::class.java)
        startActivity(empre)
    }
    fun experiencia(btnexperiencia:View){
        val experienci=Intent(this,ExperienciasActivity::class.java)
        startActivity(experienci)
    }
}