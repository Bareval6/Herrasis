package com.example.herrasis

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

data class Equipo(
    val codigo: String,
    val nombre: String,
    val tipo: String,
    val estado: String,
    val ubicacion: String
)

class Agregar_equipoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agregar_equipo)

        val etCodigo = findViewById<EditText>(R.id.etCodigo)
        val etNombre = findViewById<EditText>(R.id.etNombre)
        val etTipo = findViewById<EditText>(R.id.etTipo)
        val etEstado = findViewById<EditText>(R.id.etEstado)
        val etUbicacion = findViewById<EditText>(R.id.etUbicacion)
        val btnAgregar = findViewById<Button>(R.id.btnAgregar)

        btnAgregar.setOnClickListener {
            val codigo = etCodigo.text.toString()
            val nombre = etNombre.text.toString()
            val tipo = etTipo.text.toString()
            val estado = etEstado.text.toString()
            val ubicacion = etUbicacion.text.toString()

            if (codigo.isEmpty() || nombre.isEmpty() || tipo.isEmpty() || estado.isEmpty() || ubicacion.isEmpty()) {
                Toast.makeText(this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show()
            } else {
                val equipo = Equipo(codigo, nombre, tipo, estado, ubicacion)
                agregarEquipo(equipo)
            }
        }
    }

    private fun agregarEquipo(equipo: Equipo) {
        // Aquí puedes agregar la lógica para guardar el equipo
        // Por ejemplo, guardarlo en una base de datos o enviarlo a un servidor

        // Por ahora, solo mostramos un mensaje
        Toast.makeText(this, "Equipo agregado: $equipo", Toast.LENGTH_SHORT).show()
    }
}
