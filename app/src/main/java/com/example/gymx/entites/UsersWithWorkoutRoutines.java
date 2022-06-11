package com.example.gymx.entites;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import java.util.List;

public class UsersWithWorkoutRoutines {
    @Embedded
    public Users users;
    @Relation(
            parentColumn = "usersId",
            entityColumn = "workout_Routines_Id",
            associateBy = @Junction(UsersAndWorkoutRoutines.class)
    )
    public List<WorkoutRoutines> workoutRoutines;
}

