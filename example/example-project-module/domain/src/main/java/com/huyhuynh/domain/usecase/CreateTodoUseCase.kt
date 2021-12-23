package com.huyhuynh.domain.usecase

import com.huyhuynh.domain.entity.Todo
import com.huyhuynh.domain.repository.TodoRepository

class CreateTodoUseCase(private val todoRepository: TodoRepository) {

    fun executeCreateTodo(todo: Todo){
        todoRepository.addTodos(todo = todo)
    }
}