package com.example.mvi.activity.create.intentstate

import com.example.mvi.model.Post


sealed class CreateState {
    object Init: CreateState()
    object Loading: CreateState()

    data class CreatePost(val post: Post): CreateState()

    data class Error(val error: String): CreateState()



}