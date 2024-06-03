package com.example.herrasis

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class CentralActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_central)

        // Inicializar los botones
        val button1 = findViewById<Button>(R.id.ingresar_equipos)
        val button2 = findViewById<Button>(R.id.inventario)
        val button3 = findViewById<Button>(R.id.mantenimiento)
        val button4 = findViewById<Button>(R.id.solicitudes)
        val button5 = findViewById<Button>(R.id.Estadistica)

       
    }
}
