package com.huyhuynh.android_clean_architecture

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.gson.Gson

class MainApplication : Application() {
    var gSon: Gson? = null

    companion object {
        private var mContext: MainApplication? = null
        fun getInstance(): MainApplication {
            return mContext!!
        }
    }

    override fun onCreate() {
        super.onCreate()
        mContext = this
        gSon = Gson()
    }
}