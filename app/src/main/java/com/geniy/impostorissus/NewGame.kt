 package com.geniy.impostorissus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

 class NewGame : AppCompatActivity() {
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_new_game)

         val go_main_ng = findViewById<ImageView>(R.id.b_back_ng)
         go_main_ng.setOnClickListener {
             val perehod5 = Intent(this, MainMenu::class.java)
             startActivity(perehod5)
         }
     }
 }