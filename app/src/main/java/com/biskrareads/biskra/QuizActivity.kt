package com.biskrareads.biskra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_quiz.*

class QuizActivity : AppCompatActivity() {

    companion object {
        const val KEY_NAME = "NAME"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        val name = intent.getStringExtra(KEY_NAME)
        welcomeTextView.text = "Welcome to user: $name"

        evaluateButton.setOnClickListener {
            var result = 0
            if (radioGroupQuestionOne.checkedRadioButtonId == R.id.qstOneResponseOne) {
                result += 50
            }

            if (radioGroupQuestionTwo.checkedRadioButtonId == R.id.qstTwoResponseThree) {
                result += 50
            }

            Toast.makeText(this, "The result is $result%", Toast.LENGTH_SHORT).show()
        }
    }
}