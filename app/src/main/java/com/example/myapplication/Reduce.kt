package com.example.myapplication

import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Reduce : AppCompatActivity() {

    private lateinit var reduce: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_reduce)

        //Find the linearlayout where buttons will be added

        reduce = findViewById(R.id.reduce_layout)
    }
}
