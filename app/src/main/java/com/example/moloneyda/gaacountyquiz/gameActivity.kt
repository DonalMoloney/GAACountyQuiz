package com.example.moloneyda.gaacountyquiz

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_game.*
import java.util.*

class gameActivity : AppCompatActivity() {
    var score = findViewById<TextView>(R.id.scoreViewA2)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        val enterBtn = findViewById<Button>(R.id.enterBtnA2)
        score
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

            //todo set image
            val userInput = getUserInput()
            val isValid = checkValid(name, userInput as String)
            if (isValid == true) {
                handleSuccess()
            } else {
                handleError(name, userInput)
            }
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

    private fun handleError(name: String, userInput: String) {
        val intent = Intent(this, incorrectActivity::class.java)
        intent.putExtra(name, userInput)
        startActivity(intent)
    }


    private fun handleSuccess() {
        Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "+1", Toast.LENGTH_SHORT).show()
        //todo increment up 1
        val temp = score.text
        val tempNumerator = temp[0].toInt() + 1
        val tempDenominator = temp[2].toInt() + 1
        val newScore = "$tempNumerator / $tempDenominator"
        score.text = newScore

    }

    private fun checkValid(name: String, userInput: String): Any {
        println(name)
        println(userInput)
        return name.equals(userInput)
    }

    private fun getUserInput(): Any {
        var temp = editText.text.toString()
        println(temp)
        return temp
    }

    private fun getImage(cards: Array<Int>): Int {
//        val indexDouble = Math.random()
//        val indexInt = (indexDouble * 10).toInt()
//        return cards[indexInt]
        return cards[0]

    }

    /**
     * Application gets the correct name of the county based on the image name passed in
     * Todo method still needs to be implemented
     */
    private fun getCorrectName(image: Any): String {
        return "Roscommon"
//        val imageName = image.toString()
//        if (imageName.equals("p1.jpg")) {
//            return ""
//
//        } else if (imageName.equals("p1.jpg")) {
//            return ""
//
//        } else if (imageName.equals("p2.jpg")) {
//            return ""
//
//        } else if (imageName.equals("p3.jpg")) {
//            return ""
//
//        } else if (imageName.equals("p4.jpg")) {
//            return ""
//
//        } else if (imageName.equals("p5.jpg")) {
//            return ""
//
//        } else if (imageName.equals("p6.jpg")) {
//            return ""
//
//        } else if (imageName.equals("p7.jpg")) {
//            return ""
//
//        } else if (imageName.equals("p8.jpg")) {
//            return ""
//
//        } else if (imageName.equals("p9.jpg")) {
//            return ""
//
//        } else if (imageName.equals("p10.jpg")) {
//            return ""
//
//        } else if (imageName.equals("p11.jpg")) {
//            return ""
//
//        } else if (imageName.equals("p12.jpg")) {
//            return ""
//
//        } else if (imageName.equals("p13.jpg")) {
//            return ""
//
//        } else if (imageName.equals("p14.jpg")) {
//            return ""
//
//        } else if (imageName.equals("p15.jpg")) {
//            return ""
//
//        } else if (imageName.equals("p16.jpg")) {
//            return ""
//
//        } else if (imageName.equals("p17.jpg")) {
//            return ""
//
//        } else if (imageName.equals("p18.jpg")) {
//            return ""
//
//        } else if (imageName.equals("p19.jpg")) {
//            return ""
//
//        } else if (imageName.equals("p20.jpg")) {
//            return ""
//
//        } else if (imageName.equals("p21.jpg")) {
//            return ""
//
//        } else if (imageName.equals("p22.jpg")) {
//            return ""
//
//        } else if (imageName.equals("p23.jpg")) {
//            return ""
//
//        } else if (imageName.equals("p24.jpg")) {
//            return ""
//
//        } else if (imageName.equals("p25.jpg")) {
//            return ""
//
//        } else if (imageName.equals("p26.jpg")) {
//            return ""
//
//        } else if (imageName.equals("p27.jpg")) {
//            return ""
//
//        } else if (imageName.equals("p28.jpg")) {
//            return ""
//
//        } else if (imageName.equals("p29.jpg")) {
//            return ""
//
//        } else if (imageName.equals("p30.jpg")) {
//            return ""
//
//        } else if (imageName.equals("p31.jpg")) {
//            return ""
//
//        } else {
//            return ""
//        }
    }


}
