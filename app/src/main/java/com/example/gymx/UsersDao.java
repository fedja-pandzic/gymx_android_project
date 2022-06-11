package com.example.gymx;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;

import com.example.gymx.entites.Users;
import com.example.gymx.entites.UsersWithWorkoutRoutines;
import com.example.gymx.entites.WorkoutRoutines;

import java.util.List;

@Dao
public interface UsersDao {
    @Transaction
    @Query("SELECT * FROM users")
    public List<UsersWithWorkoutRoutines> getUsersWithWorkoutRoutines();

    @Transaction
    @Query("SELECT * FROM workoutRoutines")
    public List<WorkoutRoutines> getWorkoutRoutinesWithUsers();
}
