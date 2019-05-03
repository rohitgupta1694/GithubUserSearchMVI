package com.rohit.githubusersearchmvi.di.components

import com.rohit.githubusersearchmvi.GithubUserSearchApplication
import com.rohit.githubusersearchmvi.di.modules.ActivityBuilder
import com.rohit.githubusersearchmvi.di.modules.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [ActivityBuilder::class, AndroidSupportInjectionModule::class, AppModule::class])
interface AppComponent : AndroidInjector<GithubUserSearchApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<GithubUserSearchApplication>() {
        @BindsInstance
        abstract fun baseUrl(@Named("baseUrl1") baseUrl: String): Builder
    }

}