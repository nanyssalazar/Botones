package edu.iest.botones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView

class activity_segunda : AppCompatActivity() {

    private var cambioIcono: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        // para obtener informacion de otro lado usamos el intent con esta funcion dependiendo el tipo de dato
        var fraseRecibida = intent.getStringExtra("frase")
        var edad = intent.getIntExtra("edad", 0)


        Log.d("DATOS", "Datos recibidos con exito fueron frase $fraseRecibida y $edad")


        var bnAbrirPantalla = findViewById<Button>(R.id.bnPantalla)
        var ivLogo = findViewById<ImageView>(R.id.ivLogo)
        ivLogo.setOnClickListener {
            var arregloImagenes = arrayOf<Int>(R.drawable.anahuac, R.drawable.iest)
            if (cambioIcono) {
                ivLogo.setImageResource(arregloImagenes[0])
            } else {
                ivLogo.setImageResource(arregloImagenes[1])
            }
            cambioIcono = !cambioIcono
        }

        bnAbrirPantalla.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            finish()
        }

        var bnCerrar = findViewById<Button>(R.id.bnCerrar)
        bnCerrar.setOnClickListener { finish() }
    }
}