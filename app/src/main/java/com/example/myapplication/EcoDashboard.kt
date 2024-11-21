package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import androidx.core.view.ViewCompat

class EcoDashboard : AppCompatActivity() {

    private lateinit var btnReduce: Button
    private lateinit var btnRecycle: Button
    private lateinit var btnReuse: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eco_dashboard)

        btnReduce = findViewById(R.id.reduce)
        btnReuse= findViewById(R.id.reuse)
        btnRecycle= findViewById(R.id.recycle)



        btnReduce.setOnClickListener {
            val intent = Intent(this, Reduce::class.java)
            startActivity(intent)
        }

        btnRecycle.setOnClickListener {
            val intent = Intent(this, Recycle::class.java)
            startActivity(intent)
        }

        btnReuse.setOnClickListener {
            val intent = Intent(this, Reuse::class.java)
            startActivity(intent)
        }

    }
}
