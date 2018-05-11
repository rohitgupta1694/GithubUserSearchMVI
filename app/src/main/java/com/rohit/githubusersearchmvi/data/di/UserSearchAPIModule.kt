package com.rohit.githubusersearchmvi.data.di

import com.rohit.githubusersearchmvi.data.api.UserSearchAPI
import com.rohit.githubusersearchmvi.di.scopes.ActivityScope
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

@Module(includes = [RetrofitConfigModule::class])
@ActivityScope
class UserSearchAPIModule {

    @Provides
    @Singleton
    fun provideUserSearchApi(@Named("retrofit") retrofit: Retrofit): UserSearchAPI {
        return retrofit.create(UserSearchAPI::class.java)
    }

}