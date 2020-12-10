package ru.vladikadiroff.skillboxintensive.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class FirstLessonViewModel @Inject constructor(): ViewModel() {

    private val TAG = FirstLessonViewModel::class.java.name

    fun onClickButton(msg: String){
        Log.e(TAG, msg)
    }

}