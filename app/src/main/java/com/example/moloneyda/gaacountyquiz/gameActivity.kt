package com.example.moloneyda.gaacountyquiz

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_game.*

class gameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        val enterBtn = findViewById<Button>(R.id.enterBtnA2)
        val score = findViewById<TextView>(R.id.scoreViewA2)
        val quitBtn = findViewById<Button>(R.id.btnQuitA2)
        imageViewGameA2.setImageResource(R.drawable.home)
        enterBtn.setOnClickListener {
            val cards = arrayOf(R.drawable.p1,R.drawable.p1,R.drawable.p1,R.drawable.p1,
                    R.drawable.p1,R.drawable.p1,R.drawable.p1,R.drawable.p1,R.drawable.p1,
                    R.drawable.p1,R.drawable.p1,R.drawable.p1,R.drawable.p1,R.drawable.p1,
                    R.drawable.p1,R.drawable.p1,R.drawable.p1,R.drawable.p1,
                    R.drawable.p1,R.drawable.p1, R.drawable.p1,R.drawable.p1,R.drawable.p1,
                    R.drawable.p1,R.drawable.p1,R.drawable.p1,R.drawable.p1,R.drawable.p1,R.drawable.p1
                    ,R.drawable.p1,R.drawable.p1,R.drawable.p1,R.drawable.p1,R.drawable.p1,R.drawable.p1,R.drawable.p1)
            // val imageView = findViewById<ImageView>(R.id.imageViewGameA2)
            // val currentImage = "C:/Users/Moloneyda/AndroidStudioProjects/GaaApp/app/src/main/res/home.jpg"
            //imageView.


            //todo select an image
            //todo set the image

            //say ready for input
        }

        quitBtn.setOnClickListener {
            finish()
            System.exit(0)
        }

        //setting the score to zero
        score.text = "0/0"

        //Display toast telling the user you are ready
        Toast.makeText(this, "Get Ready to play", Toast.LENGTH_SHORT).show()
    }
}
