package com.huyhuynh.android_clean_architecture.presentation.ui.add_notes_screen

import android.annotation.SuppressLint
import android.app.Application
import android.util.Log
import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.huyhuynh.android_clean_architecture.di.AppModule
import com.huyhuynh.android_clean_architecture.domain.model.NoteEntity
import com.huyhuynh.android_clean_architecture.presentation.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AddNoteViewModel @Inject constructor(
    application: Application
):BaseViewModel(application) {
    var titleNote: MutableLiveData<String> = MutableLiveData<String>().default("")
    var contentNote: MutableLiveData<String> = MutableLiveData<String>().default("")
    @SuppressLint("StaticFieldLeak")
    lateinit var addNoteActivity: AddNoteActivity

    init {

    }

    fun onClickAddNote(){
        val noteEntity = NoteEntity(titleNote.value.toString(),contentNote.value.toString(), System.currentTimeMillis())
        viewModelScope.launch {
            AppModule.providerNotes(app).addNoteUsecase.invoke(noteEntity)
            Log.d("onClickAddNote","onClickAddNote== title: ${titleNote.value} : ${contentNote.value}")
            addNoteActivity.let {
                it.finish()
            }
        }
    }
}