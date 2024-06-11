package com.example.herrasis

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAbrirAgregarEquipo = findViewById<Button>(R.id.btnAbrirAgregarEquipo)
        btnAbrirAgregarEquipo.setOnClickListener {
            val intent = Intent(this, Agregar_equipoActivity::class.java)
            startActivity(intent)
        }

        val btnAbrirBuscarEquipo = findViewById<Button>(R.id.btnAbrirBuscarEquipo)
        btnAbrirBuscarEquipo.setOnClickListener {
            val intent = Intent(this, buscar_equipoActivity::class.java)
            startActivity(intent)
        }

        val btnAbrirBorrarEquipo = findViewById<Button>(R.id.btnAbrirBorrarEquipo)
        btnAbrirBorrarEquipo.setOnClickListener {
            val intent = Intent(this, Borrar_equipoActivity::class.java)
            startActivity(intent)
        }

        val btnAbrirListadoEquipos = findViewById<Button>(R.id.btnAbrirListadoEquipos)
        btnAbrirListadoEquipos.setOnClickListener {
            val intent = Intent(this, listado_equiposActivity::class.java)
            startActivity(intent)
        }
    }
}


