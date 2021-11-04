package edu.upb.coderangersandroid.ui.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil.setContentView
import edu.upb.coderangersandroid.R
import edu.upb.coderangersandroid.ui.mainpage.MainPageActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class RegisterActivity: AppCompatActivity()  {
    lateinit var btRegister : Button;
    lateinit var editTextEmail : TextView;
    lateinit var editTextPassword : TextView;
    private val loginWithEmailViewModel: LoginWithEmailViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)
        supportActionBar?.hide()
        btRegister = findViewById(R.id.registerButton)
        editTextEmail = findViewById(R.id.editTextTextEmailAddress2)
        editTextPassword = findViewById(R.id.editTextTextPassword2)

        btRegister.setOnClickListener{
            val username = editTextEmail.text.toString();
            val password = editTextPassword.text.toString()
            loginWithEmailViewModel.register(username,password).
            catch { Toast.makeText(this@RegisterActivity, "Ya existe el usuario", Toast.LENGTH_LONG).show() }.
            onEach { val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent) }.
            launchIn(CoroutineScope(Dispatchers.Main))
        }

    }
}
