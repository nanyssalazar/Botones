package edu.iest.botones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var tvFrase : TextView
    private lateinit var etFrase : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvFrase = findViewById(R.id.textViewFrase)
        etFrase = findViewById(R.id.editTextFrase)
        var bnMostrar = findViewById<
                Button>(R.id.buttonMostrar)
        bnMostrar.setOnClickListener{
            val frase = etFrase.text.toString()
        Snackbar.make(tvFrase, "Su frase fue $frase", Snackbar.LENGTH_LONG).show()
        }
        var bnSiguiente = findViewById<Button>(R.id.bnSiguiente)
        bnSiguiente.setOnClickListener{
            val i = Intent(this,activity_segunda::class.java)
            i.putExtra("frase",etFrase.text.toString())
            i.putExtra(
                "edad",22
            )
            startActivity(i)
        }

    }

    private fun obtenerFrase(): String {
        return etFrase.text.toString()
    }
}