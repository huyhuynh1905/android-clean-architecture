package com.huyhuynh.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.huyhuynh.data.entity.TodoEntity

@Dao
interface TodoEntityDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTodo(todoEntity: TodoEntity)

    @Query("SELECT * FROM todo")
    fun getAllTodos(): List<TodoEntity>
}