package com.huyhuynh.android_clean_architecture.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.huyhuynh.android_clean_architecture.data.local.dao.NoteDao
import com.huyhuynh.android_clean_architecture.domain.model.NoteEntity


@Database(entities = [NoteEntity::class], version = 2)
abstract class NoteDatabase : RoomDatabase() {

    abstract val noteDao: NoteDao

    companion object {
        const val DB_NAME = "Note_DB"
    }
}