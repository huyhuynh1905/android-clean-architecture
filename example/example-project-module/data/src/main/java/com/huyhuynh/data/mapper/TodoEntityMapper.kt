package com.huyhuynh.data.mapper

import com.huyhuynh.data.entity.TodoEntity
import com.huyhuynh.domain.entity.Todo

class TodoEntityMapper {
    fun mapToToDoEntiry(todo: Todo): TodoEntity {
        return TodoEntity(todo.identify, todo.tittle, todo.description, todo.isDone)
    }

    fun mapToTodo(todoEntity: TodoEntity) : Todo{
        return Todo(todoEntity.id,todoEntity.tittle,todoEntity.description,todoEntity.isDone)
    }
}