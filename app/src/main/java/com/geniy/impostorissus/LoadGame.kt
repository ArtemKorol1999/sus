package com.geniy.impostorissus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class LoadGame : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_load_game)

        val go_main_lg = findViewById<ImageView>(R.id.b_back_lg)
        go_main_lg.setOnClickListener {
            val perehod5 = Intent(this, MainMenu::class.java)
            startActivity(perehod5)
        }
    }
}