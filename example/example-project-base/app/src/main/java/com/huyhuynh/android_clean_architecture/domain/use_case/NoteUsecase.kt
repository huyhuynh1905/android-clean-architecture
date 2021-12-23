package com.huyhuynh.android_clean_architecture.domain.use_case

class NoteUsecase(
    val addNoteUsecase: AddNoteUsecase,
    val getNotesUsecase: GetNotesUsecase,
    val updateNoteUsecase: UpdateNoteUsecase,
    val deleteNoteUsecase: DeleteNoteUsecase
) {
}