package com.rohit.githubusersearchmvi.data.di

import com.rohit.githubusersearchmvi.data.api.UserSearchAPI
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Named

@Module
class UserSearchAPIModule {

    @Provides
    fun provideUserSearchApi(@Named("retrofit") retrofit: Retrofit): UserSearchAPI = retrofit.create(UserSearchAPI::class.java)

}