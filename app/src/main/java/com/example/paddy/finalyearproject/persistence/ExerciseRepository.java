package com.example.paddy.finalyearproject.persistence;

import android.arch.lifecycle.LiveData;
import android.content.Context;

import com.example.paddy.finalyearproject.async.InsertAsyncTask;
import com.example.paddy.finalyearproject.models.Exercise;

import java.util.List;

public class ExerciseRepository {

    private ExerciseDatabase mExerciseDatabase;

    public ExerciseRepository(Context context) {
        mExerciseDatabase = ExerciseDatabase.getInstance(context);
    }

    public void insertExerciseTask(Exercise exercise){
        new InsertAsyncTask(mExerciseDatabase.getExerciseDao()).execute(exercise);
    }

    public void updateExerciseTask(Exercise exercise){

    }

    public LiveData<List<Exercise>> retrieveExerciseTask(){

        return mExerciseDatabase.getExerciseDao().getExercises();
    }

    public void deleteExercise(Exercise exercise){

    }
}
