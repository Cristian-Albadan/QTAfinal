package com.utappmoviles.qtafinal

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton


class MainActivity : AppCompatActivity() {
    private lateinit var btnInicioSecion:MaterialButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        // hola
        }
        initComponent()
        initListeners()
    }

    private fun initListeners() {
        btnInicioSecion.setOnClickListener {
            val intent = Intent(this@MainActivity, SigInActivity::class.java)
            startActivity(intent)
        }
    }

    private fun initComponent() {
        btnInicioSecion= findViewById(R.id.btnInicioSecion)
    }
}