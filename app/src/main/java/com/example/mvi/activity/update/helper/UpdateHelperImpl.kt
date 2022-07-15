package com.example.mvi.activity.update.helper

import com.example.mvi.model.Post
import com.example.mvi.network.PostService


class UpdateHelperImpl(private val postService: PostService): UpdateHelper {
    override suspend fun updatePost(id: Int, post: Post): Post {
        return postService.updatePost(id, post)
    }

}