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
    lateinit var btSignUpGoogle : View;
    lateinit var btSignUpTwitter : View;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_login)
        btSignUpFacebook = findViewById(R.id.imageFacebook);
        btSignUpTwitter = findViewById(R.id.imageView6);
        btSignUpGoogle = findViewById(R.id.imageView7);
        supportActionBar?.hide()
        btSignUpFacebook.setOnClickListener {
            val intent = Intent(this, MainPageActivity::class.java)
            startActivity(intent)
        }
        btSignUpGoogle.setOnClickListener {
            val intent = Intent(this, MainPageActivity::class.java)
            startActivity(intent)
        }
        btSignUpTwitter.setOnClickListener {
            val intent = Intent(this, MainPageActivity::class.java)
            startActivity(intent)
        }
    }
}