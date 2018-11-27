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
            val cards = arrayOf(R.drawable.p1, R.drawable.p1, R.drawable.p1, R.drawable.p1,
                    R.drawable.p1, R.drawable.p1, R.drawable.p1, R.drawable.p1, R.drawable.p1,
                    R.drawable.p1, R.drawable.p1, R.drawable.p1, R.drawable.p1, R.drawable.p1,
                    R.drawable.p1, R.drawable.p1, R.drawable.p1, R.drawable.p1,
                    R.drawable.p1, R.drawable.p1, R.drawable.p1, R.drawable.p1, R.drawable.p1,
                    R.drawable.p1, R.drawable.p1, R.drawable.p1, R.drawable.p1, R.drawable.p1, R.drawable.p1
                    , R.drawable.p1, R.drawable.p1, R.drawable.p1, R.drawable.p1, R.drawable.p1, R.drawable.p1, R.drawable.p1)
            val currentImage = getImage(cards)
            val name = getCorrectName(currentImage)
            //todo get user input
            //todo check if valid
            //todo if not valid tell user

            //Todo add correct gameActivity or incorrectActivity
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

    private fun getImage(cards: Array<Int>): Int {
        val indexDouble = Math.random()
        val indexInt = (indexDouble*10).toInt()
        return cards[indexInt]
    }

    /**
     * Application gets the correct name of the county based on the image name passed in
     * Todo method still needs to be implemented
     */
    private fun getCorrectName(image: Any): String {
        val imageName = image.toString()
        if (imageName.equals("p1.jpg")) {
            return ""

        } else if (imageName.equals("p1.jpg")) {
            return ""

        } else if (imageName.equals("p2.jpg")) {
            return ""

        } else if (imageName.equals("p3.jpg")) {
            return ""

        } else if (imageName.equals("p4.jpg")) {
            return ""

        } else if (imageName.equals("p5.jpg")) {
            return ""

        } else if (imageName.equals("p6.jpg")) {
            return ""

        } else if (imageName.equals("p7.jpg")) {
            return ""

        } else if (imageName.equals("p8.jpg")) {
            return ""

        } else if (imageName.equals("p9.jpg")) {
            return ""

        } else if (imageName.equals("p10.jpg")) {
            return ""

        } else if (imageName.equals("p11.jpg")) {
            return ""

        } else if (imageName.equals("p12.jpg")) {
            return ""

        } else if (imageName.equals("p13.jpg")) {
            return ""

        } else if (imageName.equals("p14.jpg")) {
            return ""

        } else if (imageName.equals("p15.jpg")) {
            return ""

        } else if (imageName.equals("p16.jpg")) {
            return ""

        } else if (imageName.equals("p17.jpg")) {
            return ""

        } else if (imageName.equals("p18.jpg")) {
            return ""

        } else if (imageName.equals("p19.jpg")) {
            return ""

        } else if (imageName.equals("p20.jpg")) {
            return ""

        } else if (imageName.equals("p21.jpg")) {
            return ""

        } else if (imageName.equals("p22.jpg")) {
            return ""

        } else if (imageName.equals("p23.jpg")) {
            return ""

        } else if (imageName.equals("p24.jpg")) {
            return ""

        } else if (imageName.equals("p25.jpg")) {
            return ""

        } else if (imageName.equals("p26.jpg")) {
            return ""

        } else if (imageName.equals("p27.jpg")) {
            return ""

        } else if (imageName.equals("p28.jpg")) {
            return ""

        } else if (imageName.equals("p29.jpg")) {
            return ""

        } else if (imageName.equals("p30.jpg")) {
            return ""

        } else if (imageName.equals("p31.jpg")) {
            return ""

        } else {
            return ""
        }
    }


}
