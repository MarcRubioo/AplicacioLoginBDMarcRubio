package com.marcr.aplicaciologinbdmarcrubio

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedVM : ViewModel() {

    val message = MutableLiveData<String>()
    fun sendMessage(text: String) {
        message.value = text
    }
}