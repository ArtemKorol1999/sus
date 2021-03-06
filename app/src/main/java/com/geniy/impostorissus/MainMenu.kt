package com.geniy.impostorissus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainMenu : AppCompatActivity() {
private var backPressedTime : Long = 0
    private var backToast : Toast?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Countine = findViewById<Button>(R.id.b_continue)
        b_continue.setOnClickListener {
            val perehod1 = Intent(this, Continue::class.java)
            startActivity(perehod1)
        }

        val NewGame = findViewById<Button>(R.id.b_new_game)
        b_new_game.setOnClickListener {
            val perehod2 = Intent(this, NewGame::class.java)
            startActivity(perehod2)
        }
        val LoadGame = findViewById<Button>(R.id.b_load_game)
        b_load_game.setOnClickListener {
            val perehod3 = Intent(this, LoadGame::class.java)
            startActivity(perehod3)
        }
        val Settings = findViewById<Button>(R.id.b_settings)
        b_settings.setOnClickListener {
            val perehod4 = Intent(this, Settings::class.java)
            startActivity(perehod4)
        }
    }
    override fun onBackPressed() {
       if(backPressedTime + 2000 > System.currentTimeMillis()){
           backToast?.cancel()
           super.onBackPressed()
           return
       }
        else{
           backToast = Toast.makeText(baseContext,"ажмите еще раз чтобы выйте",Toast.LENGTH_SHORT)
           backToast.show()
       }
       backPressedTime = System.currentTimeMillis()
    }
}