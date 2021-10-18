package edu.upb.coderangersandroid.ui.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProfileViewModel: ViewModel() {
    val editModelEnable = MutableLiveData(false)
    val editableName = MutableLiveData<String>()
}