package com.example.herrasis

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class listado_equiposActivity : AppCompatActivity() {

    private val equipos = listOf(
        Equipo("001", "Equipo A", "Tipo 1", "Operativo", "Ubicación 1"),
        Equipo("002", "Equipo B", "Tipo 2", "En Reparación", "Ubicación 2"),
        Equipo("003", "Equipo C", "Tipo 3", "Fuera de Servicio", "Ubicación 3")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listado_equipos)

        val listViewEquipos = findViewById<ListView>(R.id.listViewEquipos)

        val equiposInfo = equipos.map { equipo ->
            "Código: ${equipo.codigo}\nNombre: ${equipo.nombre}\nTipo: ${equipo.tipo}\nEstado: ${equipo.estado}\nUbicación: ${equipo.ubicacion}"
        }

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, equiposInfo)
        listViewEquipos.adapter = adapter
    }
}
