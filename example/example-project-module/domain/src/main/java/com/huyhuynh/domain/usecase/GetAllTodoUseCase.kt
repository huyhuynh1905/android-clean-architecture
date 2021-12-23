package com.huyhuynh.domain.usecase

import com.huyhuynh.domain.entity.Todo
import com.huyhuynh.domain.repository.TodoRepository

class GetAllTodoUseCase(private val todoRepository: TodoRepository) {

    fun executeGetAllTodo():List<Todo>{
        return todoRepository.getAllTodos()
    }
}