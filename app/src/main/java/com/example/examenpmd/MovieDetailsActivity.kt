package com.example.examenpmd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MovieDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)

        var aceptar=findViewById<Button>(R.id.btnSiguiente)
        var atras=findViewById<Button>(R.id.btnAtras)
        var nombreDirector=findViewById<EditText>(R.id.nombredirector)
        var anioLanzamiento=findViewById<EditText>(R.id.aniolanzamiento)
        var tituloPelicula=intent.getStringExtra("nombrepelicula")
        var duracionPelicula=intent.getStringExtra("duracionpelicula")


        atras.setOnClickListener(){
            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        aceptar.setOnClickListener(){
            val intent= Intent(this, MovieDisplayActivity::class.java)
            intent.putExtra("tituloPeliculaFin",tituloPelicula)
            intent.putExtra("duracionPeliculaFin",duracionPelicula)
            intent.putExtra("nombreDirectorFin",nombreDirector.toString())
            intent.putExtra("anioLanzamientoFin",anioLanzamiento.toString())
            startActivity(intent)
        }


    }
}