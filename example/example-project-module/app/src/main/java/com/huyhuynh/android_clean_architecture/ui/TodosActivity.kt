package com.huyhuynh.android_clean_architecture.ui

import android.os.Bundle
import android.widget.BaseAdapter
import android_clean_architecture.ui.base.activity.BaseBindingActivity
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.huyhuynh.android_clean_architecture.BR
import com.huyhuynh.android_clean_architecture.R
import com.huyhuynh.android_clean_architecture.databinding.ActivityTodosBinding

class TodosActivity : BaseBindingActivity<ActivityTodosBinding,TodosActivityViewModel>() {
    override val bindingVariable: Int
        get() = BR.viewModel
    override val viewModel: TodosActivityViewModel by viewModels()
    override val layoutResource: Int
        get() = R.layout.activity_todos

    override fun initVariable(savedInstanceState: Bundle?) {
        //
    }

    override fun initData(savedInstanceState: Bundle?) {
        //
    }

}