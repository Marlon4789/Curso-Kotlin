package com.may.cursokotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.may.cursokotlin.firstapp.SecondActivityApp

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Anclaje
        val btnMenu = findViewById<Button>(R.id.btnMenu)
        btnMenu.setOnClickListener{ navigateMenu() }

    }

    // Funciones del menu
    private fun navigateMenu(){
        val intent = Intent(this, SecondActivityApp::class.java)
        startActivity(intent)
    }


}