package com.example.mvi.activity.update.helper

import com.example.mvi.model.Post


interface UpdateHelper {

    suspend fun updatePost(id: Int, post: Post): Post
}