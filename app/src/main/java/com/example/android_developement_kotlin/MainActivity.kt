package com.example.android_developement_kotlin

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var x=0;
       val button=findViewById<Button>(R.id.button);
       val count=findViewById<Button>(R.id.button2);
        var text=findViewById<TextView>(R.id.count);
        var btn= this.findViewById<Button>(R.id.alert);
        var builder=AlertDialog.Builder(this);


       count.setOnClickListener(){
           text.setText("${x++}");
       }
       button.setOnClickListener(){


           intent =Intent(this,MainActivity2::class.java);
           startActivity(intent);
       }


        btn.setOnClickListener(){
            builder.setTitle("Hello")
            builder.setMessage(" first app using kotlin")

                .setCancelable(true)
                .setNegativeButton("no"){
                    dialogInterface,it->
                    dialogInterface.cancel();
                }
                .setPositiveButton(
                    "yes"
                ){
                        dialogInterface,it->
                    finish()
                }

                .setNeutralButton("Hellp"){
                        dialogInterface,it->
                    Toast.makeText(this,"Thank you will connect you", Toast.LENGTH_SHORT).show();
                }
                .show()

        }

    }






}



