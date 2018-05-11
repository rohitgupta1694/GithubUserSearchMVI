package com.rohit.githubusersearchmvi.mainScreen

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.rohit.githubusersearchmvi.R
import com.rohit.githubusersearchmvi.mainScreen.viewModel.MainActivityViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mainActivityViewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
