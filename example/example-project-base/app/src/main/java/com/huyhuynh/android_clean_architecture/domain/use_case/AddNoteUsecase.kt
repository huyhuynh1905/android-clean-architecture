package com.huyhuynh.android_clean_architecture.domain.use_case

import com.huyhuynh.android_clean_architecture.domain.model.NoteEntity
import com.huyhuynh.android_clean_architecture.domain.repository.NoteRepository

class AddNoteUsecase(private val noteRepository: NoteRepository) {

    suspend operator fun invoke(noteEntity: NoteEntity) = noteRepository.addNote(noteEntity)

}