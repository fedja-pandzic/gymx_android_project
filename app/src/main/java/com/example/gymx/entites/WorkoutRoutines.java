package com.example.gymx.entites;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "workoutRoutines")
public class WorkoutRoutines {
    @PrimaryKey(autoGenerate = true) public     int workoutRoutines_id ;
  public String name;
     public String description;

}
