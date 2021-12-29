package com.huyhuynh.android_clean_architecture.presentation.ui.notes_screen

import android.app.Application
import android.widget.Toast
import com.huyhuynh.android_clean_architecture.di.AppModule
import com.huyhuynh.android_clean_architecture.presentation.base.BaseViewModel
import javax.inject.Inject

class NotesScreenViewModel @Inject constructor(application: Application):BaseViewModel(application) {
    init {
    }
}