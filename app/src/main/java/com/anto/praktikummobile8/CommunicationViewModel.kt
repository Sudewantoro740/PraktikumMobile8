package com.anto.praktikummobile8

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

//Live data instance
class CommunicationViewModel : ViewModel() {

    private val mName = MutableLiveData<String>()

    val name: LiveData<String>
        get() = mName

    fun setName(name: String) {
        mName.value = name
    }
}