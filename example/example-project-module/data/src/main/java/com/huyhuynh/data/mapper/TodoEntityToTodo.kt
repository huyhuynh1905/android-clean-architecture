package com.huyhuynh.data.mapper

import com.huyhuynh.data.entity.TodoEntity
import com.huyhuynh.domain.entity.Todo

class TodoEntityToTodo {
    fun map(todoEntity: TodoEntity) : Todo{
        return Todo(todoEntity.id,todoEntity.tittle,todoEntity.description,todoEntity.isDone)
    }
}