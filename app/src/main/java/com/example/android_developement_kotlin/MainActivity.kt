package com.example.android_developement_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var x=0;
       val button=findViewById<Button>(R.id.button);
       val count=findViewById<Button>(R.id.button2);
        var text=findViewById<TextView>(R.id.count);



       count.setOnClickListener(){
           text.setText("${x++}");
       }
       button.setOnClickListener(){


           intent =Intent(this,MainActivity2::class.java);
           startActivity(intent);
       }

    }






}



