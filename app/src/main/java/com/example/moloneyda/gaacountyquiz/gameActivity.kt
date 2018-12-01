package com.example.moloneyda.gaacountyquiz

import android.content.Intent
import android.content.res.Resources
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_game.*
import java.util.*

class gameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        var score = findViewById<TextView>(R.id.scoreViewA2)
        val enterBtn = findViewById<Button>(R.id.enterBtnA2)
        val quitBtn = findViewById<Button>(R.id.btnQuitA2)
        val cards = arrayOf(R.drawable.Donegal,R.drawable.Tipperary,R.drawable.antrim,R.drawable.armagh,
                R.drawable.carlow,R.drawable.cavan,R.drawable.clare,R.drawable.cork,R.drawable.derry,
                R.drawable.down,R.drawable.dublin,R.drawable.fermanagh,R.drawable.galway,R.drawable.kerry,
                R.drawable.kildare,R.drawable.kilkenny,R.drawable.laois,R.drawable.leitrim,R.drawable.limrick,
                R.drawable.longford,R.drawable.louth,R.drawable.mayo,R.drawable.meath,R.drawable.monaghan,
                R.drawable.sligo,R.drawable.tyrone,R.drawable.waterford,R.drawable.westmeath,R.drawable.wexford,
                R.drawable.wicklow)
        var imageInt = getImage(cards)
        imageViewGameA2.setImageResource(imageInt)
        enterBtn.setOnClickListener {
            val userInput = getUserInput()
            val correctName = getCorrectName(imageInt)
            val isValid = checkValid(correctName, userInput as String)
            if (isValid == true) {
                handleSuccess(score)
            } else {
                handleError(score, correctName, userInput, imageInt)
            }
            //Sets it to a new image
            imageInt = getImage(cards)
            this.imageViewGameA2.setImageResource(imageInt)
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

    private fun handleError(score:TextView, correctName: String, userInput: String, imageInt: Int) {
        Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show()
        val temp = (score.text).split("/")
        val tempNumerator = temp[0].toInt()
        val tempDenominator = temp[1].toInt() + 1
        val newScore = "$tempNumerator / $tempDenominator"
        score.text = newScore
        val intent = Intent(this, incorrectActivity::class.java)
        intent.putExtra("CorrectAnswer", correctName)
        intent.putExtra("InvalidValue", userInput)
        intent.putExtra("CorrectPicture", imageInt)
        startActivity(intent)
    }


    private fun handleSuccess(score: TextView) {
        Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "+1", Toast.LENGTH_SHORT).show()
        val temp = (score.text).split("/")
        //todo remove white space for both things
        val tempNumerator = temp[0].toInt() + 1
        val tempDenominator = temp[1].toInt() + 1
        val newScore = "$tempNumerator / $tempDenominator"
        score.text = newScore
    }


    private fun checkValid(name: String, userInput: String): Boolean {
        val tempName = userInput.toLowerCase()
        return tempName.equals(name)
    }

    private fun getUserInput(): String {
        var temp = editText.text.toString()
        return temp
    }

    private fun getImage(cards: Array<Int>): Int {
        val indexDouble = Math.random()
        val indexInt = (indexDouble * 10).toInt()
        return cards[indexInt]
    }

    /**
     * Application gets the correct name of the county based on the image name passed in
     * Todo method still needs to be implemented
     */
    private fun getCorrectName(image: Int): String {
        val imageString = (imageViewGameA2.resources.getResourceName(image)).toString()
        val splitString = imageString.split("/")
        return splitString[1]
    }


}
