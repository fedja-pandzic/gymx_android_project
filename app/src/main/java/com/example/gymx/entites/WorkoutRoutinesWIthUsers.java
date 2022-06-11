package com.example.gymx.entites;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import java.util.List;

public class WorkoutRoutinesWIthUsers {
    @Embedded public WorkoutRoutines workoutRoutines;
    @Relation(
            parentColumn = "workoutRoutines_Id",
            entityColumn = "usertId",
            associateBy = @Junction(UsersAndWorkoutRoutines.class)
    )
    public List<Users> users;
}

