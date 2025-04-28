package com.example.registro_usuarios

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class registro : AppCompatActivity() {
    private lateinit var btnReg : Button
    private lateinit var btn2 : Button
    private lateinit var etname : EditText
    private lateinit var etContrasnia : EditText
    private lateinit var usuario1 : Usuario
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registro)
        etname = findViewById(R.id.etRegNombre)
        etContrasnia= findViewById(R.id.etRegPassword)
        btnReg = findViewById(R.id.btnReg)
        btn2 = findViewById(R.id.btn2)
        btnReg.setOnClickListener {
            usuario1 = Usuario("",
                etContrasnia.text.toString())
            usuario1.nombre = etname.text.toString()

        }
        btn2.setOnClickListener {
            val intent = Intent(this,
                MainActivity::class.java)
            /*intent.putExtra("nombreUsuario", usuario1.nombre )
            intent.putExtra("passwordUsuario",usuario1.password)*/
            intent.putExtra("usuario",usuario1)
            startActivity(intent)
        }

    }
}