package com.rohit.githubusersearchmvi.mainScreen.di.module

import com.rohit.githubusersearchmvi.data.api.UserSearchAPI
import com.rohit.githubusersearchmvi.data.di.UserSearchAPIModule
import com.rohit.githubusersearchmvi.mainScreen.viewModel.MainActivityViewModel
import dagger.Module
import dagger.Provides

@Module(includes = [UserSearchAPIModule::class])
class MainActivityModule {

    @Provides
    fun providesMainActivityViewModel(userSearchAPI: UserSearchAPI): MainActivityViewModel {
        return MainActivityViewModel(userSearchAPI)
    }

}