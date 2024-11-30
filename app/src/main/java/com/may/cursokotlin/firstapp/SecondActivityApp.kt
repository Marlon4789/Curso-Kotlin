package com.may.cursokotlin.firstapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.may.cursokotlin.R
import android.util.Log
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText

class SecondActivityApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second_app)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Anclar el input Name
        val inputName = findViewById<AppCompatEditText>(R.id.inputName)

        // Anclar el boton
        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)

        // Logica
        btnStart.setOnClickListener {
            val name = inputName.text.toString()

            if (name.isNotEmpty()){
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("USER_NAME", name)
                startActivity(intent)
            }else {
                Toast.makeText(this, "Por favor ingresa un nombre", Toast.LENGTH_SHORT).show()
            }


        }
    }
}