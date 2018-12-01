/*
*Donal Moloney
* Gaa County Quizer
* 11/27/18
*/

package com.example.moloneyda.gaacountyquiz

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

/*
* This page is the home screen and allows the to user to either play the game or exit it
*/

class home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val playBtn = findViewById<Button>(R.id.playbtnM)
        val quitBtn = findViewById<Button>(R.id.quitbtnM)

        playBtn.setOnClickListener {
            val intent = Intent(this, gameActivity::class.java)
            startActivity(intent)
        }

        quitBtn.setOnClickListener {
            finish()
            System.exit(0)
        }
    }
}
