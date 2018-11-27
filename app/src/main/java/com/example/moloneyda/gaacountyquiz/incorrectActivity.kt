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
import kotlinx.android.synthetic.main.activity_incorrect.*

class incorrectActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_incorrect)
        //setting up the okay buton handler to go back to the gameActivity when clicking okay
        val btnOkay = findViewById<Button>(R.id.btnOkayIncorrect)
        //todo also somewhere set the correct poctre


        //Showing he user what he got wrong
        val correctValue = getIntent().getStringExtra("").toString()
        val userInput = getIntent().getStringExtra("").toString()
        textViewMessageIncorrect.text = "You entered $userInput ,however the correct answer is $correctValue"

        //Button handler for activity_incorrect to go mack to activity_game
        btnOkay.setOnClickListener {
            val intent = Intent(this, gameActivity::class.java)
            startActivity(intent)
        }

    }
}
