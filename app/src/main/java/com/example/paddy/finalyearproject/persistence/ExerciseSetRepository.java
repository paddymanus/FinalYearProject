package com.example.paddy.finalyearproject.persistence;

import android.arch.lifecycle.LiveData;
import android.content.Context;

import com.example.paddy.finalyearproject.async.InsertSetAsyncTask;
import com.example.paddy.finalyearproject.models.ExerciseSet;

import java.util.List;

public class ExerciseSetRepository {

    private ExerciseSetDatabase mExerciseSetDatabase;

    public ExerciseSetRepository(Context context) {
        mExerciseSetDatabase = ExerciseSetDatabase.getInstance(context);
    }

    public void insertSetTask(ExerciseSet exerciseSet){
        new InsertSetAsyncTask(mExerciseSetDatabase.getExerciseSetDao()).execute(exerciseSet);
    }

    public void updateSet(ExerciseSet exerciseSet){

    }

    public LiveData<List<ExerciseSet>> retrieveSetTask(){

        return mExerciseSetDatabase.getExerciseSetDao().getExerciseSets();
    }

    public void deleteSet(ExerciseSet exerciseSet){

    }
}
