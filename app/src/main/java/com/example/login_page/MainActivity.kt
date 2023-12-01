package com.example.login_page

import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val txtEmail = findViewById<TextView>(R.id.txtEmail)
        val edtxtEmail =findViewById<EditText>(R.id.edtxtEmail)
        val txtPassword = findViewById<TextView>(R.id.txtPassword)
        val edTextPassword = findViewById<EditText>(R.id.edTxtPassword)

        btnSubmit.setOnClickListener{
            val email = edtxtEmail.text.toString()
            val password = edTextPassword.text.toString()
            Log.d("MainActivity", "Your email is $email and Password is $password")
        }
    }
}