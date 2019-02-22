package vn.com.it.truongpham.study_android.data;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities =  {UserEntity.class ,StudentEntity.class}   ,version = 1 )
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}


