package com.huyhuynh.android_clean_architecture.presentation.ui.notes_screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.google.android.material.snackbar.Snackbar
import com.huyhuynh.android_clean_architecture.BR
import com.huyhuynh.android_clean_architecture.R
import com.huyhuynh.android_clean_architecture.databinding.ActivityNotesScreenBinding
import com.huyhuynh.android_clean_architecture.presentation.base.activity.BaseBindingActivity

class NotesScreenActivity : BaseBindingActivity<ActivityNotesScreenBinding,NotesScreenViewModel>(){
    override val bindingVariable: Int
        get() = BR.viewModel

    override val viewModel: NotesScreenViewModel by viewModels()

    override val layoutResource: Int
        get() = R.layout.activity_notes_screen

    override fun initVariable(saveInstanceState: Bundle?) {
    }

    override fun initData(saveInstanceState: Bundle?) {
    }



}