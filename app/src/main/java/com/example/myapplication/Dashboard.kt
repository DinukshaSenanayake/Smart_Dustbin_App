package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class Dashboard : AppCompatActivity() {

    private lateinit var Logout: Button
    private lateinit var View: Button
    private lateinit var Ecco: Button
    private lateinit var History: Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        Logout = findViewById(R.id.logout)
        View = findViewById(R.id.viewbins)
        Ecco= findViewById(R.id.eco)
        History = findViewById(R.id.viewhistory)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.dashboard)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Logout.setOnClickListener {
            val sharedPreferences = getSharedPreferences("MyAppPrefs", MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.putBoolean("isLoggedIn", false)
            editor.apply()

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()  // Close the dashboard activity
        }

        View.setOnClickListener {
            val intent = Intent(this, ViewBinsDashboard::class.java)
            startActivity(intent)
        }

        /*onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                counter++
                if (counter == 2) {
                    finishAffinity()  // This will close the app or activity
                } else {
                    Toast.makeText(this@Dashboard, "Press again to exit", Toast.LENGTH_SHORT).show()
                }
            }
        })*/

        Ecco.setOnClickListener {
            val intent = Intent(this, EcoDashboard::class.java)
            startActivity(intent)
        }

        History.setOnClickListener {
            val intent = Intent(this, ViewHistory::class.java)
            startActivity(intent)
        }
    }
}
