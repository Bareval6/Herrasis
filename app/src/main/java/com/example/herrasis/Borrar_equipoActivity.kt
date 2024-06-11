package com.example.herrasis

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Borrar_equipoActivity : AppCompatActivity() {

    private val equipos = mutableListOf(
        Equipo("001", "Equipo A", "Tipo 1", "Operativo", "Ubicación 1"),
        Equipo("002", "Equipo B", "Tipo 2", "En Reparación", "Ubicación 2"),
        Equipo("003", "Equipo C", "Tipo 3", "Fuera de Servicio", "Ubicación 3")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_borrar_equipo)

        val etBorrarCodigo = findViewById<EditText>(R.id.etBorrarCodigo)
        val btnBorrar = findViewById<Button>(R.id.btnBorrar)
        val tvBorrarResultado = findViewById<TextView>(R.id.tvBorrarResultado)

        btnBorrar.setOnClickListener {
            val codigo = etBorrarCodigo.text.toString()

            if (codigo.isEmpty()) {
                Toast.makeText(this, "Por favor, ingresa el código del equipo", Toast.LENGTH_SHORT).show()
            } else {
                val resultado = borrarEquipoPorCodigo(codigo)
                if (resultado) {
                    tvBorrarResultado.text = "Equipo con código $codigo ha sido borrado."
                } else {
                    tvBorrarResultado.text = "Equipo no encontrado."
                }
                tvBorrarResultado.visibility = TextView.VISIBLE
            }
        }
    }

    private fun borrarEquipoPorCodigo(codigo: String): Boolean {
        val iterator = equipos.iterator()
        while (iterator.hasNext()) {
            val equipo = iterator.next()
            if (equipo.codigo == codigo) {
                iterator.remove()
                return true
            }
        }
        return false
    }
}
