package com.example.mvi.activity.main.viewmodel

import android.view.View
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvi.activity.main.helper.MainHelper
import com.example.mvi.repository.PostRepository

class MainViewModelFactory(private val helper: MainHelper):ViewModelProvider.Factory {
    override fun <T :ViewModel> create(modelClass: Class<T>):T{
        if (modelClass.isAssignableFrom(MainViewModel::class.java)){
            return MainViewModel(PostRepository(helper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }
}
