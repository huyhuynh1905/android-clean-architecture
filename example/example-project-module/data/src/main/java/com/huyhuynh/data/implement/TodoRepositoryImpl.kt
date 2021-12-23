package com.huyhuynh.data.implement

import com.huyhuynh.data.entity.TodoEntity
import com.huyhuynh.data.local.dao.TodoEntityDao
import com.huyhuynh.data.mapper.TodoEntityMapper
import com.huyhuynh.domain.entity.Todo
import com.huyhuynh.domain.repository.TodoRepository
import java.util.*

class TodoRepositoryImpl(private val todoEntityDao: TodoEntityDao,
                         private val mapper: TodoEntityMapper) : TodoRepository {

    val todoList = mutableListOf<Todo>()

    override fun addTodos(todo: Todo) {
        val id = UUID.randomUUID().toString().substring(0,5)
        todoEntityDao.insertTodo(mapper.mapToToDoEntiry(todo.copy(identify = id)))
        //todoList.add(todo.copy(identify = id))
    }

    override fun getAllTodos(): List<Todo> {
        var listTodo = todoEntityDao.getAllTodos()
        return listTodo.map {
            mapper.mapToTodo(it)
        }
        //return  todoList
    }
}