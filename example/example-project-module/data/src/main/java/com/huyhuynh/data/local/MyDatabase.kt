package com.huyhuynh.data.local

import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.huyhuynh.data.entity.TodoEntity
import com.huyhuynh.data.local.dao.TodoEntityDao

@Database(entities = [TodoEntity::class], version = 1)
abstract class MyDatabase : RoomDatabase() {

    abstract fun todoDao() : TodoEntityDao

    companion object {
        @RequiresApi(Build.VERSION_CODES.M)
        @Volatile
        private var INSTANCE: MyDatabase? = null
        fun getDatabase(context: Context): MyDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MyDatabase::class.java,
                    "my_database")
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build()
                INSTANCE = instance
                // return instance
                instance
            }
        }
    }
}