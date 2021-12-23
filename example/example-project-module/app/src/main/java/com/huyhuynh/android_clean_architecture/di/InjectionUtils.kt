package com.huyhuynh.android_clean_architecture.di

import android.app.Activity
import com.huyhuynh.android_clean_architecture.MainApplication
import com.huyhuynh.android_clean_architecture.ui.TodosActivity
import com.huyhuynh.android_clean_architecture.ui.TodosActivityViewModel
import com.huyhuynh.data.implement.TodoRepositoryImpl
import com.huyhuynh.data.local.MyDatabase
import com.huyhuynh.data.local.dao.TodoEntityDao
import com.huyhuynh.data.mapper.TodoEntityMapper
import com.huyhuynh.domain.repository.TodoRepository
import com.huyhuynh.domain.usecase.CreateTodoUseCase
import com.huyhuynh.domain.usecase.GetAllTodoUseCase

object InjectionUtils {
    val database : MyDatabase by lazy {
        MyDatabase.getDatabase(MainApplication.getInstance().applicationContext)
    }

    val todoDao: TodoEntityDao by lazy {
        database.todoDao()
    }

    val repoImpl : TodoRepository by lazy {
        TodoRepositoryImpl(todoDao, TodoEntityMapper())
    }

    val getAllTodo : GetAllTodoUseCase by lazy {
        GetAllTodoUseCase(repoImpl)
    }

    val createTodo : CreateTodoUseCase by lazy {
        CreateTodoUseCase(repoImpl)
    }

    fun injection(activity: TodosActivityViewModel){
        activity.createTodo = createTodo
        activity.getAllTodo = getAllTodo
    }


}