package edu.upb.coderangersandroid.ui.mainpage.tabs.profile

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProfileViewModel: ViewModel() {
    val editModelEnable = MutableLiveData(false)
    val editableName = MutableLiveData<String>()
}