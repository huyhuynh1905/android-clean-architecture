package com.huyhuynh.domain.repository

import com.huyhuynh.domain.entity.Todo

interface TodoRepository {
    fun addTodos(todo: Todo)
    fun getAllTodos(): List<Todo>
}