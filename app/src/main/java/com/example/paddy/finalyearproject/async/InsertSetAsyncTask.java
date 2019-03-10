package com.example.paddy.finalyearproject.async;

import android.os.AsyncTask;
import com.example.paddy.finalyearproject.models.ExerciseSet;

import com.example.paddy.finalyearproject.persistence.ExerciseSetDao;

public class InsertSetAsyncTask extends AsyncTask<ExerciseSet, Void, Void> {

    private ExerciseSetDao mExerciseSetDao;

    public InsertSetAsyncTask(ExerciseSetDao dao) {
        mExerciseSetDao = dao;
    }

    @Override
    protected Void doInBackground(ExerciseSet... exerciseSets) {
        mExerciseSetDao.insertExerciseSets(exerciseSets);
        return null;
    }
}
