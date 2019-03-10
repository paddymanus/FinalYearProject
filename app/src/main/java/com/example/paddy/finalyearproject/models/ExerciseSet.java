package com.example.paddy.finalyearproject.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "exerciseSets")
public class ExerciseSet {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "exerciseName")
    private String name;

    @ColumnInfo(name = "parameters")
    private String parameters;

    @ColumnInfo(name = "setNo")
    private String number;

    @ColumnInfo(name = "weight")
    private int weight;

    @ColumnInfo(name = "reps")
    private int reps;


//  private ArrayList<ExerciseSet> mExerciseSets = new ArrayList<>();
    //ExexerciseSet set("name", 0, 0, 0);


    public ExerciseSet(String name, String parameters, String number, int weight, int reps) {
        this.name = name;
        this.parameters = parameters;
        this.number = number;
        this.weight = weight;
        this.reps = reps;
    }

    @Ignore
    public ExerciseSet() {
    }

//    public void setExerciseSets(ArrayList<ExerciseSet> exerciseSets) {
//        mExerciseSets = exerciseSets;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getWeight() { return weight; }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }


    @Override
    public String toString() {
        return "ExerciseSet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parameters='" + parameters + '\'' +
                ", number='" + number + '\'' +
                ", weight=" + weight +
                ", reps=" + reps +
                '}';
    }
}
