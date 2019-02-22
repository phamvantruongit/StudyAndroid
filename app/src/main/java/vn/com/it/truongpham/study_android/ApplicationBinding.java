//package vn.com.it.truongpham.databinding;
//
//import android.app.Application;
//import android.arch.persistence.room.Room;
//
//import vn.com.it.truongpham.databinding.data.AppDatabase;
//
//public class ApplicationBinding extends Application {
//    public static AppDatabase db;
//
//    public AppDatabase createDatabaseUser() {
//        if (db == null) {
//            return   db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "database-userEntity").allowMainThreadQueries().build();
//        }
//        return db;
//    }
//
//    @Override
//    public void onCreate() {
//        super.onCreate();
//        createDatabaseUser();
//
//    }
//}
