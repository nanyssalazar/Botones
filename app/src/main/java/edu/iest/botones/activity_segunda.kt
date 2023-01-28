package edu.iest.botones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class activity_segunda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        // para obtener informacion de otro lado usamos el intent con esta funcion dependiendo el tipo de dato
        var fraseRecibida = intent.getStringExtra("frase")
        var edad = intent.getIntExtra("edad",0)


        Log.d("DATOS","Datos recibidos con exito fueron frase $fraseRecibida y $edad")


        var bnAbrirPantalla = findViewById<Button>(R.id.bnPantalla)
        bnAbrirPantalla.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
        var bnCerrar = findViewById<Button>(R.id.bnCerrar)
        bnCerrar.setOnClickListener { finish() }
    }
}