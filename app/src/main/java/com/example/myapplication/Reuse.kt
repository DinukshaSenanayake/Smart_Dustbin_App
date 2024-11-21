package com.example.myapplication

import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Reuse : AppCompatActivity() {

    private lateinit var reuse: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_reuse)

        //Find the linearlayout where buttons will be added

        reuse = findViewById(R.id.reuse_layout)
    }
}