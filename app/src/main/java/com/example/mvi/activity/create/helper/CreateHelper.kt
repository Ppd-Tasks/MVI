package com.example.mvi.activity.create.helper

import com.example.mvi.model.Post


interface CreateHelper {

    suspend fun createPost(post: Post): Post
}