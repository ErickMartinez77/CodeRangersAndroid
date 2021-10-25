package edu.upb.coderangersandroid.ui.mainpage.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import edu.upb.coderangersandroid.data.UserDataSource
import edu.upb.coderangersandroid.model.User

class UserViewModel: ViewModel() {
    val user = MutableLiveData<User>(UserDataSource.getUser())

    fun updateUser(){
        user.postValue(user.value)
        UserDataSource.setUser(user.value)
    }
}