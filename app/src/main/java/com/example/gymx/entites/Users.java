package com.example.gymx.entites;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "users")
public class Users {
    @PrimaryKey(autoGenerate = true) public int userId;
   public String name;
   public String surname;
    public String email;
    public int yearOfBirth;

}
