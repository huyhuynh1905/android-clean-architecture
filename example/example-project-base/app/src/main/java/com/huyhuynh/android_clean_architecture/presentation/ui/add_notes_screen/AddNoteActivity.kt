package com.huyhuynh.android_clean_architecture.presentation.ui.add_notes_screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import com.huyhuynh.android_clean_architecture.BR
import com.huyhuynh.android_clean_architecture.R
import com.huyhuynh.android_clean_architecture.databinding.ActivityAddNoteBinding
import com.huyhuynh.android_clean_architecture.presentation.base.activity.BaseBindingActivity

class AddNoteActivity : BaseBindingActivity<ActivityAddNoteBinding,AddNoteViewModel>() {
    override val layoutResource: Int
        get() = R.layout.activity_add_note
    override val bindingVariable: Int
        get() = BR.viewModel
    override val viewModel: AddNoteViewModel by viewModels()

    override fun initVariable(saveInstanceState: Bundle?) {

    }

    override fun initData(saveInstanceState: Bundle?) {

    }
}