package com.huyhuynh.android_clean_architecture.presentation.base.activity

import android.os.Bundle
import android.view.KeyEvent
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {
    abstract val layoutResource: Int

    abstract fun initVariable(saveInstanceState: Bundle?)

    abstract fun initData(saveInstanceState: Bundle?)

    override fun onCreate(savedInstanceState: Bundle?) {
        window.setType(WindowManager.LayoutParams.TYPE_KEYGUARD_DIALOG)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        super.onCreate(savedInstanceState)
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode == KeyEvent.KEYCODE_HOME || keyCode == KeyEvent.KEYCODE_APP_SWITCH){
            return false
        } else {
            return super.onKeyDown(keyCode, event)
        }
    }
}