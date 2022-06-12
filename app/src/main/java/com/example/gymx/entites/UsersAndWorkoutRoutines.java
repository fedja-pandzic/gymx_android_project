package com.example.gymx.entites;

import androidx.room.Entity;

@Entity(
        primaryKeys ={"userId","workoutRoutines_Id"}
)
public class UsersAndWorkoutRoutines {
    public long userId;
    public long workoutRoutines_Id;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getWorkoutRoutines_Id() {
        return workoutRoutines_Id;
    }

    public void setWorkoutRoutines_Id(long workoutRoutines_Id) {
        this.workoutRoutines_Id = workoutRoutines_Id;
    }

    public UsersAndWorkoutRoutines(long userId, long workoutRoutines_Id) {
        this.userId = userId;
        this.workoutRoutines_Id = workoutRoutines_Id;


    }
}
