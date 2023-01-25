package com.example.android_developement_kotlin

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatDelegate

class splash_view : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_view)
        var x=0
        val button=this.findViewById<Button>(R.id.button)
        val count=this.findViewById<Button>(R.id.button2)
        val text=this.findViewById<TextView>(R.id.count)
        val btn= this.findViewById<Button>(R.id.alert)
        val switch= this.findViewById<Switch>(R.id.switch1)
        val builder= AlertDialog.Builder(this)


        count.setOnClickListener(){
            text.setText("${x++}")
        }
        button.setOnClickListener(){
            intent =Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
        btn.setOnClickListener(){
            builder.setTitle("Hello")
            builder.setMessage(" first app using kotlin")

                .setCancelable(true)
                .setNegativeButton("no"){
                        dialogInterface,it->
                    dialogInterface.cancel()
                }
                .setPositiveButton(
                    "yes"
                ){
                        dialogInterface,it->
                    finish()
                }

                .setNeutralButton("Hellp"){
                        dialogInterface,it->
                    Toast.makeText(this,"Thank you will connect you", Toast.LENGTH_SHORT).show()
                }

        }

        switch.setOnCheckedChangeListener{_, isChecked ->

            if (switch.isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)

            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

            }
        }

    }

}




