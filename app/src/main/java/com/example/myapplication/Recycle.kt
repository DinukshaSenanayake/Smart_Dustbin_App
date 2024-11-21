package com.example.myapplication

import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Recycle : AppCompatActivity() {

    private lateinit var recycle: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle)

        //Find the linearlayout where buttons will be added

        recycle = findViewById(R.id.recycle_layout)

    }
}