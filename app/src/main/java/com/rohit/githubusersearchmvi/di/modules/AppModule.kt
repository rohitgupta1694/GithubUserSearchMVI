package com.rohit.githubusersearchmvi.di.modules

import android.content.Context
import com.rohit.githubusersearchmvi.GithubUserSearchApplication
import com.rohit.githubusersearchmvi.data.di.RetrofitConfigModule
import dagger.Module
import dagger.Provides

@Module(includes = [RetrofitConfigModule::class])
class AppModule {

    @Provides
    fun providesContext(application: GithubUserSearchApplication): Context {
        return application.applicationContext
    }
}