package com.example.gymx;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.gymx.entites.Users;
import com.example.gymx.entites.UsersAndWorkoutRoutines;
import com.example.gymx.entites.WorkoutRoutines;

@Database(
        entities = {
             Users.class,
                WorkoutRoutines.class,
                UsersAndWorkoutRoutines.class
        },

        version =1


)
public abstract class GymXDatabase extends RoomDatabase {

    private static final String DB_NAME = "GymX";
    private static GymXDatabase instance;

    public static synchronized GymXDatabase getInstance(Context context){
        if(instance!=null){
            instance = Room.databaseBuilder(context.getApplicationContext(),GymXDatabase.class,DB_NAME).allowMainThreadQueries().fallbackToDestructiveMigration().build();
        }
        return instance;
    }
    public abstract UsersDao  usersDao();
}
