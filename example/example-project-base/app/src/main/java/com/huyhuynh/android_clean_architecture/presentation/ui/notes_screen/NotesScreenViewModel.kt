package com.huyhuynh.android_clean_architecture.presentation.ui.notes_screen

import android.app.Application
import androidx.databinding.ObservableArrayList
import androidx.lifecycle.viewModelScope
import com.huyhuynh.android_clean_architecture.di.AppModule
import com.huyhuynh.android_clean_architecture.domain.model.NoteEntity
import com.huyhuynh.android_clean_architecture.presentation.base.BaseViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

class NotesScreenViewModel @Inject constructor(
    application: Application
):BaseViewModel(application) {

    var noteList: ObservableArrayList<NoteEntity> = ObservableArrayList()

    init {
        loadListNoteFromDB()
    }

    fun deleteNote(noteEntity: NoteEntity){
        viewModelScope.launch {
            AppModule.providerNotes(app).deleteNoteUsecase.invoke(noteEntity)
            noteList.remove(noteEntity)
        }
    }

    fun loadListNoteFromDB(){
        viewModelScope.launch {
            AppModule.providerNotes(app).getNotesUsecase.invoke().collect{
                noteList.clear()
                noteList.addAll(it)
            }
        }
    }
}