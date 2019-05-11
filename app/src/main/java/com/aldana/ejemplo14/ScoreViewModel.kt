package com.aldana.ejemplo14

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*

class ScoreViewModel : ViewModel() {
     var scoreTeamA = MutableLiveData<Int>()
    var scoreTeamB = MutableLiveData<Int>()

    init {
        scoreTeamA.value = 0
        scoreTeamB.value = 0
    }
}