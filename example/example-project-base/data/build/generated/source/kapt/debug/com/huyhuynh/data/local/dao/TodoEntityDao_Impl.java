package com.huyhuynh.data.local.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huyhuynh.data.entity.TodoEntity;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TodoEntityDao_Impl implements TodoEntityDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<TodoEntity> __insertionAdapterOfTodoEntity;

  public TodoEntityDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTodoEntity = new EntityInsertionAdapter<TodoEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `todo` (`id`,`tittle`,`description`,`is_done`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TodoEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getTittle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTittle());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        final int _tmp;
        _tmp = value.isDone() ? 1 : 0;
        stmt.bindLong(4, _tmp);
      }
    };
  }

  @Override
  public void insertTodo(final TodoEntity todoEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfTodoEntity.insert(todoEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<TodoEntity> getAllTodos() {
    final String _sql = "SELECT * FROM todo";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfTittle = CursorUtil.getColumnIndexOrThrow(_cursor, "tittle");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfIsDone = CursorUtil.getColumnIndexOrThrow(_cursor, "is_done");
      final List<TodoEntity> _result = new ArrayList<TodoEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final TodoEntity _item;
        final String _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getString(_cursorIndexOfId);
        }
        final String _tmpTittle;
        if (_cursor.isNull(_cursorIndexOfTittle)) {
          _tmpTittle = null;
        } else {
          _tmpTittle = _cursor.getString(_cursorIndexOfTittle);
        }
        final String _tmpDescription;
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _tmpDescription = null;
        } else {
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        }
        final boolean _tmpIsDone;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsDone);
        _tmpIsDone = _tmp != 0;
        _item = new TodoEntity(_tmpId,_tmpTittle,_tmpDescription,_tmpIsDone);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
