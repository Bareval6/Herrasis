package com.example.herrasis

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class buscar_equipoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buscar_equipo)

        val etBuscarCodigo = findViewById<EditText>(R.id.etBuscarCodigo)
        val btnBuscar = findViewById<Button>(R.id.btnBuscar)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)

        btnBuscar.setOnClickListener {
            val codigo = etBuscarCodigo.text.toString()

            if (codigo.isEmpty()) {
                Toast.makeText(this, "Por favor, ingresa el código del equipo", Toast.LENGTH_SHORT).show()
            } else {
                // Simulamos una búsqueda de equipo
                val equipo = buscarEquipoPorCodigo(codigo)
                if (equipo != null) {
                    tvResultado.text = "Código: ${equipo.codigo}\nNombre: ${equipo.nombre}\nTipo: ${equipo.tipo}\nEstado: ${equipo.estado}\nUbicación: ${equipo.ubicacion}"
                    tvResultado.visibility = TextView.VISIBLE
                } else {
                    tvResultado.text = "Equipo no encontrado"
                    tvResultado.visibility = TextView.VISIBLE
                }
            }
        }
    }

    private fun buscarEquipoPorCodigo(codigo: String): Equipo? {
        // Aquí puedes implementar la lógica para buscar un equipo en una base de datos o lista
        // Por ahora, simularemos una búsqueda simple

        val equipos = listOf(
            Equipo("001", "Equipo A", "Tipo 1", "Operativo", "Ubicación 1"),
            Equipo("002", "Equipo B", "Tipo 2", "En Reparación", "Ubicación 2"),
            Equipo("003", "Equipo C", "Tipo 3", "Fuera de Servicio", "Ubicación 3")
        )

        return equipos.find { it.codigo == codigo }
    }
}