package com.biskrareads.biskra

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startTheQuizButton.setOnClickListener {
            goToQuizActivity()
        }
    }

    private fun goToQuizActivity() {
        val name = nameEditText.text.toString().trim()
        if (name.isNotEmpty()) {
            val intent = Intent(this, QuizActivity::class.java)
            intent.putExtra(QuizActivity.KEY_NAME, name)
            startActivity(intent)
        } else {
            nameEditText.error = "Please enter a name."
        }
    }
}