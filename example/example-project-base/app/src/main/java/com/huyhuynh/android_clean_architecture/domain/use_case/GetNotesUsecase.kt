package com.huyhuynh.android_clean_architecture.domain.use_case

import com.huyhuynh.android_clean_architecture.domain.repository.NoteRepository

class GetNotesUsecase(private val noteRepository: NoteRepository) {

    operator fun invoke() = noteRepository.getDataNotes()
}