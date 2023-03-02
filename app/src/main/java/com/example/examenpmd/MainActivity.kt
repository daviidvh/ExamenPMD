package com.example.examenpmd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nombrepeli=findViewById<EditText>(R.id.nombrepeli)

        var duracion=findViewById<EditText>(R.id.duracionPeli)

        var aceptar=findViewById<Button>(R.id.btnaceptar)

        /**
        aceptar.visibility=View.INVISIBLE
        if (!nombrepeli.toString().equals("") && !duracion.toString().equals(""))
            aceptar.visibility=View.VISIBLE
        else
            aceptar.visibility=View.INVISIBLE
        **/
        aceptar.setOnClickListener(){
            val intent= Intent(this, MovieDetailsActivity::class.java)
            intent.putExtra("nombrepelicula",nombrepeli.toString())
            intent.putExtra("duracionpelicula",duracion.toString())
            println("--------"+nombrepeli)

            startActivity(intent)
        }


    }
}


