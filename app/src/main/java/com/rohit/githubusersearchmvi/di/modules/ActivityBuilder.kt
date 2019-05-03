package com.rohit.githubusersearchmvi.di.modules

import com.rohit.githubusersearchmvi.mainScreen.MainActivity
import com.rohit.githubusersearchmvi.mainScreen.di.module.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun bindMainActivity(): MainActivity

}