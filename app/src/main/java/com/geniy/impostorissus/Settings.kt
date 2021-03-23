package com.geniy.impostorissus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val go_main_s = findViewById<ImageView>(R.id.b_back_s)
        go_main_s.setOnClickListener {
            val perehod5 = Intent(this, MainMenu::class.java)
            startActivity(perehod5)
        }
    }
}