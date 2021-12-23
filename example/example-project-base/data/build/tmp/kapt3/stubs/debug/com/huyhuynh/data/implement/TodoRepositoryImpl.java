package com.huyhuynh.data.implement;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0011"}, d2 = {"Lcom/huyhuynh/data/implement/TodoRepositoryImpl;", "Lcom/huyhuynh/domain/repository/TodoRepository;", "todoEntityDao", "Lcom/huyhuynh/data/local/dao/TodoEntityDao;", "mapper", "Lcom/huyhuynh/data/mapper/TodoEntityMapper;", "(Lcom/huyhuynh/data/local/dao/TodoEntityDao;Lcom/huyhuynh/data/mapper/TodoEntityMapper;)V", "todoList", "", "Lcom/huyhuynh/domain/entity/Todo;", "getTodoList", "()Ljava/util/List;", "addTodos", "", "todo", "getAllTodos", "", "data_debug"})
public final class TodoRepositoryImpl implements com.huyhuynh.domain.repository.TodoRepository {
    private final com.huyhuynh.data.local.dao.TodoEntityDao todoEntityDao = null;
    private final com.huyhuynh.data.mapper.TodoEntityMapper mapper = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.huyhuynh.domain.entity.Todo> todoList = null;
    
    public TodoRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.huyhuynh.data.local.dao.TodoEntityDao todoEntityDao, @org.jetbrains.annotations.NotNull()
    com.huyhuynh.data.mapper.TodoEntityMapper mapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.huyhuynh.domain.entity.Todo> getTodoList() {
        return null;
    }
    
    @java.lang.Override()
    public void addTodos(@org.jetbrains.annotations.NotNull()
    com.huyhuynh.domain.entity.Todo todo) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.huyhuynh.domain.entity.Todo> getAllTodos() {
        return null;
    }
}