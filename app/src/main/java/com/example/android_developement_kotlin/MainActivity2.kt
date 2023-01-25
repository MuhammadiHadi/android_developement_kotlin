package com.example.android_developement_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val login=findViewById<Button>(R.id.login)
        login.setOnClickListener(){
            Toast.makeText(this,"Enter Email,Password",Toast.LENGTH_SHORT).show();
            val intent =Intent(this,MainActivity3::class.java);
            startActivity(intent);
        }
    }
}