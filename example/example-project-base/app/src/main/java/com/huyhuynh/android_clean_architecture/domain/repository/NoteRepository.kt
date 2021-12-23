package com.huyhuynh.android_clean_architecture.domain.repository

import com.huyhuynh.android_clean_architecture.domain.model.NoteEntity
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    fun getDataNotes() : Flow<List<NoteEntity>>

    suspend fun addNote(note: NoteEntity)

    suspend fun updateNote(note: NoteEntity)

    suspend fun deleteNote(note: NoteEntity)
}