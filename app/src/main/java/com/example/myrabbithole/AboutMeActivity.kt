package com.example.myrabbithole

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class AboutMeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_me)
        val backButton :ImageButton = findViewById(R.id.back_button)
        backButton.setOnClickListener {
            finish()
        }
    }
}