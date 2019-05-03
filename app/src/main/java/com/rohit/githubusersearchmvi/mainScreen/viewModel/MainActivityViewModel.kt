package com.rohit.githubusersearchmvi.mainScreen.viewModel

import com.rohit.githubusersearchmvi.data.api.UserSearchAPI
import retrofit2.Retrofit
import javax.inject.Inject

class MainActivityViewModel @Inject constructor(val userSearchAPI: UserSearchAPI) {

    fun getUserAPI(): String = userSearchAPI.toString()

}
