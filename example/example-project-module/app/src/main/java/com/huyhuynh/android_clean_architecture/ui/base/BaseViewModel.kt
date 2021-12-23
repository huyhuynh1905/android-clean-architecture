package com.huyhuynh.qrcodeapplication.screen.base

import android.annotation.SuppressLint
import android.app.Application
import androidx.lifecycle.AndroidViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

abstract class BaseViewModel(application: Application) : AndroidViewModel(application){

//    protected val sharedPrefs = SharedPrefs.getInstance()
//
//    val myDatabase = MyDataBase.getDatabase(application)

    @SuppressLint("StaticFieldLeak")
    val contextApplication = application.applicationContext

    val compoDisposable = CompositeDisposable()

    protected fun getStringResource(int : Int) : String {
        return app.getString(int)
    }
    val app = application

    fun addDisposable(disposable: Disposable) {
        compoDisposable.add(disposable)
    }

    fun activityDestroyed() {
        compoDisposable.clear()
    }

}