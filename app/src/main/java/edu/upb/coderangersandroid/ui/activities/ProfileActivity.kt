package edu.upb.coderangersandroid.ui.activities

import android.content.Intent
import android.os.Bundle
import edu.upb.coderangersandroid.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Handler

class ProfileActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        supportActionBar?.hide()

    }
}