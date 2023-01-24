package com.example.android_developement_kotlin

import android.icu.text.Transliterator.Position
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {

       var  name= arrayOf("flutter","kotlin","java","coderCrew","coding","flutter","kotlin","flutter","kotlin","java","coderCrew","coding","java","coderCrew","coding","c++","htmal","css");
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var listview=this.findViewById<ListView>(R.id.ListView);


        var adapter=ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,name)

        listview.adapter=adapter;
        listview.onItemClickListener=object :AdapterView.OnItemClickListener{
            override fun onItemClick(
                p0: AdapterView<*>?,
                p1: View?,
                p2: Int,
                p3: Long)
            {

             Toast.makeText(applicationContext,"name="+name[p2],Toast.LENGTH_SHORT).show()


            }

        }



    }
}