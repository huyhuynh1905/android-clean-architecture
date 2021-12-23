package com.huyhuynh.android_clean_architecture.presentation.base

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

abstract class BaseViewModel(application: Application) : AndroidViewModel(application) {

    val app = application
    val composDisposable = CompositeDisposable()

    protected fun getStringResource(idInt: Int) : String {
        return app.getString(idInt)
    }
    fun addDisposable(disposable: Disposable){
        composDisposable.add(disposable)
    }
    fun activityDestroyed(){
        composDisposable.clear()
    }

}