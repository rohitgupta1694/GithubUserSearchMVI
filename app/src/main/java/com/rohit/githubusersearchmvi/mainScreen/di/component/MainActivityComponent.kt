package com.rohit.githubusersearchmvi.mainScreen.di.component

import com.rohit.githubusersearchmvi.di.scopes.ActivityScope
import com.rohit.githubusersearchmvi.mainScreen.MainActivity
import com.rohit.githubusersearchmvi.mainScreen.di.module.MainActivityModule
import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent(modules = [MainActivityModule::class])
@ActivityScope
interface MainActivityComponent : AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>()

}
