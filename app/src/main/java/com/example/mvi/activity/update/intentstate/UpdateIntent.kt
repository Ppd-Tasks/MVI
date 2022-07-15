package com.example.mvi.activity.update.intentstate

import com.example.mvi.model.Post


sealed class UpdateIntent {

    data class UpdatePost(val id: Int, val post: Post): UpdateIntent()

}