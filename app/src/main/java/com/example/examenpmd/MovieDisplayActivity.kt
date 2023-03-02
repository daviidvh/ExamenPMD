package com.example.examenpmd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class MovieDisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_display)


        /**Traemos variables**/
        var tituloPeliculaFin=intent.getStringExtra("tituloPeliculaFin")
        var duracionPeliculaFin=intent.getStringExtra("duracionPeliculaFin")
        var nombreDirectorFin=intent.getStringExtra("nombreDirectorFin")
        var anioLanzamiento=intent.getStringExtra("anioLanzamientoFin")

        var volverInicio=findViewById<Button>(R.id.btninicio)

        var eliminiar=findViewById<EditText>(R.id.edtBorrar)

        var botonBorrar=findViewById<ImageButton>(R.id.btnBorrar)

       // var arraypelicula= arrayListOf<pelicula>()



        var textoTitulo=findViewById<TextView>(R.id.txtVTitulo)
        var textoDuracion=findViewById<TextView>(R.id.txtVDuracion)
        var textoDirector=findViewById<TextView>(R.id.txtVDireccion)
        var textoLanzamiento=findViewById<TextView>(R.id.txtVLanzamiento)

        textoTitulo.text = tituloPeliculaFin.toString()
        textoDuracion.text= duracionPeliculaFin.toString()
        textoDirector.text= nombreDirectorFin.toString()
        textoLanzamiento.text= anioLanzamiento.toString()





        //arraypelicula.add(pelicula(tituloPeliculaFin.toString(),duracionPeliculaFin.toString(),nombreDirectorFin.toString(),anioLanzamiento.toString()))


        /*Intento de array
        textoTitulo.text= arraypelicula[0].titulo.toString()
        textoDuracion.text= arraypelicula[0].duracion.toString()
        textoDirector.text= arraypelicula[0].director.toString()
        textoLanzamiento.text= arraypelicula[0].lanzamiento.toString()
        */






        botonBorrar.setOnClickListener(){
            //arraypelicula.removeAt()
        }
       volverInicio.setOnClickListener(){
            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}