package edu.upb.coderangersandroid.ui.login

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import edu.upb.coderangersandroid.R
import edu.upb.coderangersandroid.R.layout.activity_login
import edu.upb.coderangersandroid.databinding.ActivityLoginBinding
import edu.upb.coderangersandroid.databinding.FragmentFormBinding
import edu.upb.coderangersandroid.ui.mainpage.MainPageActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import java.time.Duration

class LoginActivity: AppCompatActivity()  {
    lateinit var btSignUpFacebook : View;
    lateinit var btSignUpGoogle : View;
    lateinit var btSignUpTwitter : View;
    lateinit var editTextEmail : TextView;
    lateinit var editTextPassword : TextView;
    lateinit var btLogin : View;
    private lateinit var binding : ActivityLoginBinding
    private val loginWithEmailViewModel: LoginWithEmailViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_login)
        btSignUpFacebook = findViewById(R.id.imageFacebook);
        btSignUpTwitter = findViewById(R.id.imageGoogle);
        btSignUpGoogle = findViewById(R.id.imageTwitter);
        btLogin = findViewById(R.id.btLogin)
        editTextEmail = findViewById(R.id.editTextTextEmailAddress)
        editTextPassword = findViewById(R.id.editTextTextPassword)
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

        btLogin.setOnClickListener{
            val username = editTextEmail.text.toString();
            val password = editTextPassword.text.toString()
            loginWithEmailViewModel.login(username,password).
            catch { Toast.makeText(this@LoginActivity, "Error: Inicio ", Toast.LENGTH_LONG).show() }.
            onEach { val intent = Intent(this, MainPageActivity::class.java)
                startActivity(intent) }.
            launchIn(CoroutineScope(Dispatchers.Main))
        }
    }
}