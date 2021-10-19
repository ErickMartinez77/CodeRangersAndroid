package edu.upb.coderangersandroid.ui.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import edu.upb.coderangersandroid.R
import edu.upb.coderangersandroid.R.layout.activity_login
import edu.upb.coderangersandroid.ui.mainpage.MainPageActivity

class LoginActivity: AppCompatActivity()  {
    lateinit var btSignUpFacebook : View;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_login)
        btSignUpFacebook = findViewById(R.id.imageFacebook);
        supportActionBar?.hide()
        btSignUpFacebook.setOnClickListener {
            val intent = Intent(this, MainPageActivity::class.java)
           startActivity(intent)
        }
    }
}