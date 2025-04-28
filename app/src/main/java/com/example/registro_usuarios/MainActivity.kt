package com.example.registro_usuarios

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton
import de.hdodenhof.circleimageview.CircleImageView

class MainActivity : AppCompatActivity() {
    private lateinit var etUsuario : EditText
    private lateinit var etPassword : EditText
    private lateinit var btn1: Button
    private lateinit var fab : FloatingActionButton
    private lateinit var ivPerfil : CircleImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        /*val usuarioNombre = intent.getStringExtra("nombreUsuario")
        val usuarioPassword = intent.getStringExtra("passwordUsuario")*/
        val usuario = intent.getParcelableExtra<Usuario>("usuario")
        etUsuario = findViewById(R.id.etUsuario)
        etPassword = findViewById(R.id.etPassword)
        btn1 = findViewById(R.id.btn1)
        fab = findViewById(R.id.fab)
        ivPerfil = findViewById(R.id.ivPerfil)
        fab.setOnClickListener{
            val intent = Intent(this,
                registro::class.java)
            startActivity(intent)
        }
        btn1.setOnClickListener {
            if(etUsuario.text.toString().equals(usuario?.nombre) &&
                etPassword.text.toString().equals(usuario?.password)){
                Toast.makeText(this,"inicio de sesion correcto",
                    Toast.LENGTH_LONG).show()
                ivPerfil.visibility= View.VISIBLE
                ivPerfil.setImageResource(R.drawable.user1)
            }
            else{
                Toast.makeText(this,"inicio de sesion incorrecto",
                    Toast.LENGTH_LONG).show()
            }
        }
    }
}