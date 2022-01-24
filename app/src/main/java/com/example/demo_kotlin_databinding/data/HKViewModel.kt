package com.example.demo_kotlin_databinding.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HKViewModel : ViewModel() {
    private val _name = MutableLiveData("1st - Name")
    private val _lastName = MutableLiveData("1st - FullName")
    private val _likes = MutableLiveData(0)


    val name: LiveData<String> = _name
    val lastName: LiveData<String> = _lastName
    var likes: LiveData<Int> = _likes
        private set

    fun onLikeClick(value: Boolean) {
        _likes.value = (_likes.value ?: 0) + (if (value) 1 else -1)
    }

    fun onChangedName(value: String) {
        _name.value = value
    }

    fun onChangedlastName(value: String) {
        _lastName.value = value
    }


}