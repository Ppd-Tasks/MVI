package com.example.mvi.repository

import com.example.mvi.activity.create.helper.CreateHelper
import com.example.mvi.model.Post


class CreateRepository(private val createHelper: CreateHelper) {


    suspend fun createPost(post: Post) = createHelper.createPost(post)

}