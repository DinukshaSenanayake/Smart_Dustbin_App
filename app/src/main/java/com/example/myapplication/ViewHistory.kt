package com.example.myapplication

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class ViewHistory : AppCompatActivity() {
    private lateinit var historyLayout: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history_dashboard)

        //find the linearlayout where buttons will be added
        historyLayout = findViewById(R.id.history_layout)
    }

}

