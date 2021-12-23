package android_clean_architecture.ui.base.activity

import android.app.Activity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.huyhuynh.qrcodeapplication.screen.base.BaseViewModel

abstract class BaseBindingActivity<V : ViewDataBinding, M : BaseViewModel> : BaseActivity() {

    var viewDataBinding: V? = null

    abstract val bindingVariable: Int

    abstract val viewModel: M

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewDataBinding = DataBindingUtil.setContentView(this, layoutResource)
        viewDataBinding?.apply {
            setVariable(bindingVariable, viewModel)
            executePendingBindings()
            lifecycleOwner = this@BaseBindingActivity
        }
        initVariable(savedInstanceState)
        initData(savedInstanceState)
    }

    override fun onDestroy() {
        super.onDestroy()
        viewModel.activityDestroyed()
    }

    private fun setWindowFlag(activity: Activity, bits: Int, on: Boolean) {
        val win = activity.window
        val winParams = win.attributes
        if (on) {
            winParams.flags = winParams.flags or bits
        } else {
            winParams.flags = winParams.flags and bits.inv()
        }
        win.attributes = winParams
    }
}