package android_clean_architecture.ui.base.activity

import android.os.Bundle
import android.view.KeyEvent
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.huyhuynh.android_clean_architecture.R

abstract class BaseActivity : AppCompatActivity(){

    abstract val layoutResource: Int

    abstract fun initVariable(savedInstanceState: Bundle?)

    abstract fun initData(savedInstanceState: Bundle?)

    override fun onCreate(savedInstanceState: Bundle?) {
        //overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        window.setType(WindowManager.LayoutParams.TYPE_KEYGUARD_DIALOG)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        super.onCreate(savedInstanceState)
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode == KeyEvent.KEYCODE_HOME || keyCode == KeyEvent.KEYCODE_APP_SWITCH) {
            return false
        } else {
            return super.onKeyDown(keyCode, event)
        }
    }
}