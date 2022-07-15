package com.example.mvi.repository

import com.example.mvi.activity.update.helper.UpdateHelper
import com.example.mvi.model.Post


class UpdateRepository(private val updateHelper: UpdateHelper) {

    suspend fun updatePost(id: Int, post: Post) = updateHelper.updatePost(id, post)

}