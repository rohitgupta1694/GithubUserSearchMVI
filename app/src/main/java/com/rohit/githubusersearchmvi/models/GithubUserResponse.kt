package com.rohit.githubusersearchmvi.models

import com.google.gson.annotations.SerializedName

data class GithubUserResponse(

        @field:SerializedName("total_count")
        val totalCount: Int? = null,

        @field:SerializedName("incomplete_results")
        val incompleteResults: Boolean? = null,

        @field:SerializedName("user")
        val user: List<UserItem?>? = null
)