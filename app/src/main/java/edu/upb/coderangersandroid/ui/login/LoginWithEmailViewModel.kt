package edu.upb.coderangersandroid.ui.login

import androidx.lifecycle.ViewModel
import edu.upb.coderangersandroid.data.user.UserRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.launchIn
import org.koin.java.KoinJavaComponent.inject

class LoginWithEmailViewModel: ViewModel() {
    private val userRepository by inject(UserRepository::class.java)

    fun login(username: String, password: String): Flow<Any>{
        return userRepository.login(username,password)
    }

}