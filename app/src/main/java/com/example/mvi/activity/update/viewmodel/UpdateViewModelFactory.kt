package com.example.mvi.activity.update.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvi.activity.update.helper.UpdateHelper
import com.example.mvi.repository.UpdateRepository

class UpdateViewModelFactory(private val updateHelper: UpdateHelper): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(UpdateViewModel::class.java)) {
            return UpdateViewModel(UpdateRepository(updateHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }
}