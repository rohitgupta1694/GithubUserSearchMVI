package com.rohit.githubusersearchmvi.di.components

import com.rohit.githubusersearchmvi.GithubUserSearchApplication
import com.rohit.githubusersearchmvi.data.di.UserSearchAPIModule
import com.rohit.githubusersearchmvi.di.modules.AppModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, AppModule::class,
    UserSearchAPIModule::class])
interface AppComponent : AndroidInjector<GithubUserSearchApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<GithubUserSearchApplication>()

}