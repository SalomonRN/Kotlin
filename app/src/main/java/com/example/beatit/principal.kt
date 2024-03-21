package com.example.beatit

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class principal : AppCompatActivity() {
    private lateinit var sig: Button
    private lateinit var nombre: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.principal)
        sig = findViewById(R.id.b_sigam)
        nombre = findViewById(R.id.id_nom)
        sig.setOnClickListener(View.OnClickListener {
            val n = nombre.text.toString().trim { it <= ' ' }
            if (TextUtils.isEmpty(n)) {
                Toast.makeText(
                    this@principal,
                    "No se ha registrado ningun nombre, vuele a intentarlo",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                val i = Intent(
                    this@principal,
                    MainActivity::class.java
                )
                i.putExtra("name", n)
                startActivity(i)
            }
        })
    }
}