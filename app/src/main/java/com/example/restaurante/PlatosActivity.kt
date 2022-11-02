package com.example.restaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class PlatosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_platos);


    }
    fun instalacion(rbInstalacion:View){
        val insta=Intent(this,PedidosActivity::class.java)
        startActivity(insta)
    }

    fun domicilio(rbDomicilio:View){
        val domi=Intent(this,PedidosActivity::class.java)
        startActivity(domi)
    }

    fun llevar(rbLlevar:View){
        val lleva=Intent(this,PedidosActivity::class.java)
        startActivity(lleva)
    }

    fun checkBo(checkBox:View){
        val checkb=Intent(this,PedidosActivity::class.java)
        startActivity(checkb)
    }

    fun checkBo1(checkBox1:View){
        val checkb1=Intent(this,PedidosActivity::class.java)
        startActivity(checkb1)
    }
    fun checkBo2(checkBox2:View){
        val checkb2=Intent(this,PedidosActivity::class.java)
        startActivity(checkb2)
    }
    fun checkBo3(checkBox3:View){
        val checkb3=Intent(this,PedidosActivity::class.java)
        startActivity(checkb3)
    }
    fun checkBo4(checkBox4:View){
        val checkb4=Intent(this,PedidosActivity::class.java)
        startActivity(checkb4)
    }
    fun checkBo5(checkBox5:View){
        val checkb5=Intent(this,PedidosActivity::class.java)
        startActivity(checkb5)
    }
    fun checkBo6(checkBox6:View){
        val checkb6=Intent(this,PedidosActivity::class.java)
        startActivity(checkb6)
    }
    fun checkBo7(checkBox7:View){
        val checkb7=Intent(this,PedidosActivity::class.java)
        startActivity(checkb7)
    }
    fun checkBo8(checkBox8:View){
        val checkb8=Intent(this,PedidosActivity::class.java)
        startActivity(checkb8)
    }
    fun checkBo9(checkBox9:View){
        val checkb9=Intent(this,PedidosActivity::class.java)
        startActivity(checkb9)
    }
    fun checkBo10(checkBox10:View){
        val checkb10=Intent(this,PedidosActivity::class.java)
        startActivity(checkb10)
    }

    fun checkBo11(checkBox11:View){
        val checkb11=Intent(this,PedidosActivity::class.java)
        startActivity(checkb11)
    }

    fun txtTota(txtTotal:View){
        val txtTot=Intent(this,PedidosActivity::class.java)
        startActivity(txtTot)
    }



}