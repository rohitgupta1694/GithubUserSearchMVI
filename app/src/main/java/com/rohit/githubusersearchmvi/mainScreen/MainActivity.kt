package com.rohit.githubusersearchmvi.mainScreen

import android.os.Bundle
import android.util.Log
import com.rohit.githubusersearchmvi.R
import com.rohit.githubusersearchmvi.mainScreen.viewModel.MainActivityViewModel
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var mainActivityViewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
