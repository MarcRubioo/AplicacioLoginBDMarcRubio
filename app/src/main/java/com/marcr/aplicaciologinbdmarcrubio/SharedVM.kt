package com.marcr.aplicaciologinbdmarcrubio

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel



class SharedVM : ViewModel() {

    val user = MutableLiveData<String>()
    fun pasarUser(text: String) {
        user.value = text
    }
}