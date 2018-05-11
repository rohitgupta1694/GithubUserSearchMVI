package com.rohit.githubusersearchmvi.di.modules

import android.content.Context
import com.rohit.githubusersearchmvi.GithubUserSearchApplication
import com.rohit.githubusersearchmvi.mainScreen.di.component.MainActivityComponent
import dagger.Module
import dagger.Provides

@Module(subcomponents = [MainActivityComponent::class])
class AppModule {

    @Provides
    fun providesContext(application: GithubUserSearchApplication): Context {
        return application.applicationContext
    }
}