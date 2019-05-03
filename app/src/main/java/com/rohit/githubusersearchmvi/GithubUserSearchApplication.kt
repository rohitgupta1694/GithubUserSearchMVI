package com.rohit.githubusersearchmvi

import com.rohit.githubusersearchmvi.di.components.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class GithubUserSearchApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder()
                .baseUrl("https://google.com/")
                .create(this)
    }

}