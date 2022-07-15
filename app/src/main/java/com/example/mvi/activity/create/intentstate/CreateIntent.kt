package com.example.mvi.activity.create.intentstate

import com.example.mvi.model.Post


sealed class CreateIntent {
    data class CreatePost(val post: Post): CreateIntent()
}