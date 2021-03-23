package com.geniy.impostorissus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_countine.*
import kotlinx.android.synthetic.main.activity_main.*

class Continue : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_countine)

        val go_main_c = findViewById<ImageView>(R.id.b_back_c)
        go_main_c.setOnClickListener {
            val perehod5  = Intent(this, MainMenu::class.java)
            startActivity(perehod5)
        }
    }
}