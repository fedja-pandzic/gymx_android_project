package com.example.gymx.entites;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "workoutRoutines")
public class WorkoutRoutines {
    @PrimaryKey(autoGenerate = true) public     int workoutRoutines_id ;
  public String name;
     public String description;

    public WorkoutRoutines(int workoutRoutines_id, String name, String description) {
        this.workoutRoutines_id = workoutRoutines_id;
        this.name = name;
        this.description = description;
    }

    public int getWorkoutRoutines_id() {
        return workoutRoutines_id;
    }

    public void setWorkoutRoutines_id(int workoutRoutines_id) {
        this.workoutRoutines_id = workoutRoutines_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
