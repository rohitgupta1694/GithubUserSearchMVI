package com.rohit.githubusersearchmvi.di.modules

import android.content.Context
import com.rohit.githubusersearchmvi.GithubUserSearchApplication
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun providesContext(application: GithubUserSearchApplication): Context {
        return application.applicationContext
    }
}