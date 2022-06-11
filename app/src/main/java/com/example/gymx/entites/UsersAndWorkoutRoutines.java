package com.example.gymx.entites;

import androidx.room.Entity;

@Entity(
        primaryKeys ={"userId","workoutRoutines_Id"}
)
public class UsersAndWorkoutRoutines {
    public long userId;
    public long workoutRoutines_Id;
}
