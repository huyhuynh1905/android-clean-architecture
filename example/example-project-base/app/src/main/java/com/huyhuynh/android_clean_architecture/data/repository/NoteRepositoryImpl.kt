package com.huyhuynh.android_clean_architecture.data.repository

import com.huyhuynh.android_clean_architecture.data.local.dao.NoteDao
import com.huyhuynh.android_clean_architecture.domain.model.NoteEntity
import com.huyhuynh.android_clean_architecture.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(private val noteDao: NoteDao) : NoteRepository {
    override fun getDataNotes(): Flow<List<NoteEntity>> {
        return noteDao.getNote()
    }

    override suspend fun addNote(note: NoteEntity) {
        return noteDao.addNote(note)
    }

    override suspend fun updateNote(note: NoteEntity) {
        return noteDao.updateNote(note)
    }

    override suspend fun deleteNote(note: NoteEntity) {
        return noteDao.deleteNote(note)
    }
}