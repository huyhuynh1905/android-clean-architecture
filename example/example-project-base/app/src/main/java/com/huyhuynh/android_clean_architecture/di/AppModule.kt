package com.huyhuynh.android_clean_architecture.di

import android.app.Application
import androidx.room.Room
import com.huyhuynh.android_clean_architecture.data.local.NoteDatabase
import com.huyhuynh.android_clean_architecture.data.repository.NoteRepositoryImpl
import com.huyhuynh.android_clean_architecture.domain.repository.NoteRepository
import com.huyhuynh.android_clean_architecture.domain.use_case.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Provides
    @Singleton
    fun providerDatabase(application: Application) : NoteDatabase = Room.databaseBuilder(
        application,
        NoteDatabase::class.java,
        NoteDatabase.DB_NAME
    ).build()

    @Provides
    @Singleton
    fun providerNoteRepository(noteDatabase: NoteDatabase) : NoteRepository = NoteRepositoryImpl(
        noteDao = noteDatabase.noteDao
    )

    @Provides
    @Singleton
    fun providerNoteUsecase(noteRepository: NoteRepository) : NoteUsecase = NoteUsecase(
        addNoteUsecase = AddNoteUsecase(noteRepository),
        updateNoteUsecase = UpdateNoteUsecase(noteRepository),
        deleteNoteUsecase = DeleteNoteUsecase(noteRepository),
        getNotesUsecase = GetNotesUsecase(noteRepository)
    )

    @Provides
    @Singleton
    fun providerNotes(application: Application) = providerNoteUsecase(providerNoteRepository(providerDatabase(application)))


}