package com.example.mvi.activity.create.helper

import com.example.mvi.model.Post
import com.example.mvi.network.PostService


class CreateHelperImpl(private val postService: PostService): CreateHelper {

    override suspend fun createPost(post: Post): Post {
        return postService.createPost(post)
    }
}