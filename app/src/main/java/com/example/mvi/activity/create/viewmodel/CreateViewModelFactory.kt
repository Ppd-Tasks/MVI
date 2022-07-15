package com.example.mvi.activity.create.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

import com.example.mvi.activity.create.helper.CreateHelper
import com.example.mvi.repository.CreateRepository

class CreateViewModelFactory(private val mainHelper: CreateHelper): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CreateViewModel::class.java)) {
            return CreateViewModel(CreateRepository(mainHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }
}