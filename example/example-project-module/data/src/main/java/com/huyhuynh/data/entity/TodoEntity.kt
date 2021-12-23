package com.huyhuynh.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "todo")
data class TodoEntity(
    @PrimaryKey
    val id: String,

    @ColumnInfo(name = "tittle")
    val tittle: String,

    @ColumnInfo(name = "description")
    val description: String,

    @ColumnInfo(name = "is_done")
    val isDone: Boolean
)