package com.rohit.githubusersearchmvi.utils

import android.content.Context
import android.net.ConnectivityManager
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NetManager @Inject constructor(var applicationContext: Context) {

    val isConnectedToInternet: Boolean?
        get() {
            val connectionManager = applicationContext.getSystemService(Context.CONNECTIVITY_SERVICE)
                    as ConnectivityManager
            val networkInfo = connectionManager.activeNetworkInfo
            return networkInfo != null && networkInfo.isConnected
        }
}