package com.rohit.githubusersearchmvi.utils

import dagger.Reusable
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

@Reusable
class SchedulerProvider @Inject constructor() {

    fun provideComputationSchedular(): Scheduler = Schedulers.computation()

    fun provideIOScheduler(): Scheduler = Schedulers.io()

    fun provideMainUIThread(): Scheduler = AndroidSchedulers.mainThread()

}