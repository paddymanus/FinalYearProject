package com.example.paddy.finalyearproject.adapters;

import java.util.ArrayList;


import com.example.paddy.finalyearproject.models.ExerciseSet;

public class ExerciseSetNew {
    private final ArrayList<ExerciseSet> exercises = new ArrayList<ExerciseSet>();

    public void add(ExerciseSet exercise) {
        exercises.add(exercise);
    }

    public String getType() {
        return exercises.get(0).getName();
    }

//    public String getStats() {
//        String result = "";
//        for (ExerciseSet exercise: exercises) {
//            if (result.length() != 0) {
//                result = result.concat(", ");
//            }
//            result = result.concat(String.valueOf(exercise.getWeight())
//                    + "×" + String.valueOf(exercise.getReps()));
//        }
//        return result;
//    }
}