package edu.upb.coderangersandroid.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import edu.upb.coderangersandroid.data.TempDataSource
import edu.upb.coderangersandroid.model.User

class PostViewModel: ViewModel() {
    val post = MutableLiveData(TempDataSource.getPostList())
}