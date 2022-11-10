package com.example.restaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView

class MenuActivity : AppCompatActivity() {

    private lateinit var appbarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu);

        setSupportActionBar(findViewById(R.id.mytoolbar))

        val drawerLayout:DrawerLayout = findViewById(R.id.drawer_layout)
        val navView:NavigationView = findViewById(R.id.nav_view)
        val navHostFragment = supportFragmentManager.findFragmentById(androidx.fragment.R.id.fragment_container_view_tag) as NavHostFragment
        val navController = navHostFragment.navController


        appbarConfiguration = AppBarConfiguration(setOf(), drawerLayout)
        setupActionBarWithNavController(navController, appbarConfiguration)
        navView.setupWithNavController(navController)


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