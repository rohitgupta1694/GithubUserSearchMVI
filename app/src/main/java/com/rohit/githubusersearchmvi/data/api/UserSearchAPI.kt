package com.rohit.githubusersearchmvi.data.api

import android.database.Observable
import com.rohit.githubusersearchmvi.data.models.GithubUserResponse
import com.rohit.githubusersearchmvi.di.scopes.ActivityScope
import retrofit2.http.GET
import retrofit2.http.Query

@ActivityScope
interface UserSearchAPI {

    @GET("search/users")
    fun getUsers(@Query("q") query: String,
                 @Query("page") page: Int = 1,
                 @Query("per_page") perPage: Int = 20): Observable<GithubUserResponse>

}