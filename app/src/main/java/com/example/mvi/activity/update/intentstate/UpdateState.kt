package com.example.mvi.activity.update.intentstate

import com.example.mvi.model.Post


sealed class UpdateState {
    object Init : UpdateState()
    object Loading : UpdateState()

    data class UpdatePost(val id: Int, val post: Post) : UpdateState()


    data class Error(val error: String) : UpdateState()


}