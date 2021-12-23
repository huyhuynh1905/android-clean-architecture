package com.huyhuynh.data.local;

import java.lang.System;

@androidx.room.Database(entities = {com.huyhuynh.data.entity.TodoEntity.class}, version = 1)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/huyhuynh/data/local/MyDatabase;", "Landroidx/room/RoomDatabase;", "()V", "todoDao", "Lcom/huyhuynh/data/local/dao/TodoEntityDao;", "Companion", "data_debug"})
public abstract class MyDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.huyhuynh.data.local.MyDatabase.Companion Companion = null;
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    private static volatile com.huyhuynh.data.local.MyDatabase INSTANCE;
    
    public MyDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.huyhuynh.data.local.dao.TodoEntityDao todoDao();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/huyhuynh/data/local/MyDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/huyhuynh/data/local/MyDatabase;", "getDatabase", "context", "Landroid/content/Context;", "data_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.huyhuynh.data.local.MyDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}