package com.huyhuynh.android_clean_architecture.ui

import android.app.Application
import android.util.Log
import android.widget.Toast
import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt
import androidx.databinding.ObservableList
import com.huyhuynh.android_clean_architecture.MainApplication
import com.huyhuynh.android_clean_architecture.di.InjectionUtils
import com.huyhuynh.domain.entity.Todo
import com.huyhuynh.domain.usecase.CreateTodoUseCase
import com.huyhuynh.domain.usecase.GetAllTodoUseCase
import com.huyhuynh.qrcodeapplication.screen.base.BaseViewModel
import java.util.*
import javax.inject.Inject

class TodosActivityViewModel @Inject constructor(application: Application) : BaseViewModel(application) {
    var edtTittleText: ObservableField<String> = ObservableField()
    var edtDesText: ObservableField<String> = ObservableField()
    var listTodos : ObservableList<Todo> = ObservableArrayList()
    var sizeList: ObservableField<String> = ObservableField()

    lateinit var getAllTodo: GetAllTodoUseCase
    lateinit var createTodo: CreateTodoUseCase

    init {
        //
        InjectionUtils.injection(this)
        refreshData()
    }

    fun onClickAddTodo(){
        Log.d("onClickAddTodo","Click onClickAddTodo")
        //add
        if (edtTittleText.get() != null && edtDesText.get() != null){
            val textTittle = edtTittleText.get().toString()
            val textDes = edtDesText.get().toString()
            Log.d("onClickAddTodo","Click isNotNullOrBlank")
            createTodo.executeCreateTodo(Todo("",textTittle,textDes,false))
            refreshData()
        } else {
            Log.d("onClickAddTodo","Click isNullOrBlank")
            Toast.makeText(contextApplication,"Hãy điền đầy đủ thông tin",Toast.LENGTH_SHORT).show()
        }
    }

    fun refreshData(){
        edtTittleText.set("")
        edtDesText.set("")
        listTodos.clear()
        listTodos.addAll(getAllTodo.executeGetAllTodo())
        sizeList.set(listTodos.toString())
    }
}